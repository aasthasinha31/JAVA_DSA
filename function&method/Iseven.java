public class Iseven {
    public static boolean evenornot(int n ) {
        boolean iseven = true;
        
        if( n%2!=0 ) {
            iseven = false;
            
        }
        return iseven;
        
    }

    public static void main(String[] args) {
        System.out.println(evenornot(87));
    }

    
}
