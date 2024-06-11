import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        Map<String, Integer> playerMap = new HashMap<>();

        // 선수 이름과 등수를 매핑
        for (int i = 0; i < n; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            int currentRank = playerMap.get(calling);

            if (currentRank > 0) {
                String previousPlayer = players[currentRank - 1];

                // 선수 이름 배열 업데이트
                players[currentRank - 1] = calling;
                players[currentRank] = previousPlayer;

                // 선수 이름과 등수 매핑 업데이트
                playerMap.put(calling, currentRank - 1);
                playerMap.put(previousPlayer, currentRank);
            }
        }

        return players;
    }
}