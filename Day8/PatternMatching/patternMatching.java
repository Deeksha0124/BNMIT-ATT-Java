package Day8.samInterface.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Core Java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("We are learning CORE JAVA");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if(matchFound){
            System.out.println("Match Found");

        }
        else{
            System.out.println("Match Not Found");
        }
    }
}
