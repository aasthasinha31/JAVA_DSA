package recursion;

public class pairing {
    public static int pair(int n){
        if(n == 1 || n ==2){
            return n;
        }


        int single = pair(n-1);
        int pairs = single * pair(n-2);
        int totalways = single + pairs;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(pair(4));
    }
    
}
