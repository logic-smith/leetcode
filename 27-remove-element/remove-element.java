class Solution {
    public int removeElement(int[] nums, int val) {
        //two pointer
        int i=0, j=0;
        while(j<nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}