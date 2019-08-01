package TEMP;

import java.util.Scanner;

public class DataInputScanner {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input name: ");
            String personName = input.next();
            System.out.println(personName);
            System.out.println("Input gender: ");
            String personGender = input.next();
            System.out.println(personGender);
            System.out.println("Input height in cm: ");
            int personHeight = input.nextInt();
            System.out.println(personHeight);

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
