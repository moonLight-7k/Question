class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int s1 = player1[0], s2 = player2[0], i = 1,
                p1 = player1[i - 1], p2 = player2[i - 1],
                pp1 = -1, pp2 = -1;

        while (i < player1.length) {
            s1 += (p1 == 10 || pp1 == 10) ? 2 * player1[i] : player1[i];
            s2 += (p2 == 10 || pp2 == 10) ? 2 * player2[i] : player2[i];

            pp1 = p1;
            pp2 = p2;
            p1 = player1[i];
            p2 = player2[i];

            i++;
        }

        return (s1 == s2) ? 0 : s1 > s2 ? 1 : 2;
    }
}