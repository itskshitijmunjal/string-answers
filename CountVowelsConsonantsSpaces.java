import java.util.Scanner;
public class CountVowelsConsonantsSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:-");
        String str=sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            } else if (ch == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("White spaces: " + spaceCount);
    }
}