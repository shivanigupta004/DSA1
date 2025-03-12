public class largeNum {
    public static int getlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
    }return largest;
}
    public static void main(String[]args){
         int arr[]={2,3,5,6,0,1,4};
         System.out.println("largest number in array is "+getlargest(arr));
        }
       
}
    

