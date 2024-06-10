import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerRank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i);
        }

        for (String calledPlayer : callings) {
            int calledRank = playerRank.get(calledPlayer);
            String frontPlayer = players[calledRank - 1];

            players[calledRank - 1] = calledPlayer;
            players[calledRank] = frontPlayer;

            playerRank.put(calledPlayer, calledRank - 1);
            playerRank.put(frontPlayer, calledRank);
        }

        return players;
    }
}