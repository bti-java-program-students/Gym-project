

import sun.plugin.javascript.navig.Array;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
                String[][] anotherElements = new String[4][];// reikia sukurti 2D masyva
                System.out.println(Arrays.toString(elements));
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
