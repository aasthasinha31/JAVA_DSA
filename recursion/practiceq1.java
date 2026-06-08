package recursion;

public class practiceq1 {
    public static void ocurence( int num[] , int key , int i){
    if(i == num.length){
            return;
        }

    if( key == num[i]){
       System.out.println(i);;
     }
     ocurence(num ,  key ,  i + 1);
    

    }
    public static void main(String[] args) {
        int num[] = {2,4,0,6,3,4,9,4};
        ocurence( num , 4 , 0);
    }
    
}
