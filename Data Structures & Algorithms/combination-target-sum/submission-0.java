class Solution {
    List<List<Integer>> barr = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        combSum(nums,target,new ArrayList<>(),0,0);
        return barr;
    }
    public void combSum(int[] nums, int target , List<Integer> list, int sum, int start) {
        if(sum > target){
          return;  
        }

        if(sum == target){
            barr.add(new ArrayList<>(list));
            return;
        }  
        
        for(int i = start ; i < nums.length; i++){
            list.add(nums[i]);
            combSum(nums,target,list,sum+nums[i],i);
            list.remove(list.size()-1);
        }
    }
}
