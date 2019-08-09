package Gym_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startProgram();
    }

    static void startProgram() {
        try (Scanner input = new Scanner(System.in)) {

            String Menu = "";
            System.out.println("Labas!");
            System.out.println("Esamas klientas - spauskite 1");
            System.out.println("Naujas klientas - spauskite 2");
            System.out.println("Baigti programos darba - spauskite 3");
            Menu = input.nextLine();
            switch (Menu) {
                case "1":
                    System.out.println("pasirinkta 1 - Esamas klientas");
                    clientCaller();
                    startProgram();
                    break;
                case "2":
                    System.out.println("pasirinkta 2 - Naujas klientas");
                    FirstInput.newInput();
                    break;
                case "3":
                    System.out.println("pasirinkta 3 - Programos darbas baigtas.");
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
                    startProgram();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void clientCaller() {
        System.out.println("Pirmą kartą klube: ");
        System.out.println("T");
        System.out.println("N (dar neveik)");
        Scanner input = new Scanner(System.in);
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'T':
                new NewClient().NewClientCaller();
                break;
            case 'N':
                System.out.println();
                clientCaller(); // metodas, kai ne pirmą kartą kube
                break;
            default:
                System.out.println("neišsidirbinėk");
                clientCaller();
        }
    }
}
