package arraylist;

import java.util.ArrayList;

public class maxocurrence {
    public static int findocurrence( ArrayList<Integer> num , int key) {

        int []result = new int[1000];

        for(int i = 0 ; i<num.size()-1 ; i++){
           if(num.get(i) == key){
            result[num.get(i+1)-1]++;
           }

        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0 ; i<1000 ; i++){
            if(result[i] > max){
                max = result[i]; 
                ans = i+1;
            }
        }

        return ans;
        
    }


    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(100);
        num.add(200);
        num.add(1);
        num.add(100);
       
        int key = 1;;
        
      System.out.println( findocurrence( num ,  key));


    }
    
}
