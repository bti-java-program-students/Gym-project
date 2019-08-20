package Gym_project;

import java.io.IOException;

public class ExistingClient extends Client {
    void addData() throws IOException {
        System.out.println("Norite suvesti kliento duomenis - spauskite 4");
        System.out.println("Norite sudaryti kliento savaitini treniruociu tvarkarasti - spauskite 5");
        System.out.println("Peržiūrėti kliento BMI, svorį, laiką - spauskite 6");
        int Menu2 = 0;
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
                System.out.println("Pasirinkta 6 - Peržiūrėti kliento BMI, svorį, laiką");
                new CheckData().checkData();
                break;
            default:
                System.out.println("Neteisingas pasirinkimas. Bandykite dar karta =))");
        }
    }
}