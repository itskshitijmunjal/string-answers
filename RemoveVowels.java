import java.util.Scanner;
public class RemoveVowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:-");
        String str=sc.nextLine();
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Input: " + str);
        System.out.println("Output: " + result);
    }
}

