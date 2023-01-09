import java.util.*;

public class findLargest {
    public static int larger(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Valie in the array is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 12, 15, 17, 18, 19, 20, 25, 29, 98, 45, 65 };

        System.out.println("The Largest Value in array is : " + larger(numbers));

    }
}
