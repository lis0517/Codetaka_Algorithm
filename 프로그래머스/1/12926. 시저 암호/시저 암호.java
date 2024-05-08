class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        for(char c : arr){
            if ( c != ' '){
                if (Character.isLowerCase(c)){
                    if ( c + n > 'z')
                        c -= 26;
                }
                else{
                    if ( c + n > 'Z')
                        c -= 26;
                }
                c += n;
            }
            sb.append(c);
        }


        return sb.toString();
    }
}