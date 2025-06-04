package Day2.FIleHandling;

import java.io.File;
import java.io.IOException;

public class deleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./Deeksha/bnmit.txt");
        if(file.delete()){
            System.out.println("File " + file.getName() + " deleted successfully.");
        }
        else{
            System.out.println("Failed to delete the file.");
        }
    }
}
