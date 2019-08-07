package Gym_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstInput{

    String name, familyName, eMail;
    Double phoneNo;
    int id;


    public static void inputData() throws IOException {
        Scanner scan = new Scanner(System.in);
        File clientDetails = new File("Clients.csv");
        PrintWriter pw = new PrintWriter(new FileWriter(clientDetails, true));

        System.out.println("Enter name: ");
        String name = scan.next();
        while(!name.matches("[a-zA-Z ,]+")){
            System.out.println("Please retype name");
            name = scan.next();
        }
        pw.println("Name: " + name);

        System.out.println("Enter family name: ");
        String familyName = scan.next();
        pw.println("Family name: " + familyName);

        try {
            System.out.println("Enter phone No: ");
            String datPhone = scan.next();
            double phoneNo = Double.parseDouble(datPhone);
            pw.println("Phone No : " + phoneNo);
        } catch (InputMismatchException ex) {
            System.err.println("Invalid age please enter a whole number.");
            scan.next();
        }
        try {
            System.out.println("Enter email: ");
            String eMail = scan.next();
            String mail = String.format(eMail);
            pw.println("Email : " + eMail);
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

        scan.close();
        pw.close();

    }
}
