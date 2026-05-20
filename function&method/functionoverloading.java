public class functionoverloading {
    //parameter type overloading
    //sum of 2 ints
    public static int sum(int a , int b){
        return a+b;
    }
    //sum of 3 ints
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    //sum of 4 ints
    public static int sum(int a , int b ,int c,int d){
        return a+b+c+d;
    }


    //data type overloading
    public static float sum(float a , float b ){
        return a + b ;
    }

    
    public static void main(String[] args){
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,6));
        System.out.println(sum(2,3,7,8));
        System.out.println(sum(0.2F,3.8F));
    }
}
