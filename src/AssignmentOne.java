public class AssignmentOne {
    public static void main(String[] args) throws Exception {
        // 1.Write a java program to Reverse a string without using the inbuilt method.
        String string = "javed";
        int i = 0;
        int j = string.length() - 1;
        char[] charArray = string.toCharArray();

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }
}
