class Solution {
    public int trap(int[] height) {
        int count=0;
        int start=0;
        int end=height.length-1;
        int leftmax=0;
        int rightmax=0;
        while(start<end){
            leftmax=Math.max(leftmax,height[start]);
            rightmax=Math.max(rightmax,height[end]);
            if(leftmax<rightmax){
                count=count+(leftmax-height[start]);
                start++;
            }else{
                count=count+(rightmax-height[end]);
                end--;
            }
        }
        return count;
    }
}