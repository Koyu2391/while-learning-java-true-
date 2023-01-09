import java.util.*;

public class PowfuncR {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static long optimizedPowFunc(int a, int n) {
        if (n == 0) {
            return 1;
        }
        long pow = optimizedPowFunc(a, n / 2);
        long powSq = pow * pow;
        if (n % 2 != 0) {
            return powSq * a;
        }
        return powSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of base and power");
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("The value of base " + x + " to the power " + n + " is " + optimizedPowFunc(x, n));
    }
}
