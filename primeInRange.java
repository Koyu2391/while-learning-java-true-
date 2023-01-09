import java.util.*;

public class primeInRange {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void InRange(int n) {

        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        InRange(range);
    }

}
