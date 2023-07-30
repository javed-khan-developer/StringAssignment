
public class FindIndex {
    // 5.Write a java program to find the index of a substring.
    public static void main(String[] args) {
        String originalString = "Hello All readers";
        String searchString = "All";
        int foundIndex = originalString.indexOf(searchString);
        if (foundIndex == -1) {
            System.out.println("Substring not found");
        } else {
            System.out.println("Substring found at index: " + foundIndex);
        }
    }
}
