package recursion;

public class poweronx {
    public static int power(int x , int n){
    if(n==0){
        return 1;
    }

    int pow = power(x, n-1);
    int result = x * pow;
    return result;

    }
    public static void main(String[] args) {
        
        System.out.println(power(2 , 10));
    }
    
}
