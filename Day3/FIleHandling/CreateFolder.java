package Day2.FIleHandling;
import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
        //Relative path --> Current directory
        //C:\Users\student\IdeaProjects\BNMIT-ATT
        File folder = new File("C:\\Users\\student\\IdeaProjects\\BNMIT-ATT\\Deeksha");
        if(folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created successfully.");
        }
        else{
            System.out.println("Folder already exists.");
        }
    }

}
