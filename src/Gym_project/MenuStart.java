package Gym_project;

import java.util.Scanner;

class MenuStart {
    static void startProgram() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Labas! Ir vėl nauja puiki diena!");
            System.out.println("Esamas klientas - spauskite 1");
            System.out.println("Naujas klientas - spauskite 2");
            System.out.println("Baigti programos darbą - spauskite 3");
            int Menu = input.nextInt();
            switch (Menu) {
                case 1:
                    System.out.println("Pasirinkta 1 - Esamas klientas");
                    NewClient.FirstTimeInGym();
                    break;
                case 2:
                    System.out.println("Pasirinkta 2 - Naujas klientas");
                    FirstInput.newInput();
                    break;
                case 3:
                    System.out.println("Pasirinkta 3 - Programa baigė darbą");
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
