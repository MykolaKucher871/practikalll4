import java.util.Scanner;

public class TriangleType {
    public static String triangleType(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Equilateral";
            } else if (a == b || a == c || b == c) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Not a triangle";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        String result = triangleType(a, b, c);
        System.out.println("Triangle type: " + result);

        scanner.close();
    }
}
