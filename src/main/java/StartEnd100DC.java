import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class StartEnd100DC {
    public static void main(String[] args) {

        LocalDate start100DaysOfCode = LocalDate.of(2024, Month.MAY,15);
        LocalDate end100DaysOfCode = start100DaysOfCode.plusDays(100);
        System.out.printf("%nStart 100 days of code: %s%n", start100DaysOfCode);
        System.out.printf("End 100 days of code:   %s%n", end100DaysOfCode);
        System.out.printf("Days elapsed:  %02d%n", ChronoUnit.DAYS.between(start100DaysOfCode,
                LocalDate.now())+ 1);
    }
}
