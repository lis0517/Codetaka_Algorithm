import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr);

        for(int value : arr){
            if ( value % divisor == 0 ){
                answer.add(value);
            }
        }
        if (answer.size() == 0)
            answer.add(-1);

        int[] temp = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i )
            temp[i] = answer.get(i);
        
        return temp;
    }
}