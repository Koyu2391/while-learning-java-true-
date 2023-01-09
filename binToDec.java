import java.util.*;

public class binToDec {

    public static int binaryToDec(int n) {
        int ans = 0;
        int pow = 0;
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            ans = ans + (lastDigit * (int) Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary num");
        int n = sc.nextInt();
        System.out.println(binaryToDec(n));
    }
}
