public class RemoveChar {
    // 4.Write a java program to remove a particular character from a String.
    public static void main(String[] args) {
        String name = "javbed";
        int pos = 3;
        String result = name.substring(0, pos) + name.substring(pos + 1);
        System.out.println(result);

    }
}
