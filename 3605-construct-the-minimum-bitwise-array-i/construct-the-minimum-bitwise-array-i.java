class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            if(nums.get(i) == 2){
                ans[i] = -1;
            }else{
                for(int b=0; b<31; b++){
                    if(((nums.get(i) >> (b+1)) & 1) == 0){
                        ans[i] = nums.get(i) ^ (1 << b);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}