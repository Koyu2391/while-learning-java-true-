import java.util.Scanner;

public class recursion {
    public static void printINC(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printINC(n - 1);
        System.out.print(n + " ");
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long ans = n * factorial(n - 1);
        return ans;
    }

    public static int sumofN(int n) {
        int ans;
        if (n == 0) {
            return 0;
        }
        ans = n + sumofN(n - 1);
        return ans;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }

    public static int lastOccur(int arr[], int key) {
        int i = arr.length - 1;
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i - 1);
    }

    public static int lastOccur1(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lastOccur1(arr, key, i + 1);
        if (isFound == 1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 4, 3, 6, 7, 8, 4, 9 };
        System.out.println(firstOccur(arr, 4, 0));
    }
}