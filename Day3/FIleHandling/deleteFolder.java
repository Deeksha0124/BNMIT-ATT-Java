package Day2.FIleHandling;
import java.io.File;
public class deleteFolder {
    public static void main(String[] args) {
        //Relative path --> Current directory
        //C:\Users\student\IdeaProjects\BNMIT-ATT
        File folder = new File("C:\\Users\\student\\IdeaProjects\\BNMIT-ATT\\Deeksha");
        if(folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted successfully.");
        }
        else{
            System.out.println("Folder doesn't exist.");
        }
    }

}
