import java.util.Scanner;

public class SimpleCalculator {
    public static double calculator(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero error");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        try {
            double result = calculator(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
