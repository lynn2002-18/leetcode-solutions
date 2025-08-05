# leetcode-solutions
My personal LeetCode solutions in Python and Java

### 35. Search Insert Position – [LeetCode #35](https://leetcode.com/problems/search-insert-position/)

**Problem:**  
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be inserted in order.  
You may assume no duplicates in the array.

**Example:**
Input: [1,3,5,6], 5 → Output: 2
Input: [1,3,5,6], 2 → Output: 1
Input: [1,3,5,6], 7 → Output: 4
Input: [1,3,5,6], 0 → Output: 0

**Approach:**  
Use **binary search**. If `target == mid`, return `mid`.  
If `target < mid`, search left usiong [ left , mid -1 ]. If `target > mid`, search right using [ mid + 1, right ].  
When low > high, return `left` — the insertion point.

Time Complexity:** O(log n)  
Space Complexity:** O(1)

Java Solution:

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
