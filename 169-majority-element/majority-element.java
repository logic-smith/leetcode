class Solution {
    public int majorityElement(int[] nums) {
        //Brute force
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}