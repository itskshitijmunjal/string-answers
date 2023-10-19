import java.util.Scanner;
public class CapitalizeFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        boolean newWord = true; 
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isLetter(ch)) {
                if (newWord) {
                    charArray[i] = Character.toUpperCase(ch); 
                    newWord = false;
                } else if (i == charArray.length - 1 || !Character.isLetter(charArray[i + 1])) {
                    charArray[i] = Character.toUpperCase(ch); 
                    newWord = true;
                }
            } else {
                newWord = true;
            }
        }
        String capitalizedString = new String(charArray);
        System.out.println("Capitalized string: " + capitalizedString);
    }
}
