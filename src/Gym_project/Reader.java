package Gym_project;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Reader {

    String getClientHeight(String path, String searchFor) {
        Scanner x;
        boolean found = false;
        String ID = "", date = "", height = "", weight = "", BMI = "", time = "";
        try{
            x = new Scanner(new File(path));
            x.useDelimiter("[,\n]");
            while (x.hasNext() && !found){
                ID = x.next();
                date = x.next();
                height = x.next();
                weight = x.next();
                BMI = x.next();
                time = x.next();
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
