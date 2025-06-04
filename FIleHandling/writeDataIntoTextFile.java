package FIleHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\student\\IdeaProjects\\BNMIT-ATT\\Deeksha\\Deeksha.txt", true); //true helps in appending new data to existing data
        writer.append("We will learn spring in third week");
        writer.close();
        System.out.println("Successfully wrote to the file");
    }
}
    }
}
