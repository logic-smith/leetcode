class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        int j = 0;

        for(int i=0; i<nums.length-1; i++){
            int res = nums[i] ^ nums[i+1];
            if(res == 0){
                ans[j++] = nums[i];
            }
        }
        return ans;
    }
}