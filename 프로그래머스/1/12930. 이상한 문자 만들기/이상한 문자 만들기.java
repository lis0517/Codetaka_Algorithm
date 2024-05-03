class Solution {
    public String solution(String s) {
       String[] splitStrs = s.split("");

        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for(String str : splitStrs){
            cnt = str.contains(" ") ? 0 : cnt + 1;
            sb.append(cnt%2 == 0 ? str.toLowerCase() : str.toUpperCase()); 
        }
        System.out.println(sb.toString());

        return sb.toString();
    }
}