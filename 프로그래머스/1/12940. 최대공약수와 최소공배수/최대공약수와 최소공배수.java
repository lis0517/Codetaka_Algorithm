class Solution {
    
    public int gcd( int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n , m);
        answer[1] = n * m / answer[0];
        return answer;
    }
}