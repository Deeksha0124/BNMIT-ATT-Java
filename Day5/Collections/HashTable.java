package Day5.Collections;

import java.util.Hashtable;
import java.util.Map;
public class HashTable{
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1= new Hashtable<>();
                ht1.put(106,"Deeksha");
                ht1.put(117,"Kamal");
                ht1.put(158, "Pallavi");
                ht1.put(190, "Ravi");
                ht1.put(200, "Jaina");
                for(Map.Entry<Integer, String> entry : ht1.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
                }
    }
        }
