class Solution {
    public static int count = 0;
    
    public int solution(long num) {
        if ( count >= 500 && num != 1 )
            return -1;
        if ( num == 1 )
            return count;

        if ( num % 2 == 0 ){
            count++;
            return solution(num/2);
        }else{
            count++;
            return solution(num * 3 + 1);
        }
    }
}