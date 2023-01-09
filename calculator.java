import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Operator +, *, -, /, %");
        final char opr = sc.nextLine().charAt(0);
        System.out.println("Enter the oprands");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (opr) {
            case '+':
                System.out.println("The sum is " + (a + b));
                break;
            case '*':
                System.out.println("The product is " + a * b);
                break;
            case '-':
                System.out.println("The difference is " + (a - b));
                break;
            case '/':
                System.out.println("The division of " + (a / b));
                break;
            case '%':
                System.out.println("The reminder of " + a + " and " + b + " is " + (a % b));
                break;

            default:
                System.out.println("Invalid Operator Entered");
                break;
        }
    }
}
