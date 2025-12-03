class Solution {
    public int findGCD(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > maximum) maximum = num;
            if(num < minimum) minimum = num;
        }

        int gcd = minimum;
        for(int i=1; i<=minimum; i++){
            if(minimum % i ==0 && maximum % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}