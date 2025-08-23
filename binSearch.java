public class binSearch {
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
       }return -1;

    }
    public static void main(String[]args){
     int arr[]={2,4,6,8,10,12,14,16,18};
     int key=10;
     System.out.println("Index of key is : " + binarySearch(arr , key));
    }
    
}
