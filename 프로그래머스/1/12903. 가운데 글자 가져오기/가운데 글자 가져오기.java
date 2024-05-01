class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isEven = s.length() % 2 == 0;
        int centerIdx =  (int)(s.length() * 0.5);

        answer += isEven ? s.substring(centerIdx-1, centerIdx+1) : s.charAt(centerIdx);
        return answer;
    }
}