class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirstChar = true;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer += ch;
                isFirstChar = true;
            } else if (isFirstChar) {
                answer += Character.toUpperCase(ch);
                isFirstChar = false;
            } else {
                answer += Character.toLowerCase(ch);
            }
        }
        
        return answer;
    }
}