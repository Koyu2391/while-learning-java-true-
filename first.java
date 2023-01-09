import java.lang.invoke.StringConcatFactory;
import java.util.*;

public class first {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of radius of the circle ");
        int rad = sc.nextInt();

        double area = 3.14 * rad * rad;

        System.out.print("The area of the circle is ");
        System.out.println(area);

    }

}