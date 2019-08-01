package Gym_project;

import java.io.*;

public class File_Copier {

    public static void main(String[] args) {
        copyByteByByte();
        copyCharByChar();
        copyLineByLine();
    }

    private static void copyLineByLine() {
        try (BufferedReader inputStream =
                     new BufferedReader(new FileReader("Clients.txt"));
             PrintWriter outputStream =
                     new PrintWriter(new FileWriter("destination_line.txt"))) {
            String dataBox;
            while ((dataBox = inputStream.readLine()) != null) {
                outputStream.println(dataBox);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void copyCharByChar() {
        try (FileReader inputCharStream = new FileReader("Clients.txt");
             FileWriter outputCharStream = new FileWriter("destination_char.txt")) {
            int dataBox;
            while ((dataBox = inputCharStream.read()) != -1) {
                outputCharStream.write(dataBox);
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void copyByteByByte() {
        try (FileInputStream fis = new FileInputStream("Clients.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            int dataBox;
            while ((dataBox = fis.read()) != -1) {  //read from file
                fos.write(dataBox);  // write to file
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

