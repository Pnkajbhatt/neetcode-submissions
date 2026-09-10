class Solution {
    List<List<Integer>> barr = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        subset(0,nums, arr);

        return barr;
    }
    public void subset(int index ,int[] nums ,List<Integer> arr) {
        if(index >= nums.length){
            barr.add(new ArrayList<>(arr));
            return;
        }
            arr.add(nums[index]);
            subset(index+1, nums,arr);
            arr.remove(arr.size()-1);
            subset(index+1, nums,arr);

        return;
    }
}
