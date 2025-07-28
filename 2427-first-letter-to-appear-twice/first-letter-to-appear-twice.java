class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                return s.charAt(i);
            }
        }
        return '#';

    }
}