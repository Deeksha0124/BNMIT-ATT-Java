package Day5.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("01","xxxxx");
        hm1.put("03","aaaaa");
        hm1.put("02","ccccc");
        hm1.put("04","ddddd");
        hm1.put("05","yyyyy");
        hm1.put("07","kkkkk");
        hm1.put("06","ddddd");
        System.out.println("Iterating over hashmap: ");
        for(Map.Entry<String, String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

                HashMap<String, String> hm2 = new LinkedHashMap<>();
                hm2.put("01","xxxxx");
                hm2.put("03","aaaaa");
                hm2.put("02","ccccc");
                hm2.put("04","ddddd");
                hm2.put("05","yyyyy");
                hm2.put("07","kkkkk");
                hm2.put("06","ddddd");
                System.out.println("Iterating over linked hashmap: ");
                for(Map.Entry<String, String> entry: hm2.entrySet()){
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }


            }
        }


