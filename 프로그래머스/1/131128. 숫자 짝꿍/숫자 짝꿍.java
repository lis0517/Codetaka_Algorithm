class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char digit : X.toCharArray()) {
            countX[digit - '0']++;
        }
        for (char digit : Y.toCharArray()) {
            countY[digit - '0']++;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(countX[i], countY[i]);
            for (int j = 0; j < count; j++) {
                result.append(i);
            }
        }
        
        if (result.length() == 0) {
            return "-1";
        }
        
        if (result.charAt(0) == '0') {
            return "0";
        }
        
        return result.toString();
    }
}