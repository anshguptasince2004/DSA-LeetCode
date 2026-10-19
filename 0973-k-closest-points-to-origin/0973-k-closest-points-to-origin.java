class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        for(int i=0; i<points.length; i++) {
            int sum = (int)(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            heap.offer(new int[]{sum, i});
            if(heap.size()>k) {
                heap.poll();
            }
        }
        int[][] res = new int[k][2];
        int i = 0;
        while(!heap.isEmpty()) {
            int[] item = heap.poll();
            res[i++] = points[item[1]];
        }
        return res;
    }
}