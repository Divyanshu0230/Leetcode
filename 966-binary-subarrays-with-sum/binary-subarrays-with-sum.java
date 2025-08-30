class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); 
        int sum = 0;
        int result = 0;

        for (int num : nums) {
            sum += num;
            result += prefixCount.getOrDefault(sum - goal, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}