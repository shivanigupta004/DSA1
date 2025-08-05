public class patterns2 {
    public static void hollow_rectangle(int row, int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } System.out.println();
        }

    }
     public static void IaRHpyramid(int row, int col){

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                  System.out.print(" ");
            } 
            for (int j = 1; j <= i; j++) {
                  System.out.print("*");
            }System.out.println();
        }
    }
    public static void IhalfPYRAMID(int n){
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }System.out.println();
            } 
        }

     public static void floyds_triangle(int n) {
        int a = 1;
        for( int i = 1;i <= n; i++ ){
            for( int j = 1;j <= i; j++ ){
                System.out.print(a +" ");
                a++;
           }System.out.println();
        }
     }  
     public static void Zero_one_triangle(int n) {
        
        for( int i = 1;i <= n; i++ ){
            for( int j = 1;j <= i; j++ ){
                if((i+j) % 2 == 0)//even
                {
                System.out.print( 1+" ");
            }else{
                System.out.print( 0+" ");//odd
            }
           }System.out.println();
        }
     } 
     public static void butterfly(int n){
        //1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                  System.out.print("* ");  //star = i
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                  System.out.print("  ");  //space = 2*(n-i)
            }
            for (int j = 1; j <= i; j++) {
                  System.out.print("* ");  //star = i
            } System.out.println();
        }
        //2nd half
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                  System.out.print("* ");  //star = i
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                  System.out.print("  ");  //space = 2*(n-i)
            }
            for (int j = 1; j <= i; j++) {
                  System.out.print("* ");  //star = i
            } System.out.println();
        }
    }
    public static void solid_rhombus(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++) {
                  System.out.print(" ");  //space = n-i
            }
            for (int j = 1; j <= n; j++) {
                  System.out.print("* ");  //star = i
            } System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
       // spaces
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++) {
                  System.out.print(" ");  //space = n-i
            }
            //stars -- hollow rectangle code
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");   //star 
                } else {
                    System.out.print("  ");  // else space
                }
            } System.out.println();
        }
    }
    public static void diamond_pattern(int n){
        //1st half
        for(int i = 1; i <= n; i++){
            //spaces 
            for (int j = 1; j <= n-i; j++) {
                  System.out.print("  ");  //space = n-i
            }
            //stars
            for(int j = 1; j <= 2*i - 1; j++){
                 System.out.print("* "); 
            }System.out.println();
        }
        //2nd half
        for(int i = n; i >= 1; i--){
            //spaces
            for (int j = 1; j <= n-i; j++) {
                  System.out.print("  ");  //space = n-i
            }
            //stars
            for(int j = 1; j <= 2*i - 1; j++){
                 System.out.print("* "); 
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        // int row = 4;
        // int col = 5;
        //hollow_rectangle(row,col);
        //IaRHpyramid(4,4);
        //IhalfPYRAMID(5);
        //floyds_triangle(5);
        //Zero_one_triangle(5);
        //butterfly(4);
        //solid_rhombus(5);
        // hollow_rhombus(5);
        diamond_pattern(4);
    }
}