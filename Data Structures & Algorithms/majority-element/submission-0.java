class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int num:nums){
            map.put(num,map.getOrDefault(num, 1)+1);
        }
        for(int num:nums){
            pq.offer(num);
        }

        return pq.peek();
    }
}