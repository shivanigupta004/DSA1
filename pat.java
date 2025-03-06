public class pat {
    public static void main(String[] args) {
        int rows = 5;
    
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2* i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int row = 5;
        
        for (int i1 = 1; i1 <= row; i1++) {
            for (int j1 = row - i1; j1 > 0; j1--) {
                System.out.print(" ");
            }
            for (int k1 = 1; k1 <= 2* i1 - 1; k1++) {
                System.out.print(i1);
            }
            System.out.println();
        } 
    }  
    
}
