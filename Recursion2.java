public class Recursion2 {

    public static int tilingProblem(int n) { //2 x n (floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical tiles choice
        int fnm1 = tilingProblem(n - 1);

        //horizontal tiles
        int fnm2 = tilingProblem(n - 2);
        
        int totWays = fnm1 + fnm2;
        return totWays;
    }


    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[] ) {
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx +1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        //System.out.println(tilingProblem(4));

        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

