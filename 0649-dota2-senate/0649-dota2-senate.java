class Solution {
    public String predictPartyVictory(String senate) {
        int D = 0;
        int ActualD = 0;
        int R = 0;
        int ActualR = 0;

        Queue<Character> queue = new LinkedList<>();

        for(char s: senate.toCharArray()) {
            if(s=='R') {
                ActualR++;
            } else {
                ActualD++;
            }
            queue.offer(s);
        }

        char temp;
        while(ActualR>0 && ActualD>0) {
            if(queue.poll() == 'R') {
                if(R > 0) {
                    ActualR--;
                    R--;
                } else {
                    D++;
                    queue.offer('R');
                }
            } else {
                if(D > 0) {
                    ActualD--;
                    D--;
                } else {
                    R++;
                    queue.offer('D');
                }
            }
        }
        if(ActualR==0) {
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}