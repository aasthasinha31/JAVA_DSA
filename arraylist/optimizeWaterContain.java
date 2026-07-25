package arraylist;
import java.util.ArrayList;

public class optimizeWaterContain {
    public static int waterstore(ArrayList<Integer> Height) {

        int maxwater = 0 ;
        int lp = 0 ;
        int rp = Height.size()-1;

        while(lp<rp){
            int height = Math.min(Height.get(lp) , Height.get(rp));
            int width = rp - lp;
            int currwater = height * width;
            maxwater = Math.max(maxwater , currwater);

            if(Height.get(lp) < Height.get(rp)){
                lp++;
            } else{
                rp--;
            }
           
            
            
        }

        return maxwater;


    }

    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7); 
        
        System.out.println("Max water contain : " +  waterstore( Height));


    }
    
}
