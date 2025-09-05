class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int width=end-start;
            int hei=Math.min(height[start],height[end]);
            int currwaterarea=width*hei;
            maxwater=Math.max(maxwater,currwaterarea);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxwater;
    }
}