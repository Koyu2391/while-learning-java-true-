import java.util.*;

public class binomial {
    public static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }

    public static int bino(int n, int r) {
        int binomial;
        binomial = (factorial(n) / (factorial(r) * factorial(n - r)));
        return binomial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number the value of n and r ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("The binomial coefficient of " + n + " and " + r + " is " + bino(n, r));

    }
}
