public class countingSorting {

    public static void countingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest,arr[i]);
        }

        int count[] =  new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        
        //sorting
        int j = 0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
     public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,5,5,3,4,5,1};
        System.out.print("Before Sorting arr : ");
        printArr(arr);
        countingSort(arr);
        System.out.print("After  Sorting arr : ");
        printArr(arr);
    
    }
}
