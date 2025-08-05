import java.util.Arrays;
import java.util.Random;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Output index: " + result);


    }
}

class Solution{
    public int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length -1 ;
        while ( left <= right){
            int mid = left +((right - left) >> 1);
            if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
            else{
                right = mid - 1;
            }
        }
        return left;

    }

}