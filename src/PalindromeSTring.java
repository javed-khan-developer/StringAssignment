import java.util.Scanner;

public class PalindromeString {
    // 2.Write a java program to know whether the given string is palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check Palindrome");
        String userInput = sc.nextLine();
        sc.close();
        String reversedString = "";
        int length = userInput.length() - 1;
        for (int i = length; i >= 0; i--) {
            reversedString += userInput.charAt(i);
        }
        if (userInput.equals(reversedString)) {
            System.out.println("it is a plaindrome string");
        } else {
            System.out.println("it is not a plaindrome string");

        }
    }
}
