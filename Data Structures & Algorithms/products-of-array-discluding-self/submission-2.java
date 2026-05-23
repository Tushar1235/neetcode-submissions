class Solution {
    public int[] productExceptSelf(int[] nums) {
        
     int prefixSum[] = new int[nums.length];//1,1,2,8  //48,24,6,1
     int postfixSum[] = new int[nums.length];
     int res[] = new int[nums.length];
     int prefix = 1;
     for(int i=0;i<nums.length;i++) {
        prefixSum[i] = prefix;
        prefix*= nums[i];
     }
     prefix =1;
     for(int i = nums.length-1;i>=0;i--) {
        postfixSum[i] = prefix;
        prefix*= nums[i];
     }
    
     for(int i=0;i<nums.length;i++) {
            res[i] = prefixSum[i] * postfixSum[i];
     }
     return res;

    }
}  
