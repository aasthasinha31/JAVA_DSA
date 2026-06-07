package recursion;
public class tilingproblem {
    public static int totalways(int n){
       if(n == 0 || n ==1){
           return 1;
       }

        int vertical = totalways(n-1);
        int horizontal = totalways(n-2);
        int ways= vertical + horizontal;
        return ways;

    }
    public static void main(String[] args) {
        
        System.out.println(totalways(3));
    }
}
