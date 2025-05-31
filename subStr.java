public class subStr {
    public static String substring(String str, int si ,int ei){
        String substr = "";   
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //Substring
        String str = "shivanigupta";
        System.out.println(str.substring(0, 12));
        System.out.println(substring(str, 0, 7));
        System.out.println(substring(str, 7,str.length()));
    }
    
}
