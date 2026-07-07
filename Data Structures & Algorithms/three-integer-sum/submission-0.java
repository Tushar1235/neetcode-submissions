class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length; 
       Set<List<Integer>> triplets = new HashSet<>();
       List<List<Integer>> triplet = new ArrayList<>();
       for(int i=0;i<n;i++) {
        for(int j= i+1;j<n;j++) {
            for(int k=j+1;k<n;k++) {
                if((nums[i]+nums[j]+nums[k]) == 0){
                   
                    triplet.add(Arrays.asList(nums[i],nums[j],nums[k]));
        
                }
            }
        }
       }

       for(List l: triplet){
        Collections.sort(l);
        triplets.add(l);
       }
       return new ArrayList<>(triplets);
    }
}
