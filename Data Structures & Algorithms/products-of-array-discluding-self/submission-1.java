class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        arr1[0] = 1;
        for(int i = 1; i < nums.length; i++){
            arr1[i] = arr1[i-1] * nums[i-1];
        }


        int[] arr2 = new int[nums.length];
        arr2[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i--){
            arr2[i] = arr2[i+1] * nums[i+1];
        }



        int[] res  = new int[nums.length];

        for(int i = 0; i < res.length;i++){
            res[i] = arr1[i] * arr2[i];
        }



        return res;
    }
}  
