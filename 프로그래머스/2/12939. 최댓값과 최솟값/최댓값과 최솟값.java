class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split(" ");
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        
        for(String number : numbers){
            int n = Integer.parseInt(number);
            
            if( n < min ){
                min = n;
            }
            
            if( max < n ){
                max = n;
            }
        }
        
        return min + " " + max;
    }
}