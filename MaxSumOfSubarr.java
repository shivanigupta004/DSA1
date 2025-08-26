public class MaxSumOfSubarr {

        public static void subArray(int arr [] )
        {
            int currSum = 0;
            int maxsum = Integer.MIN_VALUE;

            for(int i = 0; i < arr.length; i++)
            {   
                for(int j = i; j < arr.length; j++)
                {   
                    currSum = 0;
                    for(int k = i; k <= j; k++)
                    {
                         currSum += arr[k];
                    } 
                    System.out.println("Current sum : " + currSum);
                     if(maxsum < currSum){
                        maxsum = currSum;
                    }
                }
                System.out.println();
            }
            System.out.println("Maximun sum of subarrays : " + maxsum);
        }
        
        public static void main(String args [] )
        {
            int arr[]={2,4,6,8,10};
            subArray(arr);
        }
}
    

