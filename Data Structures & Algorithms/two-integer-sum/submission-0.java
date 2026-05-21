class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> needed = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int need = target - nums[i];
            if(needed.containsKey(need)) {
                return new int[]{needed.get(need), i};
            }
            needed.put(nums[i],i);
        }

        return new int[]{0,0};
    }
}
