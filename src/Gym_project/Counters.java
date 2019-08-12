package Gym_project;

import java.text.DecimalFormat;

class Counters implements AbleToCountBMI {

    @Override
    public double calcBMI(double height, double weight) {
        DecimalFormat df = new DecimalFormat("##.##");
        double BMI = 10000 * weight / (height * height);
        BMI = Double.parseDouble(df.format(BMI));
        System.out.println("Kliento KMI - " + BMI);
        if (BMI <= 18.5) {
            System.out.println("KMI yra mažesnis už normą, " +
                    "rekomenduojama pasitarti su mitybos specialistu, koreguoti fizinį aktyvumą ");
        }
        if (18.5 < BMI && BMI < 25) {
            System.out.println("KMI yra normos ribose, " +
                    "mitybos ir aktyvumo santykis - optimalus");
        }
        if (25 <= BMI && BMI < 30) {
            System.out.println("BMI nežymiai viršija normą, rekomenduojama pasitarti su " +
                    "mitybos specialistu ir padidinti fizinį aktyvumą ");
        }
        if (30 <= BMI) {
            System.out.println("KMI gerokai viršija normą, primygtinai " +
                    "rekomenduojama pasikonsultuoti su mitybos specialistu ir sveikatingumo treneriu ");
        }
        return BMI;
    }
}