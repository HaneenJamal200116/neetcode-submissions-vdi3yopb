class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int arr[]=new int[k];
        PriorityQueue <Integer>q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int num:map.keySet()){
            q.offer(num);
        }
        for(int i=0;i<k;i++){
            arr[i]=q.poll();
        }
        return arr;
    }
}


/*
 nums = [1,2,2,3,3,3,3],
map
1  2  3 
1  2  4


heap
1
2
4
*/