import java.util.regex.*;

class Solution {
    public boolean solution(String s) {
        return ( s.length() == 4 || s.length() == 6 ) && Pattern.matches("^[0-9]*$", s);
    }
}