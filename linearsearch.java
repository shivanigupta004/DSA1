public class linearsearch {
    public static int linSearch(int []nums,int key){

       for(int i=0;i<nums.length;i++){
        if(nums[i]==key){
            return i;
        }
       }return -1;
    }
    public static void main(String[]args){
        int nums[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;
        int in=linSearch(nums,key);
        if(in==-1){
            System.out.println("Key is not found." );
        }else{
        System.out.println("Key is found at index "+in);
        }
    }
    
}
