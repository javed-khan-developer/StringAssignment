package AssignmentThree;

import java.util.Arrays;

public class SortingOrder {
    public static void main(String[] args) {
        String inpuString = "zadhgtdycnbbm";
        char[] arr = inpuString.toCharArray();
        Arrays.sort(arr);
        String sortedString = String.valueOf(arr);
        System.out.println(sortedString);
    }
}
