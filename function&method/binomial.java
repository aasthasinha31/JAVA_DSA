import java.util.Scanner;

public class binomial{

    public static int factorial( int n) {
        int f = 1;
        for(int i =1 ; i<= n ; i++){
            f= f*i;
        }
        return f;
    }
    public static int Binomial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bio = a / (b*c) ;
        
        return bio;

    }


    public static void main(String[] args) {
     

    System.out.println("Binomial:" + Binomial());
     
    }
} 
    

