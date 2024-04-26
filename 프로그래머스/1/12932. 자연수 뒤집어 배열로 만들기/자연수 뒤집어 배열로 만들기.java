class Solution {
    public int[] solution(long n) {
        String converted = Long.toString(n);
        StringBuffer sb = new StringBuffer(converted);
        String reverseStr = sb.reverse().toString();

        char[] charArray =  reverseStr.toCharArray();
        int[] answer = new int[charArray.length];
        for ( int i = 0; i < charArray.length; ++i ){
            answer[i] = Character.getNumericValue(charArray[i]);
        }
        return answer;
    }
}