class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedWord=new String(arr);
            if(!map.containsKey(sortedWord)){
                ArrayList <String> inner=new ArrayList<>();
                inner.add(strs[i]);
                map.put(sortedWord,inner);
            }
            else{
                map.get(sortedWord).add(strs[i]);
            }   
           ;   
        }
        return new ArrayList<>(map.values());
    }
}


