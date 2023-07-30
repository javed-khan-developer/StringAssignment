package AssignmentFour;

public class CheckLetter {
    // Write a program to check if letter 'e' is present in "umbrella"
    public static void main(String[] args) {
        String string = "umbrella";
        boolean isPresent = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') {
                isPresent = true;
                break;  
            }
        }
        System.out.println(isPresent);
    }
}
