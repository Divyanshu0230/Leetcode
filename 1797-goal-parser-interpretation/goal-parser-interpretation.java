class Solution {
    public String interpret(String command) {
        String a=command.replace("()","o");
        String result=a.replace("(al)","al");
        return result;
    }
}