class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones) {
            maxHeap.offer(i);
        }
        while(!maxHeap.isEmpty()) {
            if(maxHeap.size() == 1) {
                return maxHeap.poll();
            }
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            if(a!=b) {
                maxHeap.offer(Math.abs(a-b));
            }
        }
        return 0;
    }
}