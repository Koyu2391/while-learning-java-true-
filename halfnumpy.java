import java.util.*;

public class halfnumpy {
    public static void halfnumpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        System.out.println("Enter the Number of the lines: ");
        int n = scam.nextInt();
        halfnumpyramid(n);
    }

}
