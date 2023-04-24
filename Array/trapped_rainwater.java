public class trapped_rainwater {
    public static int trapped(int height[]){
        int n= height.length;
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i=n-1; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedWater =0;
        for(int i=0; i<n; i++){
            int waterlevel =Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterlevel - height[i];
        }
        
        return trappedWater;

    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped(height));

    }
}