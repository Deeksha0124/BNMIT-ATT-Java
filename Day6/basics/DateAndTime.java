package Day6.basics;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalTime obj = LocalTime.now();
        System.out.println("The current time is : " + obj);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
        String formattedDateTime = obj.format(format);
        System.out.println("Date/Time before formatting: " + formattedDateTime);
        
    }
}
