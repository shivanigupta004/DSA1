public class SingleNum{
    public static int singleNumber(int nums[]){
        int single = nums[0];
        for(int i = 1; i < nums.length;i++){
            single = single ^ nums[i];
        }
        return single;
}
public static void main(String args[]){
 int [] nums = {1,2,1,2,4};
 System.out.println(singleNumber(nums));
}
}