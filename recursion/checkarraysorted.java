package recursion;

public class checkarraysorted {
    public static boolean issorted(int arr[] , int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1]){
             return false; 
        }
        return issorted(arr , index+1);
    }
    public static void main(String[] args) {
        int arr[] ={ 4,3,6,1,2};
        System.out.println( issorted(arr , 0)); 
    }
    
}
