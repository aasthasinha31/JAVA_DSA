package twoDarray;

public class practiceq1 {
    public static void search(int matrix[][] ){
        int count = 0;
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
               if(matrix[i][j] == 7){
                  count++;
               }

            }
       
        }
         System.out.println("count of 7 is : " + count);

    }

    public static void main(String[] args) {
        int matrix[][] = {{2,3,7},
                           {6,8,7}};
        search(matrix);                 
        
    }
    
}
