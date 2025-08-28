public class rotateLeft {
    // Add methods and fields as needed
    public static void rotateLeftArray(int[] arr,int k) { //time complexity O(n) space complexity O(k)
         k %= arr.length;       // if k > arr.length
        
         int[] temp = new int[k];

        //store first k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        //shift the rest of the elements to the left
        for (int i = 0; i < arr.length-k; i++) {
            arr[i] = arr[i + k];
         }
         //store back the k elements from temp to the end of arr
         for(int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - k)];
         }
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
       public static void rotateLeftArray2(int[] arr, int k) {  //time complexity O(n) space complexity O(1)
       
        k %= arr.length; // if k > arr.length
         
        reverse(arr, 0, arr.length - 1); // Reverse all elements 
        reverse(arr, 0, arr.length - 1 - k); // Reverse  1st len-k elements
        reverse(arr, arr.length - k, arr.length-1); // Reverse the last k elements

       }
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    // rotateLeftArray(arr, k);   //1st approach
    rotateLeftArray2(arr, k);     //2nd approach
    // Print the rotated array
    for (int num : arr) {
        System.out.print(num + " ");
    }
}

}