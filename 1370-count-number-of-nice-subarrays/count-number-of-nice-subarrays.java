class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); 
        int oddCount = 0;
        int result = 0;

    for (int num : nums) {
    if (num % 2 == 1) oddCount++;
    result += countMap.getOrDefault(oddCount - k, 0);
    countMap.put(oddCount, countMap.getOrDefault(oddCount, 0) + 1);
    }
     return result;
    }
}