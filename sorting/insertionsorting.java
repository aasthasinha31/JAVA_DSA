package sorting;

public class insertionsorting {
     public static void sorting(int arr[]){
        // findinf the correct position
        for(int i = 1 ; i <arr.length ; i++){
            int current = arr[i] ;
            int prev = i-1;
            while( prev>= 0 && arr[prev] > current){
               arr[prev + 1] = arr[prev];
               prev--;
            }
        //insertion
          arr[prev + 1] = current;
        }
     }

     public static void print(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       }

     public static void main(String[] args) {
        int arr[] = { 3,4,5,2,1};
        sorting(arr);
        
        print(arr);

    }
    
}
