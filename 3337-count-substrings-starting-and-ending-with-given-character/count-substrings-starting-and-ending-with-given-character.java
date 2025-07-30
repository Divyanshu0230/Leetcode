class Solution {
    public long countSubstrings(String s, char c) {
        int count = 0;
        long result=0;
        for (char ch : s.toCharArray()) {
          if (ch == c) {
            count++;
            result=result+count;
            }
        }
        return result;


    }
}