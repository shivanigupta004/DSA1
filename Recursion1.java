public class Recursion1 {

    public static void printDec(int n) {
        if(n == 1){
           System.out.println(n);
           return;
        }
       System.out.print(n +" ");
       printDec(n-1);
    }

    public static void printInc(int n) {
         if(n == 1){
           System.out.print(n +" ");
           return;
        }
        printInc(n-1);
        System.out.print(n +" ");

    }

    public static int factoriaL(int n) {
      if(n == 0){
         return 1;   
         }
      int fact1 =  factoriaL( n - 1);
      int fn = n * fact1;
      return fn;
    }

    public static int sumOfN(int n) {
      if(n == 1){
         return 1;   
         }
      int sum1 =  sumOfN( n - 1);
      int sum = n + sum1;
      return sum;
    }

    public static int fibonacci(int n) {
      if(n == 1 ||(n == 0)){
         return n;   
      }
      int fibN1 = fibonacci(n - 1);
      int fibN2 = fibonacci(n - 2);

      return fibN1 + fibN2;
    }
    
    //check whether array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }

       return isSorted(arr, i+1);
    }
    
//first Occurrence in an array
    public static int firstOccurence(int arr[], int key, int i) {
         if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key ,i+1);
    }

    //last Occurence in an array
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    //print x^n
    public static int power(int x, int n) {
       if(n == 0) {
        return 1;
       }
       // int xnm1 = power(x, n-1);
       // int xn = x * xnm1;
       //return xn;
       return x * power(x, n-1);
    } 

    //optimized x^n
    public static int optimizedPower(int a, int n) {
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2) ;
        int halfPowersq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }
    
    public static void main(String[] args) {
       // printDec(11 );
       //printInc(10);
       
       /*int a = factoriaL(5);
       System.out.println(a);  */

       /*int b =sumOfN(5);
       System.out.println(b);  */
       
       //System.out.println(fibonacci(9)) ;

        /*int arr[] = {1,2,3,4};
        System.out.println(isSorted(arr, 0));  */
   
        /*int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, 0));    */

       // System.out.println(power(2, 10));
       
       System.out.println(optimizedPower(2, 0));

    }
}
