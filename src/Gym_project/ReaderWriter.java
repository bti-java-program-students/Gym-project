package Gym_project;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ReaderWriter {
    static void makeDir (String dirPath){
        File newDirectory = new File(dirPath);
        boolean check = newDirectory.mkdir();
    }

    static void writeToClientsCSV(String path, String head, String clientInfo) {
        if (!new File(path).isFile()) {
            try (FileOutputStream fos = new FileOutputStream(path, true);
                 PrintWriter writeToCSV = new PrintWriter(fos)) {
                writeToCSV.println(head);
                writeToCSV.println(clientInfo);
                writeToCSV.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (FileOutputStream fos = new FileOutputStream(path, true);
                 PrintWriter writeToCSV = new PrintWriter(fos)) {
                writeToCSV.println(clientInfo);
                writeToCSV.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    String getClientHeight(String path, String searchFor) {
        Scanner scan;
        boolean found = false;
        String ID = "", date = "", height = "", weight = "", BMI = "", time = "";
        try{
            scan = new Scanner(new File(path));
            scan.useDelimiter("[,\n]");
            while (scan.hasNext() && !found){
                ID = scan.next();
                date = scan.next();
                height = scan.next();
                weight = scan.next();
                BMI = scan.next();
                time = scan.next();
                if (ID.equals(searchFor)){
                    found = true;
                }
            }
        }
        catch(Exception e){}
        return height;
    }

    void printData(String path,int col) throws IOException {
        try {
            File file = new File(path);
            List<String> lines = Files.readAllLines(file.toPath(),
                    StandardCharsets.UTF_8);
            for (String line : lines) {
                String[] array = line.split(",", -1);
                System.out.println(array[1] + "||" + array[col]);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
