class Solution {
    public int[] plusOne(int[] digits) {
        //mast approach
        int n = digits.length;

        for(int i=n-1; i>=0; i--){
            digits[i]++;
            digits[i] %= 10;
            if(digits[i] != 0){
                return digits;
            }
        }

        //if code reached here means any digit is >9
        int[] res = new int[n+1];
        res[0] = 1; //by default everything is 0 in Java array
        return res;
    }
}