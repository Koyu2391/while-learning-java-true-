import java.util.*;

public class invertedtriangle {

    public static void triInverted(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of lines : ");
        int n = sc.nextInt();

        triInverted(n);
    }
}
