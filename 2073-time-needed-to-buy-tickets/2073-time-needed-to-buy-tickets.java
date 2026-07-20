class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<tickets.length; i++) {
            queue.offer(i);
        }
        int time = 0;
        while(tickets[k] > 0) {
            if(tickets[queue.peek()] == 0) {
                queue.poll();
            } else {
                tickets[queue.peek()]--;
                queue.offer(queue.poll());
                time++;
            }
        }
        return time;
    }
}