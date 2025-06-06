package Day4.Binary;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    public static void generateBinary(int N){
        Queue< String > q= new LinkedList<>();
        q.offer("1");
        while(N-- > 0){
            String current = q.poll();
            System.out.println(current+ " ");
            q.offer(current+"0");
            q.offer(current+"1");
        }
    }

    public static void main(String[] args) {
        generateBinary(5);
    }
}
