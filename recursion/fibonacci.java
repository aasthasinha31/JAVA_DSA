package recursion;

public class fibonacci {
    public static int fibo(int n ){
       if(n == 0 || n == 1){
        return n;
       }
        

       int sum1 = fibo( n-1);
       int sum2 = fibo(n-2);
       int fsum= sum1+sum2;
       return fsum;
      

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n ));
    }
    
}
