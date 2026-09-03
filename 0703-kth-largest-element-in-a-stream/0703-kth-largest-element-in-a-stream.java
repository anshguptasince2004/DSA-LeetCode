class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k = 0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i: nums) {
            minHeap.add(i);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */