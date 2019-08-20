package Gym_project;

import java.io.IOException;
import java.util.Scanner;

class MenuStart {
    void startProgram() {
        int a = 0;
        while (a == 0) {
            try {
                System.out.println("Labas! Ir vėl nauja puiki diena!");
                System.out.println("Esamas klientas - spauskite 1");
                System.out.println("Naujas klientas - spauskite 2");
                System.out.println("Baigti programos darbą - spauskite 3");
                int Menu = 0;
                try {
                    Menu = Integer.parseInt(Input_Scanner.stringInput());
                } catch (Exception ex) {
                }
                switch (Menu) {
                    case 1:
                        System.out.println("Pasirinkta 1 - Esamas klientas");
                        new ExistingClient().addData();
                        break;
                    case 2:
                        System.out.println("Pasirinkta 2 - Naujas klientas");
                        new NewClient().newClientRegitration();
                        break;
                    case 3:
                        System.out.println("Pasirinkta 3 - Programa baigė darbą");
                        a = 1;
                        break;
                    default:
                        System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
