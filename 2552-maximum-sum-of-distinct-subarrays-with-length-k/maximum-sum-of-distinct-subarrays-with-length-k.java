class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       long currsum = 0;
        long maxsum = 0;
        int start = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int end = 0; end < nums.length; end++) {
            currsum =currsum + nums[end];
            freq.put(nums[end], freq.getOrDefault(nums[end], 0) + 1);
            if (end - start + 1 == k) {
                if (freq.size() == k) {
                    maxsum = Math.max(maxsum, currsum);
                }
                int count = freq.get(nums[start]);
                if (count == 1){
                    freq.remove(nums[start]);
                }else{
                    freq.put(nums[start], count - 1);
                }    
                currsum =currsum - nums[start];
                start++;
            }
        }

        return maxsum;
    }
}