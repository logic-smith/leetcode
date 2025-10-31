class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            int res = nums[i] ^ nums[i+1];
            if(res == 0){
                ans.add(nums[i]);
            }
        }
        return new int[]{ans.get(0), ans.get(1)};
    }
}