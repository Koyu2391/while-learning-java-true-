import java.util.*;

public class linearsearch {
    public static int search(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 12, 15, 17, 18, 19, 20, 25, 29, 98, 45, 65 };

        System.out.println("Enter the number to search");
        int key = sc.nextInt();

        int find = search(numbers, key);
        if (find == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("You number is at index :" + find);
        }

    }
}
