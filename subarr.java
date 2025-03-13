public class subarr {
    public static void subArray(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {   
            for(int j=i;j<arr.length;j++)
            {   int sum=0;
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                 count++;
                for(int k=i;k<=j;k++)
                {
                     System.out.print(arr[k]+" ");
                     sum=sum+arr[k];
                     if(min>arr[k]){
                        min=arr[k];
                     }
                     if(max<arr[k]){
                        max=arr[k];
                     }
                }System.out.println();
                System.out.println("sum of above array is "+sum);
                System.out.println("min of above array is "+min);
                System.out.println("max of above array is "+max);
            }System.out.println();
        }

        System.out.println("Total no of subarrays is "+count);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArray(arr);
    }
}
