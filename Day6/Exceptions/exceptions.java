package Day6.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exceptions {
    public static void main(String[] args) throws IOException {
        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
            System.out.println(str);
        }
    }

    {
         System.out.println("Deeksha");  //IIB - instance initializer block (prints top to bottom)
     }

     static {
            System.out.println("BNMIT");
        }

    }



