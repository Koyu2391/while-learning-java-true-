import java.util.Scanner;

public class staircaseSearch {
    public static boolean StairCase_Search(int[][] matrix, int key) {
        int row = 0, col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key to search in the matrix");
        int key = sc.nextInt();

        StairCase_Search(matrix, key);
    }
}
