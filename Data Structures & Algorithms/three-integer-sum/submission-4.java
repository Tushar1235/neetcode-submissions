class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length; 

        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0;i<n-2;i++) {
            int l = i+1;
            int r= n-1;
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(l<r) {
                 int sum = nums[i] + nums[l] + nums[r];
                 if(sum<0) {
                    l++;
                    continue;
                 } else if(sum>0) {
                    r--;
                    continue;
                 } else {
                    triplets.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r-1]){
                        r--;
                    }

                 }

                 l++;
                 r--;
            }

        }
        return triplets;
    }
}
