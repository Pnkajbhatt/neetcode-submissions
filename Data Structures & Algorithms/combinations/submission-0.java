class Solution {
    List<List<Integer>> barr = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        comb(n,1,k,new ArrayList<>());
        return barr;
    }

    public void comb(int n,int i, int k, List<Integer> arr) {
        if(k == 0){
            barr.add(new ArrayList<>(arr));
            return;
        }
        if(i > n){
            return;
        }
        arr.add(i);
        comb(n,i+1,k-1,arr);
        arr.remove(arr.size()-1);
        comb(n,i+1,k,arr);
    }
}