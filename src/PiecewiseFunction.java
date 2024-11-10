import java.util.Scanner;

public class PiecewiseFunction {
    public static double calculateF(double x, double a, double b) {
        if (x >= 1 && x < 3) {
            return 9 / (a * x);
        } else if (x == 3) {
            return a * Math.pow(x, 2) + x + b;
        } else {
            throw new IllegalArgumentException("Undefined for this x");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        try {
            double result = calculateF(x, a, b);
            System.out.println("f(" + x + ") = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
