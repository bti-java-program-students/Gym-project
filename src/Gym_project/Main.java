package Gym_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();

    }


    private static void mainMenu() {
        int finger = 0;
        while (finger == 0) {

            String IDnumber;

            try (Scanner input = new Scanner(System.in)) {

                String Menu = "";
                String MenuOldCustomer = "";
                System.out.println("Labas!");
                System.out.println("Esamas klientas - spauskite 1");
                System.out.println("Naujas klientas - spauskite 2");
                System.out.println("Baigti programos darba - spauskite 3");
                Menu = input.nextLine();
                switch (Menu) {
                    case "1":
                        System.out.println("pasirinkta 1 - esamas klientas");
                        System.out.println("Suveskite esamo kliento ID numeri:");
                        IDnumber = input.nextLine();
                        System.out.println("suvestas ID: " + IDnumber);
                        System.out.println("Norite suvesti kliento duomenis - spauskite 1");
                        System.out.println("Norite paskaiciuoti kliento KMI - spauskite 2");
                        System.out.println("Norite issaugoti kliento duomenis - spauskite 3");
                        MenuOldCustomer = input.nextLine();
                        switch (MenuOldCustomer) {
                            case "1":
                                System.out.println("pasirinkta 1 - duomenu suvedimas");
//                            oldCustomer ();
                                break;
                            case "2":
                                System.out.println("pasirinkta 2 - KMI skaiciavimas");
//                            calcKMI ();
                                break;
                            case "3":
                                System.out.println("pasirinkta 3 - duomenu issaugojimas");
//                            dataInOut ();
                                break;
                            default:
                                System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");

                        }

//                    oldCustomer();
                        break;
                    case "2":
                        System.out.println("pasirinkta 2 - naujas klientas");
                        FirstInput fio = new FirstInput();
                        FirstInput.inputData();
                        System.out.println("bla bla bla");
                        break;
                    case "3":
                        System.out.println("pasirinkta 3 - programos darbas baigtas.");
                        finger = 1;
                        break;
                    default:
                        System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
                }


            } catch (Exception ex) {
                ex.printStackTrace();

            }
            System.out.println("nuejo iki galo!!!!");
        }
    }
}


