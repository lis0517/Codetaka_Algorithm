class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for ( int i = 1; i < food.length; ++i){
            int foodLength = food[i] / 2;
            for ( int j = 0; j < foodLength; ++j){
                sb.append(i);
            }
        }

        String left = sb.toString();
        StringBuilder answer = new StringBuilder(left);
        answer.append(0);
        answer.append(sb.reverse());

        return answer.toString();
    }
}