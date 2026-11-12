class MedianFinder {
    private PriorityQueue <Integer> large;
    private PriorityQueue <Integer> small;
    public MedianFinder() {
        large=new PriorityQueue<>();
        small=new PriorityQueue<>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        // balance both queues !!!!
        small.offer(num);
        large.offer(small.poll());
        if(large.size()>small.size() )
        {
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
     if(small.size()>large.size()) 
            return small.peek(); 
        return (small.peek() + large.peek()) / 2.0; 
       
    }
}
