class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer> , List<String>>  bmap = new HashMap<>();

        for(String str : strs){
            HashMap<Character , Integer> fmap = new HashMap<>();

            for(int i = 0; i < str.length(); i++){
                fmap.put(str.charAt(i), fmap.getOrDefault(str.charAt(i), 0) + 1);
            }

            if(!bmap.containsKey(fmap)){
                List<String> li =  new ArrayList<>();
                li.add(str);
                bmap.put(fmap,li);
            }else{
                List<String> li = bmap.get(fmap);
                li.add(str);
            }
        }
        List<List<String>>  res = new ArrayList<>();
        for(List<String> val : bmap.values()){
            res.add(val);
        }

        return res;
    }
    
}
