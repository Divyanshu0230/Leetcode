class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character>set=new HashSet<>();
        sentence=sentence.toLowerCase();
        for(int i=0;i<sentence.length();i++){
            char result=sentence.charAt(i);
            if(result>='a' && result<='z'){
                set.add(result);
            }
        }
        return set.size()==26;
    }
}