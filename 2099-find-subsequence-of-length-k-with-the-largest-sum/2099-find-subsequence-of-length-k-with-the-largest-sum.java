class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
 
        for(int i=0; i<nums.length; i++) {
            heap.offer(new int[] {nums[i], i});
            if(heap.size()>k) {
                heap.poll();
            }
        }
        int[][] selected = new int[k][2];
        for (int i = 0; i < k; i++) {
            selected[i] = heap.poll(); 
        } 
        Arrays.sort(selected, (a, b) -> Integer.compare(a[1], b[1]));
        int[] result = new int[k]; 
        for (int i = 0; i < k; i++) {
            result[i] = selected[i][0];
        } 
        return result;
    }
}