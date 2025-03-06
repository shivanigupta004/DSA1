public class palindrome {
    public static void palindronee(int a) {
        int b = a;
        int rev = 0;
    
        while (a > 0) {
            rev = rev * 10 + a % 10 ;
            a /= 10;
        }
        if (b == rev) {
            System.out.println(b + " is a palindrome.");
        } else {
            System.out.println(b + " is Not a palindrome.");
        }
    }
    public static void main(String[] args) {
        palindronee(122);
        palindronee(121);
    }
    
}
