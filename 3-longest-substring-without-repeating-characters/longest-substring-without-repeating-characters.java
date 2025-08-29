class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Set<Character> window = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (window.contains(currentChar)) {
                window.remove(s.charAt(left));
                left++;
            } else {
                window.add(currentChar);
                maxLength = Math.max(maxLength, window.size());
                right++;
            }
        }

        return maxLength; 
    }
}