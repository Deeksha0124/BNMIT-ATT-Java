package Day6.basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayingFormattedDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Date / Time before formatting: " + obj);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
        //E -> day of the week (Mon - Sun)
        //D -> day of the year (366 days including leap year)
        //d -> date of the month(1-31)
        //MMM - Month name (jan-dec)
        //MM - month number(1-12)
        String formattedDateTime = obj.format(format);
        System.out.println("Date/Time after formatting: " + formattedDateTime);
    }
}
