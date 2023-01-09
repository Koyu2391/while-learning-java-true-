import java.util.*;

public class reversearray {

    public static void revArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
        revArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
