import java.util.Scanner;

public class leetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int lastDigit = 0;
        int pali = 0;

        while (n > 0) {
            lastDigit = n % 10;
            pali = pali * 10 + lastDigit;
            n = n / 10;
        }

        if (pali != n) {
            System.out.println("false");
        }

        else {
            System.out.println("true");

        }

    }
}
