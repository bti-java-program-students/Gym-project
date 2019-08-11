package Gym_project;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static Gym_project.MenuStart.startProgram;
import static java.lang.String.format;

class FirstInput {

    public static boolean isValidEmail(String eMail){
        String eMailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(eMailRegex);
        if (eMail == null)
            return false;
        return pat.matcher(eMail).matches();
    }
    public static boolean isValidTelNumber(String datPhone){
        Pattern p = Pattern.compile("(8/370)?[6][0-9]{7}");
        Matcher m = p.matcher(datPhone);
        return (m.find() && m.group().equals(datPhone));
    }

    static void newInput() {
        try(Scanner scan = new Scanner(System.in, "UTF-8")) {
            System.out.println("Įveskite vardą: ");
            String name = scan.next();
            while (!name.matches("[a-zA-Z ĄąČčĘęĖėĮįŠšŲųŪūŽž]+")) {
                System.out.println("Blogai įvestas vardas, prašome pakartoti");
                name = scan.next();
            }
            System.out.println("Įveskite pavardę: ");
            String familyName = scan.next();
            while (!familyName.matches("[a-zA-Z ĄąČčĘęĖėĮįŠšŲųŪūŽž]+")) {
                System.out.println("Blogai įvesta pavardė, prašome pakartoti");
                familyName = scan.next();
            }
            System.out.println("Įveskite telefono Nr. formatu: 370 61234567: ");
            String datPhone = scan.next();
            while (!isValidTelNumber(datPhone)) {
                System.out.println("Blogai įvestas numeris, prašome pakartoti");
                datPhone = scan.next();
            }
            System.out.println("Įveskite savo elektroninio pašto adresą: ");
            String eMail = scan.next();
            while (!isValidEmail(eMail)) {
                System.out.println("Blogai įvestas elektroninio pašto adresas, prašome pakartoti");
                eMail = scan.next();
            }
            int idd = (int) (Math.random() * 10000);
            String id = MessageFormat.format("{0}{1}{2}", name.charAt(0), familyName.charAt(0), Integer.toString(idd));
            System.out.println("Jūsų ID: " + id + " ,prašome jį išsisaugoti");

            StringBuilder head = new StringBuilder();
            head.append("Id");
            head.append(",");
            head.append("Name");
            head.append(",");
            head.append("Family Name");
            head.append(",");
            head.append("Phone");
            head.append(",");
            head.append("Email");

            StringBuilder clientInfo = new StringBuilder();
            clientInfo.append(id);
            clientInfo.append(',');
            clientInfo.append(name);
            clientInfo.append(',');
            clientInfo.append(familyName);
            clientInfo.append(',');
            clientInfo.append(datPhone);
            clientInfo.append(',');
            clientInfo.append(eMail);

            String path = "ClientsRegistred.csv";

            Writer.WriteInfoToCSV(head, clientInfo, path);

            System.out.println("Duomenys įvesti, grįžtu į pradžią .....");
            Thread.sleep(2000);
            startProgram();
        }   catch (Exception ex){
            System.out.println("That's your problem---->" + ex);
        }
    }
}
