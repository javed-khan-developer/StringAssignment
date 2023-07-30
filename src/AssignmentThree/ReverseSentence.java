package AssignmentThree;

public class ReverseSentence {
    // WAP to reverse a sentence while preserving the position of each word
    public static void main(String[] args) {
        String string1 = "Think Twice";
        String string2 = "";
        // Split the input sentence into individual words
        String[] words = string1.split(" ");
        for (String elemString : words) {
            for (int i = elemString.length() - 1; i >= 0; i--) {
                string2 = string2 + elemString.charAt(i);
            }
            string2 = string2 + " ";

        }

        System.out.println(string2);
    }
}
