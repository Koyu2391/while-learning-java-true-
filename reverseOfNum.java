import java.util.*;

public class reverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to Reverse it");
        int a = sc.nextInt();

        int lastDigit;

        while (a > 0) {

            lastDigit = a % 10;
            System.out.print(lastDigit + "");
            a = a / 10;
        }
    }

}
