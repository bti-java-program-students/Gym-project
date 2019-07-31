import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Print_file {

    public static void main(String args[])throws IOException {
        File file = new File("Clients_list.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write("person1\n person2\n person3\n person4\n");
        writer.flush();
        writer.close();

        // Creates a FileReader Object
        FileReader fr = new FileReader(file);
        char [] a = new char[100];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);
        fr.close();
    }
}
