import java.util.*;

class Solution {
    public long solution(long n) {
         String s = Long.toString(n);
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);
        String answer = "";
        for ( int i = charArray.length - 1; i >= 0; --i ){
            answer += charArray[i];
        }
        return Long.parseLong(answer);
    }
}