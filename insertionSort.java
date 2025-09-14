public class insertionSort {
    public static void insertionSorting(int[]arr){
        for(int i = 0;i<=arr.length -1; i++){
           int curr = arr[i];
           int prev = i-1;
           //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] =arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void insertionSortingInDesc(int[]arr){
        for(int i = 0;i<=arr.length -1; i++){
           int curr = arr[i];
           int prev = i-1;
           //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] =arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
     public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9,6,3,8,4,2,1};
        System.out.print("Before Sorting arr : ");
        printArr(arr);
        insertionSortingInDesc(arr);
        System.out.print("After  Sorting arr : ");
        printArr(arr);
       
    }
}
