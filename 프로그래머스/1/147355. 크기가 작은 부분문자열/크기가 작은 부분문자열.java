class Solution {
    public int solution(String t, String p) {
      int answer = 0;

        int pLength = p.length();

        long target = Long.parseLong(p);

        for ( int i = 0; i <= t.length() - pLength; ++i){
            long sub = Long.parseLong(t.substring(i, i + pLength));
            if (sub <= target)
                answer++;
        }
        return answer;
    }
}