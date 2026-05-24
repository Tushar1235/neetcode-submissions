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
        

        for(int num: nums) {
            int count = 1, current = num; //2
            while(seen.contains(current+1)) {
                count++;//2,3,4
                current = current+1;//3,4,5
            }
            max= Math.max(max, count);
        }

        return max;
    }
}
