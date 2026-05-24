class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        return map.entrySet().stream().sorted(
            Comparator.comparingLong((Map.Entry<Integer, Integer> entry)-> entry.getValue()).reversed())
            .limit(k)
            .mapToInt(key-> key.getKey()).
        toArray();


    }
}
