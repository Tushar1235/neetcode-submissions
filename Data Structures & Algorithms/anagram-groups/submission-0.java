class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String reverse = new String(c);

            if(map.containsKey(reverse)) {
                map.get(reverse).add(s);
            } else{
                 map.computeIfAbsent(reverse, r -> new ArrayList()).add(s);
            }
           
        }
         List<List<String>> gpAnagrams = new ArrayList<>();
            for(List<String> list : map.values()) {
                gpAnagrams.add(list);
            }
           return gpAnagrams;
    }
}
