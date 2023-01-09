import java.util.*;
public class leetcode2 {
    public static int Maxsumarray(int[][] arr) {
        int[] sum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum[i] = sum[i] + arr[i][j];
            }
        }
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (maxSum < sum[i]) {
                maxSum = sum[i];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int size2 = sc.nextInt();

        int[][] arr = new int[size][size2];

        System.out.println("Enter the Elements in the array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Maxsumarray(arr));
    }

}
