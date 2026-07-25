package arraylist;
import java.util.ArrayList;

public class pairsum {

public static int sum( ArrayList<Integer> Height , int target) {
        int lp = 0 ;
        int rp = Height.size()-1;


        while( lp != rp){
            if(Height.get(lp) + Height.get(rp)== target){
              return 1;
            }
            else if(Height.get(lp) + Height.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }

        }


    return 0;
}

public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(2);
        Height.add(3);
        Height.add(4);
        Height.add(5);
        Height.add(6);

        int target = 5;
        
       System.out.println(sum( Height ,  target));


    }
    
}
