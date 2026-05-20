public class prime {
    public static boolean isprime(int n) {
           boolean isprime = true ;
           for (int i = 2 ; i <= n-1 ; i++){
                 if(n % i == 0){
                    isprime = false ;
                 }

            //optimized code loop upto root of n
            //   for (int i = 2 ; i <= (int)Math.sqrt(n); i++){
            //    if(n % i == 0){
            //     isprime = false ;
            //    }


            //find prime number in range
            //   for (int i = 2 ; i <= n; i++){
            //    if(isprime(i)){
            //     print(i); // agr i jo pass hua vo prime number ha to i print hoga nh
            //    }
           }
           return isprime;
    }
    public static void main(String[] args) {
       System.out.println(isprime(89));
    }
    
}
