class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        
        int h=heights.length;
        for(int i=0;i<h;i++) {
            for(int j=i+1;j<h;j++) {
                int width = j-i;
                int height = Math.min(heights[i],heights[j]);
                int area = width * height;

                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
