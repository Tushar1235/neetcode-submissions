class Solution {
    public int trap(int[] height) {
 int n=height.length;
    int left=0;
    int right=n-1;
    int water=0;
    int   lmax=height[left];
    int rmax=height[right];
    while(left<right){
        if(height[left]<=height[right]){
            left++;
            if(lmax!=Math.max(lmax,height[left])){
                lmax=Math.max(lmax,height[left]);
            }
            water+=lmax-height[left];
        }
        else{
            right--;
            if(rmax!=Math.max(rmax,height[right])){
                rmax=Math.max(rmax,height[right]);
            }
            water+=rmax-height[right];
        }
    }  
    return water;
    }
}
