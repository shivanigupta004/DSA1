public class StrCompression {
    public static String stringzCompression(String str) {
        //O(n)
        StringBuilder sb = new StringBuilder("");
        for(Integer i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1  &&  str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccddd";
        System.out.println(stringzCompression(str));
    }
}
