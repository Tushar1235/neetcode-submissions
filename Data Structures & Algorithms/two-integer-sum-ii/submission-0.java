class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> indices = new HashMap<>();
        for(int i=0;i<numbers.length;i++) {
            int com = target - numbers[i]; 
            if(indices.containsKey(com)) {
                return new int[]{indices.get(com)+1, i+1};
            }
            indices.put(numbers[i], i);
           
        }

        return new int[]{};
    
    }
}
