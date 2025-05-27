public class SpiralMatrixes {

    public static void spiralmatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = 3;    //matrix.length -1 
        int endCol = 3;    //matrix[0].length -1  

        while(startRow <= endRow && startCol <= endCol  ){
           //top
            for(int j=startCol ; j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1 ; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1 ; j>=startCol;j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1 ; i>startRow;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {{ 1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  // A 4x4 matrix
        spiralmatrix(matrix);
    }
}
