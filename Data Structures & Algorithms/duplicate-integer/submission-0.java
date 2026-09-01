class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        return set.size() != nums.length;
    }
}