package Gym_project;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClientWeekSchedule extends Client {

    void gymSchedule() {
        System.out.println("savaitinis treniruociu tvarkarastis");
        try  {
            System.out.println("Įrašykite kliento id: ");
            this.setId(Input_Scanner.stringInput());
            String dirPath = "All_Clients/" + this.getId() + "/";
            String path = dirPath + this.getId() + "_schedule" + ".csv";
            System.out.println("Įrašykite kiek laiko (min) sportuoti PIRMADIENI ir kiek treniruokiu (vnt) ");
            int time1 = Input_Scanner.intInput();
            int trainer1 = Input_Scanner.intInput();
            System.out.println("Įrašykite kiek laiko (min) sportuoti ANTRADIENI ir kiek treniruokiu (vnt)  ");
            int time2 = Input_Scanner.intInput();
            int trainer2 = Input_Scanner.intInput();
            System.out.println("Įrašykite kiek laiko (min) sportuoti TRECIADIENI ir kiek treniruokiu (vnt) ");
            int time3 = Input_Scanner.intInput();
            int trainer3 = Input_Scanner.intInput();
            System.out.println("Įrašykite kiek laiko (min) sportuoti KETVIRTADIENI ir kiek treniruokiu (vnt) ");
            int time4 = Input_Scanner.intInput();
            int trainer4 = Input_Scanner.intInput();
            System.out.println("Įrašykite kiek laiko (min) sportuoti PENKTADIENI ir kiek treniruokiu (vnt) ");
            int time5 = Input_Scanner.intInput();
            int trainer5 = Input_Scanner.intInput();

            List<String> weekDays = Arrays.asList(
                    "<--------", "Kliento savaitinis treniruociu tvarkarastis", "----------->", "", "");
            String week = String.join("", weekDays);

            List<String> clientScheduleList = Arrays.asList(
                    "PIRMADIENIS:    ", String.valueOf(time1), " min treniruotis su treniruokliu kiekiu: ", String.valueOf(trainer1), "\n",
                    "ANTRADIENIS:    ", String.valueOf(time2), " min treniruotis su treniruokliu kiekiu: ", String.valueOf(trainer2), "\n",
                    "TRECIADIENIS:   ", String.valueOf(time3), " min treniruotis su treniruokliu kiekiu: ", String.valueOf(trainer3), "\n",
                    "KETVIRTADIENIS: ", String.valueOf(time4), " min treniruotis su treniruokliu kiekiu: ", String.valueOf(trainer4), "\n",
                    "PENKTADIENIS:   ", String.valueOf(time5), " min treniruotis su treniruokliu kiekiu: ", String.valueOf(trainer5));
            String scheduleList = String.join("", clientScheduleList);

            new ReaderWriter();
            ReaderWriter.writeToClientsCSV(path, week, scheduleList);

        } catch (Exception ex) {
            System.out.println("That's your problem---->" + ex);
        }
    }
}
