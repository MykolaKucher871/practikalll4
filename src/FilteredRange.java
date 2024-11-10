import java.util.Scanner;

public class FilteredRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        System.out.print("Enter a prime number (1-9) to skip multiples of: ");
        int prime = scanner.nextInt();

        System.out.println("Numbers in the range " + start + " to " + end + " excluding multiples of " + prime + ":");
        for (int i = start; i <= end; i++) {
            if (i % prime == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
