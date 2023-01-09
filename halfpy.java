import java.util.Scanner;
import java.util.*;

public class halfpy {
    public static void halfInvertedPy(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();
        halfInvertedPy(n);
    }
}
