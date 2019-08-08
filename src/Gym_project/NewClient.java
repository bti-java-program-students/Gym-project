package Gym_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class NewClient extends Client {

    NewClient() {
        super();
    }

    void NewClientCaller() {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        System.out.println("Enter your id: ");
        this.setId(scanner.nextLine());
        System.out.println("enter time spent in minutes: ");
        this.setTimeSpent(scanner.nextInt());
        System.out.println("enter height: ");
        this.setHeight(scanner.nextDouble());
        System.out.println("enter weight: ");
        this.setWeight(scanner.nextDouble());
        this.setBMI((100*100*this.getHeight())/(this.getHeight()*this.getWeight()));
        System.out.println("BMI: " + getBMI());
        File file = new File (getId() + ".txt");
        Main.startProgram();
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            out.append(localDate + ": " + "ID: " + getId() + " | Time: " +
                    this.getTimeSpent() + " | Height: " + this.getHeight() +
                    " | Weight: " + this.getWeight() + " | BMI: " + this.getBMI() + System.lineSeparator());
            out.close();
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
