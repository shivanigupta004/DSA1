public class binSearch {
    public static int binarySearch(int arr[],int key){
       int start=0 ,end=arr.length-1;

       while(start<=end){
        int mid=(start+end)/2;//find mid
         //comparisons
        if(arr[mid]==key){   //mid
            return mid;
        }if(arr[mid]<key){   //right
            start=mid+1;
       }else{               //left
        end=mid-1;
       }
    } return -1;
    }
    public static void main(String[]args){
     int arr[]={2,4,6,8,10,12,14};
     int key=10;
     System.out.println("index of key is "+binarySearch(arr,key));
    }
    
}
