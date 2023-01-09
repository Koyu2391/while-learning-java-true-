import java.util.*;

public class twodarray {

    public static int keyMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int keyMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int n = matrix.length, m = matrix[0].length;
        System.out.println("Enter the elements in Row And Col of the Matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered Elements in the array");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The maximum Value in the array is " + keyMax(matrix));
        System.out.println("The minimum Value in the array is " + keyMin(matrix));
    }
}
