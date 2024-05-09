import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numList =new ArrayList<>();

        for ( int i = 0; i < numbers.length; ++i ){
            for ( int j = 0; j < numbers.length; ++j){
                if ( i != j )
                    numList.add(numbers[i] + numbers[j]);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for ( int n : numList ){
            set.add(n);
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for ( int n : set ){
            answer[idx++] = n;
        }
        Arrays.sort(answer);

        return answer;
    }
}