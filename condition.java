import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        String check = (num % 2 == 0) ? "even" : "odd";
        System.out.println(check);
    }
}
