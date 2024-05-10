import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; ++i){
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1] -1;
            int targetIdx = commands[i][2] - 1;
            
            int[] tempArr = new int[Math.abs(endIdx - startIdx + 1)];
            int tempIdx = 0;
            for (int j = startIdx; j <= endIdx; ++j){
                tempArr[tempIdx++] = array[j];
            }
            Arrays.sort(tempArr);
            answer[i] = tempArr[targetIdx];
        }

        return answer;
    }
}