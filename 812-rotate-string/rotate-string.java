class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        return s.lastIndexOf(goal)>=0;
    }
}