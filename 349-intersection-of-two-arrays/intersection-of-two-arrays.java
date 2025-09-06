class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>result=new ArrayList<>();
       HashSet<Integer>set=new HashSet<>();
       for(int num1:nums1){
        set.add(num1);
       }
       for(int num2:nums2){
        if(set.contains(num2)){
            result.add(num2);
            set.remove(num2);
        }
       }
      int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        return intersection;
    }
}