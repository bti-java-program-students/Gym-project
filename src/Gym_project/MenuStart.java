package Gym_project;

import java.util.Scanner;

public class MenuStart {
    static void startProgram() {
        try (Scanner input = new Scanner(System.in)) {

            String Menu = "";
            System.out.println("Labas! Ir vėl nauja puiki diena!");
            System.out.println("Esamas klientas - spauskite 1");
            System.out.println("Naujas klientas - spauskite 2");
            System.out.println("Baigti programos darbą - spauskite 3");
            Menu = input.nextLine();
            switch (Menu) {
                case "1":
                    System.out.println("Pasirinkta 1 - Esamas klientas");
                    new NewClient().NewClientCaller();
                    startProgram();
                    break;
                case "2":
                    System.out.println("Pasirinkta 2 - Naujas klientas");
                    FirstInput.newInput();
                    break;
                case "3":
                    System.out.println("Pasirinkta 3 - Programa baigė darbą");
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
                    startProgram();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
