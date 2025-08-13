class Solution {
    public int majorityElement(int[] nums) {
        int a=(nums.length)/2;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int key:mp.keySet()){
            int freq=mp.get(key);
            if(freq>a){
                return key;
            }
        }
        return -1;
    }
}