package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = scanner.nextInt();
        System.out.print("Enter month : ");
        int month = scanner.nextInt();
        System.out.print("Enter day : ");
        int day = scanner.nextInt();

        LocalDate local = LocalDate.now();
        LocalDate localDate1 = local.minusYears(year).minusMonths(month).minusDays(day);
        System.out.println(localDate1);

    }
}