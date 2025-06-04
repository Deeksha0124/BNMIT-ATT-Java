package Day2.FIleHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\student\\IdeaProjects\\BNMIT-ATT\\Deeksha\\Deeksha.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNext()){
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
