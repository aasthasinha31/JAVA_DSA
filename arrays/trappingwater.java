public class trappingwater {
    public static int calculate(int heights[]) {
        int n = heights.length;
        //max of left side 
        int maxleft[] = new int[n];
        maxleft[0] = heights[0];
        for(int i = 1 ; i<n ; i++){
          maxleft[i] = Math.max(heights[i] , maxleft[i-1])  ;
          }

          //max of right side
        int maxright[] = new int[n];
        maxright[n-1] = heights[n-1];
        for(int i = n-2 ; i>=0 ; i--){
          maxright[i] = Math.max(heights[i] , maxright[i+1])  ;
          }

          //loop
        int trapped_water = 0;
        for(int i = 0 ; i<n ; i++){
            int waterlevel = Math.min(maxleft[i] , maxright[i]);
             trapped_water += waterlevel - heights[i]; 
            
        }
        return  trapped_water;


    }
    public static void main(String[] args) {
        int heights[] = {2,3,4,5,1,3};
        System.out.println(calculate(heights));
    }
    
}
