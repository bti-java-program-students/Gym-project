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
                int Menu2 = 0;
                try {
                    Menu = Integer.parseInt(Input_Scanner.stringInput());
                } catch (Exception ex) {
                }
                switch (Menu) {
                    case 1:
                        System.out.println("Pasirinkta 1 - Esamas klientas");
                        System.out.println("Norite suvesti kliento duomenis - spauskite 4");
                        System.out.println("Norite sudaryti kliento savaitini treniruociu tvarkarasti - spauskite 5");
                        System.out.println("Peržiūrėti kliento BMI, svorį, laiką - spauskite 6");
                        break;
                    case 2:
                        System.out.println("Pasirinkta 2 - Naujas klientas");
                        new NewClient().newClientRegitration();
                        break;
                    case 3:
                        System.out.println("Pasirinkta 3 - Programa baigė darbą");
                        a = a + 1;
                        break;
                    default:
                        System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
                }
                try {
                    Menu2 = Integer.parseInt(Input_Scanner.stringInput());
                } catch (Exception ex) {
                }
                switch (Menu2) {
                    case 4:
                        System.out.println("Pasirinkta 4 - Norite suvesti kliento duomenis");
                        new OldClient().gymTracker();
                        break;
                    case 5:
                        System.out.println("Pasirinkta 5 - Norite sudaryti kliento savaitini treniruociu tvarkarasti");
                        new ClientWeekSchedule().gymSchedule();
                        break;
                    case 6:
                        checkData();
                        break;
                    default:
                        System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    void checkData() throws IOException {

        Scanner input = new Scanner(System.in);
        ReaderWriter getData = new ReaderWriter();
        System.out.println("Įvesti id: ");
        String id = input.next();
        String dirPath = "All_Clients/" + id;
        String path = dirPath +"/"+ id;
        System.out.println("1 - svoris, 2 - bmi, 3 - laikas");
        int col = input.nextInt();
        switch (col){
            case 1:
                getData.printData(path +".csv",3);
                break;
            case 2:
                getData.printData(path +".csv",4);
                break;
            case 3:
                getData.printData(path +".csv",5);
                break;
        }
    }
}
