package Gym_project;

import java.util.Scanner;

public class Input_Scanner {
    public static String stringInput (){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        return input;
    }
    public static int intInput(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
    public static double doubleInput(){
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        return input;
    }
    public static boolean hasNextDouble(){
        Scanner scan = new Scanner(System.in);
        boolean input = scan.hasNext();
        return input;
    }
}
