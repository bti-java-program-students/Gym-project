package Gym_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

class Writer {
    static void WriteInfoToCSV(StringBuilder head, StringBuilder clientInfo, String path){
        if (new File(path).isFile()) {
            try (FileOutputStream fos = new FileOutputStream(path, true)) {
                PrintWriter write = new PrintWriter(fos);
                write.println(clientInfo);
                write.flush();
                write.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try (FileOutputStream fos = new FileOutputStream(path, true)) {
                PrintWriter write = new PrintWriter(fos);
                write.println(head);
                write.println(clientInfo);
                write.flush();
                write.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}