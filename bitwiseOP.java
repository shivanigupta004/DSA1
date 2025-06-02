public class bitwiseOP {
    public static void oddEvenChecker(int n) {
        int bitMask = 1;  //1=001
        if((n & bitMask) == 0 ){
            System.out.println(n+" is even.");
        }else{
            System.out.println(n+" is odd.");
        }
    }
    public static void getIthBit(int n,int i) {
        int bitmask = (1<<i);
        if((n & bitmask )== 0){
            System.out.println(i+"th bit of "+n+" is : 0.");
        }else{
            System.out.println(i+"th bit of "+n+" is : 1.");
        }
    }
    public static void setIthBit(int n,int i) {
        int bitmask = (1<<i);       //10 =1010
        n |= bitmask ;         //bitmask =0100
        System.out.println(n);       //n =1110
    }
    public static void clearIthBit(int n,int i) {
        int bitmask = ~(1<<i);       //10 =1010, i=1
        n &= bitmask ;          //bitmask =1101
        System.out.println(n);       //n =1000
    }

    public static void main(String[] args) {
        /*
        System.out.println(5 & 6);   //5 = 101
        System.out.println(5 | 6);   //6 = 110
        System.out.println(5 ^ 6);
        System.out.println(~ 0);
        System.out.println(4>>1);  //right shift by _ place 4/2^1
        System.out.println(4<<2);  //left shift by _ place 4*2^2
       */
        //right shift operations
        oddEvenChecker(6);
        getIthBit(10, 2);
        setIthBit(10, 2);
        clearIthBit(10, 1);
    }
    
}
