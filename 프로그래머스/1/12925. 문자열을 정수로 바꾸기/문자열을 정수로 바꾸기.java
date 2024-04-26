class Solution {
    public int solution(String s) {
         int answer = 0;
        boolean isNegative = false;
        for ( int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if ( c == '-' ){
                isNegative = true;
            }
            else if ( c != '+'){
               answer = answer * 10 + ( c - '0');  
            }  
        }

        if ( isNegative)
            answer *= -1;

        return answer;
    }
}