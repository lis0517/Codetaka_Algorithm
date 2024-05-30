class Solution {
    public int solution(String s) {
        int count = 0;
        
        while (!s.isEmpty()) {
            char x = s.charAt(0);
            int xCount = 0;
            int otherCount = 0;
            int i = 0;
            
            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                
                if (xCount == otherCount) {
                    break;
                }
                
                i++;
            }
            
            count++;
            if (i + 1 < s.length()) {
                s = s.substring(i + 1);
            } else {
                s = "";
            }
        }
        
        return count;
    }
}