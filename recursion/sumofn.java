package recursion;

public class sumofn {
     public static int sumcalc(int n){
        if(n == 1){
            return 1;
        }

        int sum = sumcalc(n-1);
        int fsum = n+sumcalc(n-1);
        return fsum ;
     }
    public static void main(String[] args) {
        int n = 5 ;
       System.out.println("sum of n : " + sumcalc( n)); 
    }
    
}
