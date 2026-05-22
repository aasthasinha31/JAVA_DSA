import java.util.Scanner;

public class binarysearch {
    public static void search(int numbers[] , int key){
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                System.out.println("found at index:" + mid);
                return;
            }
            if(numbers[mid] < key ){
            start = mid +1;
           } 
            else{
                end = mid - 1;
            }
        }
         System.out.println("NOT FOUND");
    }
    public static void main(String[] args) {
         int numbers[]= {1,3 ,6, 8, 9,10,17,34 };
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        search(numbers, key);

        sc.close();
        
       
    }
    
}
