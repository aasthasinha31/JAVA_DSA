public class maxsubarray{

     public static void printarrays(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j = i ; j < numbers.length ; j++){
            int end = j;
            int sum = 0;
            
            for(int k = start ; k <=end ; k++) {
              System.out.print(numbers[k]+ " " );
              sum = sum + numbers[k];
               }
                    System.out.println(" = " +sum);
                    if(maxsum < sum){
                        maxsum = sum;
                    }
            }
            System.out.println();
        }
       System.out.println("max sum from all subarrays:" + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        printarrays(numbers);
    }
    
}
