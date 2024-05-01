class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if ( arr.length <= 1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            int min = Integer.MAX_VALUE, idx = 0;

            for ( int i = 0; i < arr.length; ++i )
            {
                int value = arr[i];
                if ( value < min ){
                    System.out.println(value + ", " + idx);
                    min = value;
                    idx = i;
                }
            }


            answer = new int[arr.length-1];

            int answerIdx = 0;
            for ( int i = 0; i < arr.length; ++i )
            {
                if ( i == idx ){
                    continue;
                }
                answer[answerIdx++] = arr[i];
            }
        }
        return answer;
    }
}