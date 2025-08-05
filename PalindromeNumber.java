import java.util.Scanner;
// Given an integer x, return true if x is a palindrome, and false otherwise.
//A palindrome is a number that reads the same forward and backward.
//Input: x = 121
//Output: true   // 121 reversed is still 121
//Input: x = -121
//Output: false  // Negative numbers are not palindromes
//Input: x = 10
//Output: false  // Reversed is 01, not equal
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to text : ");
        int x = in.nextInt();

        PalindromeSolution solution = new PalindromeSolution();
        boolean result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
        System.out.println("the original number is :" + x);
        /*int x = 12123;
        int inverseNum = 0;
        while ( x !=0){
            int ge = x % 10;
            x = x / 10;
            inverseNum = inverseNum * 10 + ge;
        }
        System.out.println(inverseNum);
    }*/
    }
}

class PalindromeSolution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int original = x;//is don't save, x will change with the while loop
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return original == reversed;
    }
}
