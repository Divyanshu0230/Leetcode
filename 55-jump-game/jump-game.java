class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
       
        if(n<=1){
            return true;
        }
        if(nums[0]==0){
            return false;
        }
        int maxReach=nums[0];
        int steps=nums[0];
        int jumps=0;
        for(int i=1;i<n;i++){
            if(i==n-1){
                jumps++;
                return true;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
            steps--;
            if(steps==0){
                if(i>=maxReach){
                    return false;
                }
                steps=maxReach-i;
            }
        }
        return false;
    }
}