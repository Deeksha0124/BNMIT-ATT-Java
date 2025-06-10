package Day6.basics;
import java.time.LocalDate;
public class DisplayDate {
    public static void main(String[] args) {
        LocalDate obj  = LocalDate.now().minusDays(5);
        System.out.println("The date is : " + obj);
    }
}
