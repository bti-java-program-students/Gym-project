package Gym_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class NewClient {

    Client client = new Client();
    double BMI;

    void NewClientCaller() {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        System.out.println("Įrašykite kliento id: ");
        client.setId(scanner.nextLine());
        System.out.println("Įrašykite kiek laiko sportavote, min: ");
        client.setTimeSpent(scanner.nextInt());
        System.out.println("Įrašykite ūgį, cm: ");
        client.setHeight(scanner.nextDouble());
        System.out.println("Įrašykite svorį, kg: ");
        client.setWeight(scanner.nextDouble());

        BMI = Counters.bodyMassIndexCounter(client.height, client.weight);

        File file = new File(client.getId() + ".txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            out.append(localDate + ": " + "ID: " + client.getId() + " | Time: " +
                    client.getTimeSpent() + " | Height: " + client.getHeight() +
                    " | Weight: " + client.getWeight() + " | BMI: " + BMI + System.lineSeparator());
            out.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
