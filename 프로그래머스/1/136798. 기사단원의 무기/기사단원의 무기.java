

class Solution {
    public int getDivisorsCount(int n){
        int count = 0;

        for( int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0){
                count++;

                if ( i != n / i){
                    count++;
                }
            }
        }
        return count;
    }
    
    public int solution(int number, int limit, int power) {
        int total = 0;
        for ( int i = 1; i <= number; ++i){
            int divisor = getDivisorsCount(i);

            total += divisor > limit ? power : divisor;            
        }
        return total;
    }
}