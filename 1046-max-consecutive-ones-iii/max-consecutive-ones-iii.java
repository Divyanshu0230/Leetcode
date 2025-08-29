class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int maxlen=0;
        int zero=0;
        while(end<nums.length){
            if(nums[end]==0){
                zero++;
            }
            while(zero>k){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}