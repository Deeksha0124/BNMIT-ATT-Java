package Day8.Advanced;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Deeksha";
        e.address = "Bengaluru";
        e.SSN = 22;
        e.phone = 1234;
        try{
            FileOutputStream fileOut = new FileOutputStream(
                    System.getProperty("user.dir") + "/Deeksha/employee.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut); //SER
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("The serialized employee object is saved to the file.");

        }catch(IOException i){
            i.printStackTrace();
        }
        finally {
            System.out.println("End of execution");
        }
    }
}
