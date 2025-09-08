class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int count=1;

                while(set.contains(currnum+1)){
                    count++;
                    currnum++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
    }
}