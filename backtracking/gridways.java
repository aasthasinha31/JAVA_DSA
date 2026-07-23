package backtracking;

public class gridways {
    public static int Gridcount(int i , int j, int n , int m) {

        if( i == n-1 && j == m-1){
              return 1;
        }
        else if( i ==n || j==n){
            return 0;
        }


        int rightwards =  Gridcount(i+1 , j,  n , m);
        int downwards = Gridcount(i , j+1,  n , m);
        int totalways = rightwards + downwards;
        return totalways;

        
    }

    public static void main(String[] args) {
        int n = 3 , m = 3;
        System.out.println("total ways to reach n-1 and m-1 : " + Gridcount(0 , 0,  n , m));
    }
    
}
