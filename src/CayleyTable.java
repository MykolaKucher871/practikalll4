public class CayleyTable {
    public static void main(String[] args) {
        System.out.println("Cayley Table for multiplication:");

        // Виведення верхнього заголовку
        System.out.print("   ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Виведення таблиці
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i); // Перший стовпець
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // Результат множення
            }
            System.out.println();
        }
    }
}
