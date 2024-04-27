public class trappedWater {
    public static int trappedWaterLevel(int height[]){
        //calculate left boundary
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        for(int i=0; i<n; i++){
            System.out.print(leftMax[i] + " ");
        }
        System.out.println();

        // calculate right boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i=0; i<n; i++){
            System.out.print(rightMax[i] + " ");
        }
        //calculate the trapped rain water 
        int waterTrapped = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += waterlevel - height[i];
        }
        return waterTrapped;

    }

    public static void main(String arg[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println();
        System.out.println(trappedWaterLevel(height));
    }
}
