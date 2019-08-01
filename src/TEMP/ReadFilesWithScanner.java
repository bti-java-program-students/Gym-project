package TEMP;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ReadFilesWithScanner {
    private String path;
    private File fileObject;
    private Scanner readFile;

    ReadFilesWithScanner(String path) {
        if (path != null) {
            this.fileObject = new File(path);
            readDataFromFile();
        } else {
            throw new NullPointerException();
        }
    }

    String getFileLine() {
        return readFile.nextLine();
    }

    private void readDataFromFile() {
        try {
            this.readFile = new Scanner(fileObject);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}