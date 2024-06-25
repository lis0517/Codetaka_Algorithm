class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }
        
        return lcm;
    }
    
    // 두 수의 최대공약수를 구하는 메소드
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    // 두 수의 최소공배수를 구하는 메소드
    private int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }
}