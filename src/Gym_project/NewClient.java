package Gym_project;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NewClient extends Client {

    private static boolean isValidEmail(String eMail) {
        String eMailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(eMailRegex);
        if (eMail == null)
            return false;
        return pat.matcher(eMail).matches();
    }

    private static boolean isValidTelNumber(String datPhone) {
        Pattern p = Pattern.compile("(370)?[3-6][0-9]{7}");
        Matcher m = p.matcher(datPhone);
        return (m.find() && m.group().equals(datPhone));
    }

    void newClientRegitration() {
        try (Scanner scan = new Scanner(System.in, "UTF-8")) {
            System.out.println("Įveskite vardą: ");
            this.setName(scan.next());
            while (!this.getName().matches("[a-zA-Z ĄąČčĘęĖėĮįŠšŲųŪūŽž]+")) {
                System.out.println("Blogai įvestas vardas, prašome pakartoti");
                this.setName(scan.next());
            }
            System.out.println("Įveskite pavardę: ");
            this.setSurname(scan.next());
            while (!this.getSurname().matches("[a-zA-Z ĄąČčĘęĖėĮįŠšŲųŪūŽž]+")) {
                System.out.println("Blogai įvesta pavardė, prašome pakartoti");
                this.setSurname(scan.next());
            }
            System.out.println("Įveskite telefono Nr. formatu: 37061234567: ");
            this.setPhone(scan.next());
            while (!isValidTelNumber(this.getPhone())) {
                System.out.println("Blogai įvestas numeris, prašome pakartoti");
                this.setPhone(scan.next());
            }
            System.out.println("Įveskite savo elektroninio pašto adresą: ");
            this.setEmail(scan.next());
            while (!isValidEmail(this.getEmail())) {
                System.out.println("Blogai įvestas elektroninio pašto adresas, prašome pakartoti");
                this.setEmail(scan.next());
            }

            System.out.println("Įrašykite ūgį, cm: ");
            this.setHeight(scan.nextDouble());
            System.out.println("Įrašykite svorį, kg: ");
            this.setWeight(scan.nextDouble());
            double BMI = new Counters().calcBMI(this.getHeight(), this.getWeight());
            this.setBMI(BMI);
            int idd = (int) (Math.random() * 10000);
            this.setId(MessageFormat.format("{0}{1}{2}", this.getName().charAt(0), this.getSurname().charAt(0), Integer.toString(idd)));
            System.out.println("Jūsų ID: " + this.getId() + " ,prašome jį išsisaugoti");
            sendInfoToClientsCSV();
            sendInfoToPersonalCSV();

            System.out.println("Duomenys įvesti, grįžtu į pradžią .....");
        } catch (Exception ex) {
            System.out.println("That's your problem---->" + ex);
        }
    }

    private void sendInfoToPersonalCSV() throws IOException {
        List<String> headList = Arrays.asList(
                "ID", "DATE", "HEIGHT", "WEIGHT", "BMI", "Time");
        String head = String.join(",", headList);
        String time = "registred";
        List<String> newClientInfoList = Arrays.asList(
                this.getId(), new LocalDate().getLocalDate(), String.valueOf(this.getHeight()),
                String.valueOf(this.getWeight()), String.valueOf(this.getBMI()), time);
        String clientInfo = String.join(",", newClientInfoList);
        String path = this.getId() + ".csv";
        new Writer();
        Writer.writeToClientsCSV(path, head, clientInfo);
    }

    private void sendInfoToClientsCSV() throws IOException {
        List<String> headList = Arrays.asList(
                "ID", "DATE", "NAME", "SURNAME", "PHONE", "EMAIL",
                "HEIGHT", "WEIGHT", "BMI", "TIME");
        String head = String.join(",", headList);
        List<String> newClientInfoList = Arrays.asList(
                this.getId(), new LocalDate().getLocalDate(), this.getName(), this.getSurname(),
                this.getPhone(), this.getEmail(), String.valueOf(this.getHeight()),
                String.valueOf(this.getWeight()), String.valueOf(this.getBMI()));
        String clientInfo = String.join(",", newClientInfoList);
        String path = "Clients.csv";
        new Writer();
        Writer.writeToClientsCSV(path, head, clientInfo);
    }
}
