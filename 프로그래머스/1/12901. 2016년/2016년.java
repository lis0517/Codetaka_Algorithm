class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] months = {31,29,31,30,31,30,31,31,30, 31, 30, 31};

        int total = b;
        for(int i = 0; i < a - 1; ++i){
            total += months[i];
        }
        return days[(total + 4) % 7];
    }
}