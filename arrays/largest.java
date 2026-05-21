import java.util.*;

public class largest {
    public static int compare(int numbers[]){
          int largest_no = Integer.MIN_VALUE;
          for(int i = 0 ; i < numbers.length ; i++){
            if(largest_no < numbers[i] ){
                largest_no = numbers[i];
                
            }
          }
          return largest_no;

    }
    public static void main(String[] args) {
        int numbers[] = {1,8,2, 5, 7,9};
        compare( numbers);
    }
    
}
