class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int removedZero = 0;
        
        while(!s.equals("1")){
            int zeros = 0;
            for (char c : s.toCharArray()){
                if(c == '0'){
                    zeros++;
                }
            }
            removedZero += zeros;
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            count++;
        }
        
        answer[0] = count;
        answer[1] = removedZero;
        return answer;
    }
}