class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for ( int i = left; i <= right; ++i ){
            int cnt = 0;
            for ( int j = 1; j * j <= i; ++j ){
                if ( j * j == i )
                    cnt++;
                else if ( i % j == 0 )
                    cnt += 2;
            }
            
            answer += cnt % 2 == 0 ? i : (i * -1);
        }
        return answer;
    }
}