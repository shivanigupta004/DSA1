import java.util.Arrays;
public class multipleNum {
    public static boolean atLeastTwice(int nums[])
     {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) 
        {     // Duplicate found
            return true;
        }
      }   
      return false;
}
public static void main(String args[]){

 int [] nums = {1,2,3,1};
 System.out.println( atLeastTwice (nums));
}
}