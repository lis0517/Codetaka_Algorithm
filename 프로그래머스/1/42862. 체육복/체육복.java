class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            students[i] = 1;
        }
        
        for(int i : lost){
            students[i]--;
        }
        
        for(int i : reserve){
            students[i]++;
        }
        
        for (int i = 1; i <= n; i++){
            if(students[i] == 0){
                if (i > 1 && students[i - 1] == 2){
                    students[i]++;
                    students[i - 1]--;
                }else if (i < n && students[i + 1] == 2){
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if (students[i] > 0)
                answer++;
        }
        
        
        return answer;
    }
}