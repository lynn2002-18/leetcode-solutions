import java.util.Scanner;
// Problem Description:
//Given two integers, dividend and divisor, divide them without using:
//multiplication , division, mod operator %
//You need to return the quotient after dividing dividend by divisor.
public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter dividend :");
        int dividend = in.nextInt();
        System.out.println("Please enter divisor :");
        int divisor = in.nextInt();;
        int quotient = 0;
        while ( dividend >= divisor){
            dividend = dividend - divisor;
            quotient = quotient + 1;
        }
        System.out.println("The quotient is :"+ quotient);
        System.out.println("The reminder is :"+ dividend );
    }
}
