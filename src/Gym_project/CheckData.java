package Gym_project;

import java.io.IOException;

public class CheckData {
    void checkData() throws IOException {

        ReaderWriter getData = new ReaderWriter();
        System.out.println("Įvesti id: ");
        String id = Input_Scanner.stringInput();
        String dirPath = "All_Clients/" + id;
        String path = dirPath +"/"+ id;
        System.out.println("1 - svoris, 2 - bmi, 3 - laikas");
        int col = Input_Scanner.intInput();
        switch (col){
            case 1:
                getData.printData(path +".csv",3);
                break;
            case 2:
                getData.printData(path +".csv",4);
                break;
            case 3:
                getData.printData(path +".csv",5);
                break;
        }
    }
}
