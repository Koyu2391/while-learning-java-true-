public class kadans {
    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, 3, 6 - 2, 8, -9, 5, 7, -1 };
        kadanes(arr);
    }
}
