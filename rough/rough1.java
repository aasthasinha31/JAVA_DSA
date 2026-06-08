package rough;

public class rough1 {
    public static int pair(int n){
        if(n == 1 || n ==2){
            return n;
        }


        
        return pair(n-1) + pair(n-1) * pair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
    
}
