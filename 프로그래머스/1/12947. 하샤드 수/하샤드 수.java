import java.util.*;

class Solution {
    public boolean solution(int x) {
        
        char[] array = Long.toString(x).toCharArray();
        
        int sum=0;
        for(char value : array){
            sum += value - '0';
        }
        
        return x % sum == 0;
    }
}