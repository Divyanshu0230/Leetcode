class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set1.contains(nums[i])){
                set1.add(nums[i]);
            }else{
                set2.add(nums[i]);
            }
        }
        result.addAll(set2);
        return result;
    }
}