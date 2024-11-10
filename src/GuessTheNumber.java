import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber = random.nextInt(100) + 1; // випадкове число від 1 до 100
        int attempts = 0;
        int guess = -1;

        System.out.println("Guess the number between 1 and 100:");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            }
        }

        System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");

        scanner.close();
    }
}
