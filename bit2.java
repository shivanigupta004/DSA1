public class bit2 {
    public static int setIthBit(int n,int i) {
        int bitmask = (1<<i);       //10 =1010
        n |= bitmask ;         //bitmask =0100
        return (n);                  //n =1110
    }
    public static int clearIthBit(int n,int i) {
        int bitmask = ~(1<<i);       //10 =1010, i=1
        n &= bitmask ;          //bitmask =1101
        return n;                     //n =1000
    }
    
    //main code part for updating a bit
    public static int updateIthBit(int n, int i, int newBit) {
       /* if(newBit == 0){
            return clearIthBit(n,i);
        }else{
            return setIthBit(n,i);
        }*/ 
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;

    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
       
    }
    
}
