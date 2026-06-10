package devideandconquer;

public class mergersort {
     public static void sorting(int array[] , int si , int ei){
      int mid = si +(ei-si)/2;
      //base case
      if(si>=ei ){
       return;
      }
      //left
      sorting(array ,si , mid);
      
      //right
      sorting( array, mid +1 , ei);

      //merge to make 1 sorted array
      merge( array , si , mid , ei);
    }
    

    public static void merge( int array[] ,int si , int mid, int ei ){
       int temp[] = new int[ei-si+1];
       int i = si; //for lrft
       int j = mid+1;// for right
       int k = 0;// for temp

       while( i <= mid && j <= ei ){
          if(array[i]< array[j]){
             temp[k] = array[i];
              i++;
          }
          else{
            temp[k] = array[j];
              j++;
          }
          k++;

        }

        while (i<=mid) {
            temp[k++] = array[i++];
        }

        while (j<=ei) {
            temp[k++] = array[j++];
        }

        for(k = 0 , i = si ; k <temp.length ; i++, k++){
            array[i] = temp [k];
        }


    }



    public static void print(int array[]){
        for(int i = 0 ; i<array.length;i++){
            
            System.out.print(array[i] + " ");
        }
        System.out.println();
       }

    public static void main(String[] args) {
        int array[] = { 6,3,9,5,2,8};
        sorting(array , 0 , array.length-1);
        System.out.println("your sorted array :");
        print(array);
    }
    
}
