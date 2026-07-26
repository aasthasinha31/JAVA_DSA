package arraylist;
import java.util.ArrayList;
import java.util.ArrayList;
public class pairsum2 {
    public static boolean sum( ArrayList<Integer> num , int target) {
          
        int breakingpt = -1;
        for(int i = 0; i<num.size(); i++){
            if(num.get(i) > num.get(i+1)){
                breakingpt = i ;
                break; 
            }
        }


        int lp = breakingpt +1;
        int rp = breakingpt;

        while(lp!= rp){
            //case 1
            if(num.get(lp)+num.get(rp) == target ){
                return true;
            }

            //case 2
            else if(num.get(lp)+num.get(rp) <  target){
                lp = (lp+1) % num.size();

            }

            //case3
            else{
                rp = (num.size()+rp-1)%num.size();
            }

        }

        return false;
        
        
    }



    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(15);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(10);

        int target = 16;
        
       System.out.println(sum(num ,  target));


    }
}
