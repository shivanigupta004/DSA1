public class bit3 {
    public static int clearIBits(int n,int i) {
    int bitmask =(~0)<<i; //bitmast= 1100, 15= 1111
    return n & bitmask;   //12= 1100
}
public static int clearIBitsInRange(int n, int i, int j) {
    int a = ((~0)<<(j+1)); //1100000
    int b = (1<<i)-1;      //0000011
    int bitmask = a | b;   //1100011
    return n & bitmask;
}
    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
        System.out.println(clearIBitsInRange(10,2,4));
    }
}
