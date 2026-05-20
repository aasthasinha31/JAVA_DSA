public class binarytodecimal {
    public static void convert(int binnum){
        int num = binnum;
        int pow = 0 ;
        int decnum = 0;

        while(binnum > 0){
            int lastdig = binnum%10;
            decnum = decnum + (lastdig * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;

        }
        System.out.println("binary number of :" + num + " = " + decnum);
    }
    public static void main(String[] args) {
       convert(10001);
    }
    
}
