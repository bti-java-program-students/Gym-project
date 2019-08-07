package TEMP;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileToArray {
    public static void main(String[] args) {
        readFileWithScannerForArray();
    }

    public static void readFileWithScannerForArray() {
        File fileForRead = new File("12345.txt");
        try (Scanner scanner = new Scanner(fileForRead)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split(";");
                String[][] anotherElements = new String[4][];
//                String[][] anotherElements += elements;// raikia padaryti 2D masyva
//            System.out.println(line);
                System.out.println(Arrays.toString(elements));
//                Long id = Long.parseLong(elements[2]);
//                FileOutputStream write = new FileOutputStream("new.txt", true);
//                PrintWriter wr = new PrintWriter(write);
//                wr.println(id);
//                wr.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
