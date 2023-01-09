import java.util.*;

public class binsr {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == numbers[mid]) {
                return mid;
            } else if (numbers[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33 };

        System.out.println("Enter the number to search : ");
        int key = sc.nextInt();
        if (binarySearch(numbers, key) == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("The number is at position: " + binarySearch(numbers, key));
        }

    }
}
