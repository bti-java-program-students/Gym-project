package Gym_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("0 - Pradėti");
        Scanner input = new Scanner(System.in);
        int exit = input.nextInt();
        boolean runInLoop = true;
        while (runInLoop) {
            new Menu().startProgram();
            if (exit == 9) {
                runInLoop = false;
            }
        }
    }
}