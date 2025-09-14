public class bubblesort {
    public static void bubblesorting(int[] arr) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
        }
    }
}
 public static void bubblesortingInDescending(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
        }
    }
}

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 2, 1 };
        System.out.print("Before Sorting arr : ");
        printArr(arr);
        bubblesortingInDescending(arr);
        System.out.print("After  Sorting arr : ");
        printArr(arr);
    }
}
