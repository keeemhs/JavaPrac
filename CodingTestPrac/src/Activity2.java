import java.util.*;

public class Activity2 {

    public static int[] findIndices(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        
        return null;
    }

    public static void main(String[] args) {
        int[] nums2 = {2, 4, 3, 6, 8, 5, 5, 2};
        int target2 = 6;
        int[] result2 = findIndices(nums2, target2);
        
        
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }
}
