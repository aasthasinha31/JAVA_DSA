package recursion;

public class lastocurrence {
    public static int search( int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }

        int found = search( arr ,key , i+1);
        if(found != -1){
            return found;
        }
        if(key == arr[i]){
            return i;
        }
       return found;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,5,3,9,5,6};
        System.out.println( search( arr , 5 ,  0));
    }
    
}
