class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
      
        int h=heights.length;
        int left = 0;
        int right = h-1;
        while(left<right) {
                int width = right-left;
                int height = Math.min(heights[right],heights[left]);
                int area = width * height;
                maxArea = Math.max(maxArea, area);

                if(heights[left]<heights[right]){
                    left++;
                } else{
                    right--;
                }
        }
        return maxArea;
    }
}
