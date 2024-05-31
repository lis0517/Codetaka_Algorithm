class Solution {
    public String solution(String s, String skip, int index) {
        char[] result = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 0;
            
            while( count < index){
                ch = (char)((ch - 'a' + 1)%26 + 'a');
                if (!skip.contains(String.valueOf(ch))){
                    count++;
                }
            }
            result[i] = ch;
        }
        return String.valueOf(result);
    }
}