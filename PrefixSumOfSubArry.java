public class PrefixSumOfSubArry {
    public static void subArray(int arr[])
    {
       int prefix [] = new int[arr.length];
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
       prefix[0] = arr[0];
        //Calculate prefix sum
        for(int i = 1; i < prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++)
        {   
            int start = i;
            for(int j = i; j < arr.length; j++)
            {   
                int end = j;
                //Calculate current sum
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currsum)
                {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum is: " + maxsum);
    }
    
    public static void main(String args [] )
    {
        int arr[] = { 1,-2,6,-1,3 };
        subArray(arr);
    }
}
