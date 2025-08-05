# leetcode-solutions
My personal LeetCode solutions in Python and Java

### 9. Palindrome Number – [LeetCode #9](https://leetcode.com/problems/palindrome-number/)

**Problem:**  
Given an integer `x`, return `true` if `x` is a palindrome. A palindrome is a number that reads the same forward and backward.

**Approach:**  
Instead of converting the number to a string, we use math to reverse the last half of the digits, and compare with the first half:

- If the number is negative or ends with 0 (but is not 0), return `false`
- While the original number `x` is greater than the reversed number:
  - Pop the last digit from `x`
  - Push it to `reversed`
- After the loop:
  - If `x == reversed` (even length) or `x == reversed / 10` (odd length), then it's a palindrome

---

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

### 29. Divide Two Integers – [LeetCode #29](https://leetcode.com/problems/divide-two-integers/)

**Problem:**  
Given two integers `dividend` and `divisor`, divide them without using multiplication (`*`), division (`/`), or modulus (`%`) operators. Return the **quotient** after dividing `dividend` by `divisor`, truncated toward zero.

---

**Approach:**
define int count = 0
Use while loop with dividen <= divisor to get quotient = count++; reminder =  the value of dividen in the last loop;
Ex. 10 / 3 =
10-3=7, 7-3=4, 4-3=1
then, the quotient is 3 ( the dividen can be minus by divisor 3 times), 
the reminder is the value of dividen in the last loop



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
