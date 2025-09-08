class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        for (String s : strs) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> group : map.values()) {
            result.add(group);
        }
        return result;
    }
}