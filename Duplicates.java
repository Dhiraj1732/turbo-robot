import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 2, 7, 5};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Duplicates: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
