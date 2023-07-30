import java.util.Scanner;

public class UpperLowerCase {
    // 3.Write a java program to convert upper case to lower case and vice versa.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string input");
        String input = scanner.nextLine();
        scanner.close();
        String convertedString = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                char convertedChar = (char) (currentChar - 32);
                convertedString += convertedChar;
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                char convertedChar = (char) (currentChar + 32);
                convertedString += convertedChar;
            }
        }
        System.out.println(convertedString);
    }
}
