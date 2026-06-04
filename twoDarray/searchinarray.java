package twoDarray;

import java.util.Scanner;

public class searchinarray {
    public static boolean search( int matrix[][] ){
         System.out.println("enter your key" );
        Scanner sc = new Scanner(System.in);
        int key = sc .nextInt();
       
        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[0].length; j++){
               if( matrix[i][j] == key){
                System.out.println("found at cell: "+ " ( " + i + " , " + j + " ) ");
                return true;
               }
            }
            
        }
        System.out.println("not found");
        return false;
       
    }
    public static void main(String[] args) {
        
        int matrix[][] = new int [4][4];
        int n = 4;
        int m = 4;
        System.out.println("enter your datas:");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        
         for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
            
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix);
        
    }
}
