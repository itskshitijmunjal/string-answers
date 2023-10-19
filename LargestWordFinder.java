import java.util.Scanner;

public class LargestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String largestWord = "";
        int largestWordLength = 0;
        String currentWord = "";
        int currentWordLength = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                currentWord += ch;
                currentWordLength++;
            } else if (currentWordLength > 0) {
                if (currentWordLength > largestWordLength) {
                    largestWord = currentWord;
                    largestWordLength = currentWordLength;
                }
                currentWord = "";
                currentWordLength = 0;
            }
        }
        if (currentWordLength > largestWordLength) {
            largestWord = currentWord;
        }
        System.out.println("Largest word in the string: " + largestWord);
    }
}
