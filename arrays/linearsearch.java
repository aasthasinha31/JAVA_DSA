package arrays;

public class linearsearch {
    public static void search( int number[] , int key){
        for(int i = 0 ; i < number.length ; i++){
           if(number[i] == key ) {
                 System.out.println(i);
           }
           
        }
         
    }
    public static void main(String[] args) {
        int number[] = { 1 , 23 , 48 , 294 , 27 , 345 , 234 ,9} ;
        int key = 9;
        search(number ,key);
        
    }
    
}
