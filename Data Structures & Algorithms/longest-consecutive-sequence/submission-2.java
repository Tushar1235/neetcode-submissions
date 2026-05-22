class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
     
        Set<Integer> seen = new HashSet<>();
        for(int i: nums) {
            seen.add(i);
        } 
        int max =1;
        for(int i=0;i<nums.length;i++) {
            if(!seen.contains(nums[i] - 1)) {
               int length =1;
               while(seen.contains(nums[i]+length)) {
                    length++;
               }  
                max = Math.max(max, length);
            }
          
        }

        return max;
    }
}
