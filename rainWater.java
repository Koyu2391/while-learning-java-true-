public class rainWater {
    public static int totalTrappedWater(int number[]) {
        int n = number.length;
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];
        maxLeft[0] = number[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(number[i], maxLeft[i - 1]);
        }
        maxRight[n - 1] = number[n - 1];
        for (int i = (n - 2); i >= 0; i--) {
            maxRight[i] = Math.max(number[i], maxRight[i + 1]);
        }
        int trappedWater = 0;
        int waterLvl = 0;

        for (int i = 0; i < n; i++) {

            waterLvl = Math.min(maxLeft[i], maxRight[i]);
            trappedWater += waterLvl - number[i];

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(totalTrappedWater(height));
    }
}
