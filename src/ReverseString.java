public class ReverseString {
    public static void main(String[] args) throws Exception {
        // 1.Write a java program to Reverse a string without using the inbuilt method.
        String string = "javed";
        String reversedString = "";
        int length = string.length() - 1;
        for (int i = length; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println(reversedString);
    }
}
