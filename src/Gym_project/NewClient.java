package Gym_project;

import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

import static Gym_project.MenuStart.startProgram;

class NewClient {

    static Client client = new Client();

    static void FirstTimeInGym() {
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDate localDate = LocalDate.now();
            System.out.println("Įrašykite kliento id: ");
            client.setId(scanner.nextLine());
            String path = client.getId() + ".csv";
            System.out.println("Įrašykite kiek laiko sportavote, min: ");
            client.setTimeSpent(scanner.nextInt());
            System.out.println("Įrašykite ūgį, cm: ");
            client.setHeight(scanner.nextDouble());
            System.out.println("Įrašykite svorį, kg: ");
            client.setWeight(scanner.nextDouble());
            client.setBMI(Counters.bodyMassIndexCounter(client.getHeight(), client.getWeight()));

            StringBuilder head = new StringBuilder();
            head.append("date");
            head.append(',');
            head.append("id");
            head.append(',');
            head.append("height");
            head.append(',');
            head.append("weight");
            head.append(',');
            head.append("BMI");
            head.append(',');
            head.append("TimeSpent");

            StringBuilder clientInfo = new StringBuilder();
            clientInfo.append(localDate);
            clientInfo.append(',');
            clientInfo.append(client.getId());
            clientInfo.append(',');
            clientInfo.append(client.getHeight());
            clientInfo.append(',');
            clientInfo.append(client.getWeight());
            clientInfo.append(',');
            clientInfo.append(client.getBMI());
            clientInfo.append(',');
            clientInfo.append(client.getTimeSpent());

            Writer.WriteInfoToCSV(head, clientInfo, path);
            startProgram();
        }  catch (Exception ex){
            System.out.println("That's your problem---->" + ex);
        }

    }
}
