import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] charArr = s.toCharArray();
        int[] answer = new int[charArr.length];

        for ( int i = 0; i < charArr.length; ++i ){
            char c = charArr[i];
            if (map.containsKey(c)){
                int dist = Math.abs(map.get(c) - i);
                answer[i] = dist;
                System.out.println(dist);
                map.replace(c, i);
            }else{
                answer[i] = -1;
                map.put(c, i);
            }
        }

        return answer;
    }
}