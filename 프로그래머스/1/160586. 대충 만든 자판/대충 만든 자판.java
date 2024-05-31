class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int pressCount = 0;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                int minPress = Integer.MAX_VALUE;

                for (String key : keymap) {
                    int index = key.indexOf(ch);
                    if (index != -1) {
                        minPress = Math.min(minPress, index + 1);
                    }
                }

                if (minPress == Integer.MAX_VALUE) {
                    pressCount = -1;
                    break;
                }

                pressCount += minPress;
            }

            answer[i] = pressCount;
        }

        return answer;
    }
}