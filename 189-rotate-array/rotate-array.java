class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = nums[i+(n-k)];
        }

        //shifting
        for(int i=n-1; i>=k; i--){
            nums[i] = nums[i-k];
        }

        for(int i=0; i<k; i++){
            nums[i] = arr[i];
        }
    }
}