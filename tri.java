public class tri {
    public static void main(String[]args){
          int k=1;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++)  {
                System.out.print(k++);
                if(k>9){
                    k=1;
                }
                }System.out.print("\n");
            } 
            
            for(int i=1;i<=5;i++){
                for(int j=1;j<=7;j++){
                     if(i==2||i==4||i+j==5||j-i==3||i-j==1){
                        System.out.print("*");
                     }else{
                        System.out.print(" ");
                     }
                }System.out.println();
        }  
}
}