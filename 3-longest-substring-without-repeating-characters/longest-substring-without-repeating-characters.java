class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlen=0;
        HashSet<Character>window=new HashSet<>();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(window.contains(ch)){
                window.remove(s.charAt(start));
                start++;
            }else{
                window.add(ch);
                maxlen=Math.max(maxlen,window.size());
                end++;
            }
        }
        return maxlen;
    }
}