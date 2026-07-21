class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Queue<Integer> stud = new LinkedList<>();
        Stack<Integer> sand = new Stack<>();

        for(int i=0; i<n; i++) {
            stud.offer(students[i]);
            sand.push(sandwiches[n-i-1]);
        }
        int count = 0;
        while(n>count) {
            if(sand.peek() == stud.peek()) {
                stud.poll();
                sand.pop();
                n--;
                count=0;
            } else {
                stud.offer(stud.poll());
                count++;
            }
        }
        return n;
    }
}