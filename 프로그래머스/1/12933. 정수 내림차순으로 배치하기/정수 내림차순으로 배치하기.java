class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        char[] charArray = s.toCharArray();

        for ( int i = 0; i < charArray.length; ++i ){
            for ( int j = 0; j < charArray.length; ++j){
                if (charArray[i] > charArray[j]){
                    char temp = charArray[j];
                    charArray[j] = charArray[i];
                    charArray[i] = temp;
                }
            }
        }
        
        String answer = "";
        for(char value : charArray){
            answer += value;
        }
        return Long.parseLong(answer);
    }
}