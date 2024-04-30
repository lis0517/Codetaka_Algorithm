class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        for ( int i = 0;  i < length; ++i){
            answer += i < length - 4 ? '*' : phone_number.charAt(i);
        }
        return answer;
    }
}