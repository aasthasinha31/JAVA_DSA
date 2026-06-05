package recursion;

public class factorial {
    public static int printfac(int n){
        if(n == 0){
           
            return 1;
        }

        int sum =  printfac(n-1);
        int fact = printfac(n-1)*n;
        return fact;
       
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printfac(n));
    }
    
}
