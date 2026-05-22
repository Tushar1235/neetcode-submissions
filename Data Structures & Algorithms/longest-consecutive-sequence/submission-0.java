class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int j = 1;

        for(int i=0;i<nums.length-1;i++) {
            if((nums[i] == nums[i+1])) {
                continue;
            }

            if(nums[i]+1 != nums[i+1] ){
                max = Math.max(max, j);
                j=1;
            }else {
                    j++;
            }
            
         
        }
        max = Math.max(max, j);

        return max;
    }
}
