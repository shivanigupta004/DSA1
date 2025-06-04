public class bit4 {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static int countSetBits(int n) { 
        //O(log n)  no of one's
        //n = log n + 1 bits
        int count = 0;
        while(n>0) {
            if((n & 1) !=0){ //check our lsb
               count++;
            }
            n = n>>1;
        }return count;
    }
    public static int fastExponential(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { //check lsb
                ans *= a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(countSetBits(15));
        System.out.println(fastExponential(5, 3));

          int x = 6 ;
        System.out.println(-~x);
    }
    }
}