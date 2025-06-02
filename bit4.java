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
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(countSetBits(15));
    }
}