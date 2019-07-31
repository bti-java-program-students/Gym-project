import java.io.*;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class FirstInput {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        File clientDetails = new File("Clients.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(clientDetails, true));

//        for (int i = 0; i < 6; i++) {

        System.out.println("Enter name: ");
        String name = scan.next();
        pw.println("Name: " + name);

        System.out.println("Enter family name: ");
        String familyName = scan.next();
        pw.println("Family name: " + familyName);

        System.out.println("Enter weight: ");
        double weight = scan.nextDouble();
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
                continue;
            }
        } while (repeat == false);
        do {
            try {
                System.out.println("Enter height: ");
                double height = scan.nextDouble();
                pw.println("Height, m : " + height);
                repeat = false;
            } catch (InputMismatchException | MissingFormatArgumentException ex) {
                System.err.println("Invalid height please enter a decimal.");
                scan.next();
                continue;
            }
        } while (repeat);

        pw.close();
        scan.close();
    }
}
