class Solution {
     private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public int solution(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}