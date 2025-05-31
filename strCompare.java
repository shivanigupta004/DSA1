public class strCompare {
    public static void comparision(String str){

    }
    public static void main(String[] args) {
        String s1 = "sonu";
        String s2 = "sonu";
        String s3 = new String("sonu");

        if (s1 == s2){
            System.out.println("Strings are equal.");
        }else{
             System.out.println("Strings are not equal.");
        }

         if (s1 == s3){
            System.out.println("Strings are equal.");
        }else{
             System.out.println("Strings are not equal.");
        }

         if (s1.equals(s3)){
            System.out.println("Strings are equal.");
        }else{
             System.out.println("Strings are not equal.");
        }
    }
}
