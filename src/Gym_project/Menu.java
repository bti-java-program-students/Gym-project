package Gym_project;

import java.io.IOException;
import java.util.Scanner;

class Menu {
    void startProgram() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Esamas klientas - spauskite 1");
            System.out.println("Naujas klientas - spauskite 2");
            System.out.println("Gauti duomenis - 3");
            System.out.println("Baigti programos darbą - spauskite 9");
            int Menu = input.nextInt();
            switch (Menu) {
                case 1:
                    System.out.println("Pasirinkta 1 - Esamas klientas");
                    new OldClient().gymTracker();
                    break;
                case 2:
                    System.out.println("Pasirinkta 2 - Naujas klientas");
                    new NewClient().newClientRegitration();
                    break;
                case 3:
                    System.out.println("check data");
                    checkData();
                    break;
                case 4:
                    System.out.println("Pasirinkta 3 - Programa baigė darbą");
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void checkData() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("ivest id: ");
        String id = input.next();
        String dirPath = "All_Clients/" + id;
        String path = dirPath +"/"+ id;
        System.out.println("1 - svoris, 2 - bmi, 3 - laikas");
        int col = input.nextInt();
        switch (col){
            case 1:
                new Reader().printData(path +".csv",3);
                break;
            case 2:
                new Reader().printData(path +".csv",4);
                break;
            case 3:
                new Reader().printData(path +".csv",5);
                break;
        }

    }
}
