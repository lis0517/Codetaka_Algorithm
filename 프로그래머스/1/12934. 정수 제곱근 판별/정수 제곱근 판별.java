class Solution {
    public long solution(long n) {
        int sqrtN = (int)Math.sqrt(n);
        if (Math.pow(sqrtN, 2) == n ){
            return (long)Math.pow(sqrtN + 1, 2);
        }
        return -1;
    }
}