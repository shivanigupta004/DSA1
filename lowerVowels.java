public class lowerVowels {
    public static String lowerCaseVowels(String str) {
        int count=0;
        for(int i=0;i<str.length(); i++){
            
            if(str.charAt(i)=='a'  ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
                count ++;
            }
        }
    return "No of lower case vowels is : "+ count;
    }
    public static void main(String[] args) {
        String str = "Apple is a good for health";
        System.out.println(lowerCaseVowels(str));
    }
}
