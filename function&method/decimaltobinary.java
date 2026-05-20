public class decimaltobinary {
    public static void convert(int decnum){
        int mynum=decnum;
        int binnum = 0 ;  
        int pow = 0;
        while(decnum > 0) {
           int rem = decnum % 2;
           binnum = binnum +( rem * (int)Math.pow(10, pow));
           pow++;
           decnum = decnum/2;

        }
        
           System.out.println("binary of " + mynum + "=" + binnum);       
        
    }
    public static void main(String[] args) {
        convert(2);
    }
    
}
