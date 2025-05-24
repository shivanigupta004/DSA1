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

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1}; 
        System.out.print("Before Sorting arr : ");
        printArr(arr);
        selectionsorting(arr);
        System.out.print("After  Sorting arr : ");
        printArr(arr);
    }
}

