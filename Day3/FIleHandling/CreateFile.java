package Day2.FIleHandling;


import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./Deeksha/Deeksha.txt");
        if(file.createNewFile()){
            System.out.println("File " + file.getName() + " created successfully.");
        }
        else{
            System.out.println("Failed to create the file.");
        }
    }
}
