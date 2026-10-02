class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        int count=1;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        while(heap.size()!=k) {
            if(!list.contains(count)) {
                heap.add(count);
            }
            count++;
        }
        if(heap.isEmpty()) {
            return arr.length-1+k;
        }
        int res = 0;
        while(k!=0) {
            res = heap.poll();
            k--;
        }
        return res;
    }
}