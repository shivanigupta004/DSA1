import java.util.Scanner;

public class stringgg1 {
    public static void  start(String str){
        for(int i = 0; i < str.length() ;i++){
            System.out.print(str.charAt(i)+" ");
        }

    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd" ;
        String str1 = new String("abcd@#$123") ;

        //strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
       /*  String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String first = "shivani";
        String last = "gupta";
        String fullname = first +" "+last;
        System.out.println(fullname);
        System.out.println(fullname.charAt(0));   */
        start(str);
    }
    
}
