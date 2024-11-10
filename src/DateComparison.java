import java.util.Scanner;
import java.time.LocalDate;

public class DateComparison {
    public static String compareDates(int day1, int month1, int year1, int day2, int month2, int year2) {
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        if (date1.isBefore(date2)) {
            return "The first date is earlier.";
        } else if (date1.isAfter(date2)) {
            return "The second date is earlier.";
        } else {
            return "Both dates are the same.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (day month year): ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        System.out.print("Enter the second date (day month year): ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        String result = compareDates(day1, month1, year1, day2, month2, year2);
        System.out.println(result);

        scanner.close();
    }
}
