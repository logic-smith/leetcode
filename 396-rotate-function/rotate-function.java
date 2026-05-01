class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0, f = 0;

        //computing sum of all elements and F(0)
        for(int i=0; i<n; i++){
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long max = f;

        //computing F(1) to F(n-1)
        for(int i=1; i<n; i++){
            f += sum - (long) n * nums[n-i];
            max = Math.max(max,f);
        }
        return (int) max;
    }
}