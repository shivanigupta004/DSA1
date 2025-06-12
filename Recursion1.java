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
    
   public static int fibonacc(int n) {
      if(n == 1 ||(n == 0)){
         return n;   
      }
      int fibN1 = fibonacci(n - 1);
      int fibN2 = fibonacci(n - 2);

      return fibN1 + fibN2;
    }
    public static void main(String[] args) {
       // printDec(11 );
       //printInc(10);
       
       /*int a = factoriaL(5);
       System.out.println(a);  */

       /*int b =sumOfN(5);
       System.out.println(b);  */
       
       //System.out.println(fibonacci(9)) ;
    }
}
