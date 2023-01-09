import java.util.Scanner;

public class Solution {
    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToDigits(int n) {

        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        numToDigits(n / 10);
        System.out.print(digit[lastDigit] + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        numToDigits(n);

    }
}
