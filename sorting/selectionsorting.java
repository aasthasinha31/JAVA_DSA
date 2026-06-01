package sorting;

public class selectionsorting {
    public static void selection(int arr[]){
        for(int i = 0 ; i < arr.length-1; i++){
            int currpos = i ;
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[currpos] > arr[j]){
                    currpos = j;
                }
            }
            int temp = arr[currpos];
            arr[currpos] = arr[i];
            arr[i] = temp;
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
        selection(arr);
        print(arr);

    }
}
