public class FriendsProblem {
    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int single = pairs(n - 1);
        int pears = (n - 1) * pairs(n - 2);

        return single + pears;
    }

    public static void main(String[] args) {
        System.out.println(pairs(3));

    }
}
