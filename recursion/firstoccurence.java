package recursion;

public class firstoccurence {
    public static int search( int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }


        if(key == arr[i]){
            return i;
        }
       return search( arr ,key , i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,5,3,9,5,6};
        System.out.println( search( arr , -5 ,  0));
    }
    
}
