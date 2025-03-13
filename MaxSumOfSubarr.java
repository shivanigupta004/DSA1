public class MaxSumOfSubarr {

        public static void subArray(int arr[]){
            int count=0;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++)
            {   
                for(int j=i;j<arr.length;j++)
                {   int sum=0;
                    
                     count++;
                    for(int k=i;k<=j;k++)
                    {
                         System.out.print(arr[k]+" ");
                         sum=sum+arr[k];
                         
                    }System.out.println();
                    if(min>sum){
                        min=sum;
                     }
                     if(max<sum){
                        max=sum;
                    }
                    System.out.println("sum of above array is "+sum);
                    
                }System.out.println();
            }
    
            System.out.println("Total no of subarrays is "+count);
            System.out.println("min sum of subarrays is "+min);
            System.out.println("max sum of subarrays is "+max);
        }
        public static void main(String args[]){
            int arr[]={2,4,6,8,10};
            subArray(arr);
        }
}
    

