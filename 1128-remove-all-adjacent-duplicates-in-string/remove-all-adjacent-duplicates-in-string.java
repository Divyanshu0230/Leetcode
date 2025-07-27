class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(result.length()>0 && result.charAt(result.length()-1)==a){
                result.deleteCharAt(result.length()-1);
            }else{
                result.append(a);
            }
        }
        return result.toString();
    }
}