public class transpose {
    public static void transposeOfMatrix(int arr[][] ,int transposeMatrix[][]) {
        int n = arr.length;
        int m = arr[0].length;

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               transposeMatrix[j][i] = arr[i][j] ;
            }
        }

    }
    public static void PrintArr(int transposeMatrix[][] ) {
       for(int i=0;i<transposeMatrix.length;i++){
            for(int j=0;j<transposeMatrix[0].length;j++){
              System.out.print( transposeMatrix[i][j] +" ");
            }
            System.out.println();
        }  
    }
   
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
        int[][] transposeMatrix = new int[arr.length][arr[0].length];
        transposeOfMatrix(arr,transposeMatrix);
        PrintArr(transposeMatrix);
    }
    
}
