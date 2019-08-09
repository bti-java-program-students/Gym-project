package Gym_project;

import java.util.Scanner;

public class Counters {
    static void bodyMassIndexCounter() {
        Scanner input = new Scanner(System. in);
        System.out.println("Įrašykite ūgį metrais");
        double height = input.nextDouble();
        System.out.println("Įrašykite svorį kilogramais");
        double weight = input.nextDouble();
        double bmiCounter = weight / (height * height);
        System.out.println();
        System.out.format("Kliento KMI - " + "%.2f%n", bmiCounter);
        if (bmiCounter < 18.5) {
            System.out.println("KMI yra mažesnis už normą, " +
                    "rekomenduojama pasitarti su mitybos specialistu, koreguoti fizinį aktyvumą ");
        }
        if (18.5 < bmiCounter && bmiCounter < 25) {
            System.out.println("KMI yra normos ribose, " +
                    "mitybos ir aktyvumo santykis - optimalus");
        }
        if (25 <= bmiCounter && bmiCounter < 30) {
            System.out.println("BMI nežymiai viršija normą, rekomenduojama pasitarti su " +
                    "mitybos specialistu ir padidinti fizinį aktyvumą ");
        }
        if (30 <= bmiCounter) {
            System.out.println("KMI gerokai viršija normą, primygtinai " +
                    "rekomenduojama pasikonsultuoti su mitybos specialistu ir sveikatingumo treneriu ");
        }
    }
}

