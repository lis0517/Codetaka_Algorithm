class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int currentPosition = 0;
        
        for (int position : section) {
            if (position > currentPosition) {
                count++;
                currentPosition = position + m - 1;
            }
        }
        
        return count;
    }
}