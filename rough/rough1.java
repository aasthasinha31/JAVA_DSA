package rough;

public class rough1 { 
    public static void printnum(int n){
       if(n == 1){
        System.out.println(n);
        return;
       }
      
       printnum(n-1);
        System.out.println(n + " ");
     }
    public static void main(String[] args) {
        int n = 50;
        printnum(n);
    }
    
}

    

