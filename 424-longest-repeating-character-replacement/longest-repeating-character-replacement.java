class Solution {
    public int characterReplacement(String s, int k) {
       int start = 0, maxCount = 0, maxLen = 0;
       Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxCount = Math.max(maxCount, map.get(ch));

            while ((end - start + 1) - maxCount > k) {
                char left = s.charAt(start);
                map.put(left, map.get(left) - 1);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }    
}