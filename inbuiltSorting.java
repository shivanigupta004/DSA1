import java.util.Arrays;

public class inbuiltSorting {

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr []= {1,9,2,8,3,7,4,5,6};
        Arrays.sort(arr);
        printArr(arr);
    }
}
