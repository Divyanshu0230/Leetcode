class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(nums[0]==0){
            return 0;
        }
        if(n<=1){
            return 0;
        }
        int maxReach=nums[0];
        int steps=nums[0];
        int jumps=0;
        for(int i=1;i<n;i++){
            if(i==n-1){
                jumps++;
                return jumps;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=maxReach){
                    return -1;
                }
                steps=maxReach-i;
            }
        }
        return -1;
    }
}