public class Recursion2 {

    public static int tilingProblem(int n) { //2 x n (floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        
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

    
    public static int friendsPairing(int n) { //2 x n (floor size)
        //base case
        if(n==1 || n==2){
            return n;
        }
        /* 
        //single choice
        int fnm1 = friendsPairing(n - 1);

        //pair choice
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n-1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;   */
        
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }



    public static void main(String[] args) {
        //System.out.println(tilingProblem(4));

      /*   String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);  */

        int r = friendsPairing(3);
        System.out.println(r);
    }
}

