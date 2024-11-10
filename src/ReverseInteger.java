import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = reverse(number);

        // Виведення з нулями на початку (10 символів, заповнення нулями)
        System.out.printf("Reversed number: %010d%n", reversedNumber);

        scanner.close();
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
