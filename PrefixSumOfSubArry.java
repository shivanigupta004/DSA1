public class PrefixSumOfSubArry {
    public static void subArray(int arr[]){
       int prefix[]=new int[arr.length];
       int currsum=0;
       int minsum=Integer.MAX_VALUE;
       int maxsum=Integer.MIN_VALUE;

          prefix[0]=arr[0];
          //calculate prefix sum
       for(int p=1;p<prefix.length;p++){
            prefix[p]=prefix[p-1]+arr[p];
       }

        for(int i=0;i<arr.length;i++)
        {   int start=i;
            for(int j=i;j<arr.length;j++)
            {   int end=j;

                currsum = start==0 ? prefix[end] : prefix[end]-prefix[end-1];
                
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                if(minsum>currsum){
                    minsum=currsum;
                }
            }
        }
        System.out.println("max sum of subarrays is "+maxsum);
        System.out.println("min sum of subarrays is "+minsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        subArray(arr);
    }
    
}
