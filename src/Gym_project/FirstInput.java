package Gym_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Gym_project.Main.startProgram;
import static java.lang.String.format;

public class FirstInputValid {

    String name, familyName, eMail;
    Double phoneNo;
    int id;
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

    public static void newInput() throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        File clientDetails = new File("Clients.csv");
        PrintWriter pw = new PrintWriter(new FileWriter(clientDetails, true));

        System.out.println("Enter name: ");
        String name = scan.next();
        while (!name.matches("[a-zA-Z ,]+")) {
            System.out.println("Please retype name");
            name = scan.next();
        }
        pw.println("Name: " + name);

        System.out.println("Enter family name: ");
        String familyName = scan.next();
        while (!familyName.matches("[a-zA-Z ,]+")) {
            System.out.println("Please retype family name");
            familyName = scan.next();
        }
        pw.println("Family name: " + familyName);

        try {
            System.out.println("Enter mobile phone No (Country code, space , number): ");
            String datPhone = scan.next();
            String phone = format(datPhone);
            while (!isValidTelNumber(datPhone)) {
                System.out.println("Invalid entry retype phone number");
                pw.println("Email : " + datPhone);
                datPhone = scan.next();
            }
            pw.println("Phone No : " + datPhone);
        } catch (InputMismatchException ex) {
            System.err.println("Error.");
            scan.next();
        }
        try {
            System.out.println("Enter email: ");
            String eMail = scan.next();
            String mail = format(eMail);
            while (!isValidEmail(eMail)) {
                System.out.println("Invalid entry please retype email");
                pw.println("Email : " + eMail);
                eMail = scan.next();
            }

        } catch (InputMismatchException ex) {
            System.err.println("Invalid eMail please enter a correct one");
            scan.next();
        }

        int idd = (int) (Math.random() * 10000);
        String id = null;
        try {
            id = MessageFormat.format("{0}{1}{2}", name.charAt(0), familyName.charAt(0), Integer.toString(idd));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Customer id = " + id);
        pw.println("Client id = " + id);

//        scan.close();
        pw.close();
        System.out.println("Duomenys įvesti, grįžtu į pradžią .....");
        Thread.sleep(2000);
        startProgram();
    }
}
