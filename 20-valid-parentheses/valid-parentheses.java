class Solution {
    public boolean isValid(String s) {
       Stack<Character>a=new Stack<>();
       for(char b:s.toCharArray()){
        if(b=='('||b=='{'||b=='['){
            a.push(b);
        }else{
            if(a.isEmpty()){
                return false;
            }
            char top=a.pop();
            if(b==')'&& top!='('){
                return false;
            }
            if(b=='}'&& top!='{'){
                return false;
            }
            if(b==']'&& top!='['){
                return false;
            }
        }
       }
        return a.isEmpty(); 
    }
}