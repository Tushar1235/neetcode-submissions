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
            int start = 1, current = nums[i];
            while(seen.contains(current+1)) {
                start++;
                current = current+1;
            }
            max = Math.max(max, start);
        }

        return max;
    }
}
