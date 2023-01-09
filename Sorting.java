public class Sorting {
    public static void selectionSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                // ascending order
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
                /*
                 * for descending order
                 * if (arr[minPos] < arr[j]) {
                 * minPos = j;
                 * }
                 */
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 6, 3, 2, 1 };
        selectionSort(arr);
        printarr(arr);

    }
}
