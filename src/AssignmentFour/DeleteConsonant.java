package AssignmentFour;

import java.util.Scanner;

public class DeleteConsonant {
    // wap to delete all consonant from a string take input from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();
        char[] vowelChar = new char[10];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A' ||
                    string.charAt(i) == 'e' || string.charAt(i) == 'E' ||
                    string.charAt(i) == 'i' || string.charAt(i) == 'I' ||
                    string.charAt(i) == 'o' || string.charAt(i) == 'O' ||
                    string.charAt(i) == 'u' || string.charAt(i) == 'U') {
                vowelChar[j++] = string.charAt(i);
            } else {
                continue;
            }

        }
        for (int i = 0; i < j; i++) {
            System.out.println(vowelChar[i]);

        }
    }
}
