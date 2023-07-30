package AssignmentFour;

import java.util.Scanner;

public class UserInput {
    // write a simple string program to take input from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println(input);
    }
}
