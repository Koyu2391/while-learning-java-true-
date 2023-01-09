import java.util.Scanner;

public class TilingProb {
    public static int ways(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        int vertical = ways(n - 1);

        int horizontal = ways(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();

        System.out.println(ways(n));

    }
}
