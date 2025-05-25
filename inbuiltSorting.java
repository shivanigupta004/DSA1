import java.util.Arrays;
import java.util.Collections;

public class inbuiltSorting {

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }System.out.println();
    }

    public static void printArr(Integer[] arra) {
        for (Integer ele : arra) {
            System.out.print(ele + " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr []= {1,9,2,8,3,7,4,5,6};
        Integer arra[] = {1,9,2,8,3,7,4,5,6};

        Arrays.sort(arr,0,6);
        printArr(arr);
        
        Arrays.sort(arr);
        printArr(arr);

        Arrays.sort(arra,Collections.reverseOrder());
        printArr(arra);
    }
}
