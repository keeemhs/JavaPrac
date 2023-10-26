import java.util.*;

public class Activity1 {

    public static int sumLessThan(int[] arr, int target) {
        int sum = 0;
        for (int num : arr) {
            if (num < target) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 8, 3, 7, 5, 3, 6, 8, 1, 14};
        System.out.println(sumLessThan(nums1, 10));
    }
}
