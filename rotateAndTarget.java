public class rotateAndTarget{
public static int binarySearch(int arr[],int key){
       int start = 0, end = arr.length-1;

       while(start <= end)
       {
        int mid = (start + end) / 2;   //finding mid
 
        //Comparisons
        if(arr[mid] == key){    //Mid
            return mid;
        }if(arr[mid] < key){ //Right
            start = mid + 1;   //Update start
        }else{              //Left
             end = mid - 1;    //Update end
        }
       }
       return -1;

    }

        // Helper reverse method
         public static void reverse(int[] array, int start, int end) { //time complexity O(n) space complexity O(1)
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        } 
       public static int rotateLeftArray2(int[] arr, int k ,int target) {  //time complexity O(n) space complexity O(1)
       
        k %= arr.length; // if k > arr.length
         
        reverse(arr, 0, arr.length - 1); // Reverse all elements 
        reverse(arr, 0, arr.length - 1 - k); // Reverse  1st len-k elements
        reverse(arr, arr.length - k, arr.length-1); // Reverse the last k elements
        int t = target;
        return binarySearch(arr, t);

       }
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    int output = rotateLeftArray2(arr, k , 0);  
    System.out.println(output);   
    // Print the rotated array
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}