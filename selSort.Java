public class selSort {
    public static void selectionSort(int [] arr) {
        for(int turn = 0; turn < arr.length-1; turn++){
            int minPos = i;
            for(int j = 0; j < arr.length; j++){
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap 
            int temp = arr[minPos];
            arr[i] = arr[minPos];
            arr[i] = arr[minPos];
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