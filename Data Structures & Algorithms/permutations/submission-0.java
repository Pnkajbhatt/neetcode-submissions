class Solution {
    List<List<Integer>> bigArr = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();


    public List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        perm(nums,arr);
        return bigArr;
    }

    public void perm(int[] nums , List<Integer> arr) {
        if(arr.size() == nums.length){
            bigArr.add(new ArrayList<>(arr));
            return;
        } 

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                arr.add(nums[i]);
                set.add(nums[i]);

                perm(nums,arr);

                arr.remove(arr.size()-1);
                set.remove(nums[i]);
            }
        }
    }
}
