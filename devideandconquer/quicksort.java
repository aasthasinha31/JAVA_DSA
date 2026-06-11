

public class quicksort{
    public static void sorting(int arr[] , int si , int ei){
       if(si>=ei){
        return;
       }



        int pInx = partition(arr , si , ei);
        sorting(arr,  si , pInx-1); // left
        sorting( arr , pInx+1 , ei);//right
    }

    public static int partition(int arr[] , int si , int ei){
         int pivot = arr[ei];
         int i = si-1;

         for(int j = si ; j < ei ; j++){
            if(arr[j] <= pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
         }
         i++;
         int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;

    }

    public static void print(int array[]){
        for(int i = 0 ; i<array.length;i++){
            
            System.out.print(array[i] + " ");
        }
        System.out.println();
       }

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        sorting(arr , 0 , arr.length-1);
        System.out.println("your sorted array :");
        print(arr);
       }
}