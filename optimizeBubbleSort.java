public class optimizeBubbleSort {

    public static void bubblesorting(int[] arr) {
        boolean swapped;
        
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swapped = false;
            
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, break early
            if (!swapped) break;
        }
    }
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Already sorted array
        System.out.print("Before Sorting arr : ");
        printArr(arr);
        bubblesorting(arr);
        System.out.print("After Sorting arr : ");
        printArr(arr);
    }
}
    

