package Gym_project;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class OldClient extends Client{

    void gymTracker() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Įrašykite kliento id: ");
            this.setId(scanner.next());
            String dirPath = "All_Clients/" + this.getId();
            System.out.println("dirpath " + dirPath);
            String path = dirPath + "/" + this.getId() + ".csv";
            System.out.println("path " + path);
            System.out.println("Įrašykite kiek laiko sportavote, min: ");
            int time = scanner.nextInt();
            String height;
            height = new Reader().getClientHeight(path,getId());
            this.setHeight(Double.parseDouble(height));
            System.out.println("Įrašykite svorį: ");
            this.setWeight(scanner.nextDouble());
            double BMI;
            BMI = new Counters().calcBMI(this.getHeight(), this.getWeight());
            this.setBMI(BMI);

            List<String> headList = Arrays.asList(
                    "ID", "DATE", "HEIGHT", "WEIGHT", "BMI", "TIME");
            String head = String.join(",", headList);

            List<String> oldClientInfoList = Arrays.asList(
                    this.getId(), new LocalDate().getLocalDate(), String.valueOf(this.getHeight()),
                    String.valueOf(this.getWeight()), String.valueOf(this.getBMI()), String.valueOf(time));
            String clientInfo = String.join(",", oldClientInfoList);

            new Writer();
            Writer.writeToClientsCSV(path, head, clientInfo);

        } catch (Exception ex) {
            System.out.println("That's your problem---->" + ex);
        }
    }
}
