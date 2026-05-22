import java.util.Scanner;

public class pairs {
    public static void pairing(int numbers[]){
        //taking number on x axis (x,y)
        for(int i = 0 ; i < numbers.length; i++){
            int curr = numbers[i];
        //taking number on y axis (x,y) 
            for(int j = i+1 ; j< numbers.length ; j++){
             System.out.println("(" + curr + "," + numbers[j] + ")");
            }
        }
    }
    public static void main(String[] args) {

   
        System.out.println("enter size of array:");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];
       
        System.out.println("enter data:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
                 }
        pairing(numbers);
    }
    
}
