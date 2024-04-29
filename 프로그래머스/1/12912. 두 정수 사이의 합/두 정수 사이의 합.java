class Solution {
    public long solution(long a, long b) {
        if ( a == b )
            return a;
        
        return (Math.abs(a - b) + 1) * (a + b) / 2;
    }
}