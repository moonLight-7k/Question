import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                qR.offer(i);
            } else {
                qD.offer(i);
            }
        }

        while (!qR.isEmpty() && !qD.isEmpty()) {
            int r = qR.poll();
            int d = qD.poll();
            if (r < d) {
                qR.offer(r + n);
            } else {
                qD.offer(d + n);
            }
        }

        return qR.isEmpty() ? "Dire" : "Radiant";
    }
}