import java.util.Scanner;

public class SentenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        int sentenceCount = countSentences(text);
        System.out.println("Number of sentences: " + sentenceCount);

        scanner.close();
    }

    public static int countSentences(String text) {
        // Речення закінчується одним з символів . ! ?
        String[] sentences = text.split("[.!?]");
        int count = 0;
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
