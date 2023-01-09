import java.util.*;

public class facto {
    public static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }

        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number that you want factorial of ");
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is " + factorial(n));

    }
}
