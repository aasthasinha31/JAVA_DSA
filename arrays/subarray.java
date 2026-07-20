public class subarray {

    public static void printarrays(int numbers[]) {
        int ts=0;
        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j = i ; j < numbers.length ; j++){
            int end = j;
            for(int k = start ; k <=end ; k++) {
              System.out.print(numbers[k] + " ");
             
              
            }
           
            System.out.println();
            }
            System.out.println();
        }
        ts = numbers.length*(numbers.length+1)/2;
        ts++;
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        printarrays(numbers);
    }
    
}
