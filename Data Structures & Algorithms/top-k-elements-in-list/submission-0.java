class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) ->map.get(a) - map.get(b));
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }


        for(int key : map.keySet()){
            q.add(key);
            if(q.size() > k){
                q.poll();
            }
        }

        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = q.poll();
        }

        return arr;
    }
}
