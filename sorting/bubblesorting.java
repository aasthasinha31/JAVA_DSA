package sorting;

public class bubblesorting {
    //to sort array
    public static void soting(int arr[]){
       for(int turn = 0 ; turn < arr.length-1 ; turn++){
        int swap = 0;
        for(int j = 0 ; j < arr.length-1 - turn ; j++){
            if( arr[j] > arr[j+1]){
                //swap
               int temp = arr[j] ;
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;

            }

         }

         //time optimization
          if (swap == 0) {
                break;
            }
       }
            
    }
       //print
       public static void print(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       }

    
    public static void main(String[] args) {
        int arr[] = { 3,4,5,2,1};
        soting(arr);
        print(arr);

    }
    
}
