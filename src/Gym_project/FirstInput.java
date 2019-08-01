package Gym_project;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;


public class FirstInput {

    String name, familyName;
    Double age, height, weight;
    BMIndex bmi = new BMIndex();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        File clientDetails = new File("Clients.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(clientDetails, true));
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

        System.out.println("Enter date, format dd-mm-yyyy: ");
        String date = scan.nextLine();
        pw.println("Date: " + date);

        System.out.println("Enter name: ");
        String name = scan.next();
        pw.println("Name: " + name);

        System.out.println("Enter family name: ");
        String familyName = scan.next();
        pw.println("Family name: " + familyName);

        System.out.println("Enter weight: ");
        String datWeight = scan.next();
        double weight = Double.parseDouble(datWeight);
        pw.println("Weight, kg : " + weight);

        boolean repeat = false;
        do {
            try {
                System.out.println("Enter age: ");
                int age = scan.nextInt();
                pw.println("Age: " + age);
                repeat = true;
            } catch (InputMismatchException ex) {
                System.err.println("Invalid age please enter a whole number.");
                scan.next();
            }
        } while (repeat == false);
        do {
            try {
                System.out.println("Enter height: ");
                String datHeight = scan.next();
                double height = Double.parseDouble(datHeight);
                pw.println("Height, m : " + height);
                repeat = false;
            } catch (InputMismatchException | MissingFormatArgumentException | NumberFormatException ex) {
                System.err.println("Invalid height please enter a decimal.");
                scan.next();
            }
        } while (repeat);

        pw.close();
        scan.close();
    }

}
