class Solution {
    public int trap(int[] height) {

      int n= height.length;

        int water = 0;
        for(int i=0;i<n;i++) {
            int left = 0;
            for(int j=0;j<=i;j++) {
                left = Math.max(left, height[j]);
            }

            int right =0;
            for(int j=i;j<n;j++) {
                right = Math.max(right, height[j]);
            }

            water += (Math.min(left, right)) - height[i] ;


        }
        return water;
    }
}
