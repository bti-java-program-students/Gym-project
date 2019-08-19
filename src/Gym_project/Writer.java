package Gym_project;

import java.io.*;

class Writer {
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
}

