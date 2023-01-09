import java.util.*;

public class pali {
    public void isPalindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int lastDigit = 0;
        int pali = 0;
        int i = 1;

        while (n < 0) {
            lastDigit = n % 10;
            pali = pali + lastDigit * 10 * i;
            n = n / 10;
            i++;
        }

        if (pali == n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
