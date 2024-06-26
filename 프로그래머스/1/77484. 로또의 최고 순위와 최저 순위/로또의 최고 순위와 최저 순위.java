class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matchCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        matchCount++;
                        break;
                    }
                }
            }
        }

        int maxRank = getRank(matchCount + zeroCount);
        int minRank = getRank(matchCount);

        answer[0] = maxRank;
        answer[1] = minRank;

        return answer;
    }

    private int getRank(int matchCount) {
        switch (matchCount) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}