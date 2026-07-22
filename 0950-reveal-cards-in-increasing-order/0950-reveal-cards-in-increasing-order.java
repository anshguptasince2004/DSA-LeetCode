class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int[] arr = new int[deck.length];
        Queue<Integer> queue = new LinkedList<>();
        int i=0;
        while(i < deck.length) {
            queue.offer(i++);
        }
        
        int index = 0;
        while(!queue.isEmpty()) {
            arr[queue.poll()] = deck[index++];
            if(!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }
        return arr;
    }
}