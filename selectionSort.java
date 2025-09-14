public class selectionSort {
    
    public static void selectionsorting(int[] arr) {
        
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minPosition] > arr[j ]) {
                    minPosition = j;
                }
                // Swap
                    int temp = arr[minPosition];
                    arr[minPosition] = arr[i];
                    arr[i] = temp;
            }
        }
    }
    
 public static void selectionsortingInDescending(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int maxPosition = i;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[maxPosition] < arr[j]) {
                maxPosition = j;
            }
        }
        // Swap after finding the maxPosition
        int temp = arr[maxPosition];
        arr[maxPosition] = arr[i];
        arr[i] = temp;
    }
}

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 5, 1}; 
        System.out.print("Before Sorting arr : ");
        printArr(arr);
        selectionsortingInDescending(arr);
        System.out.print("After  Sorting arr : ");
        printArr(arr);
    }
}

