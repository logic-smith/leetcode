class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Three pointer
        int i = nums1.length-1, j = nums2.length-1;
        int[] arr = new int[nums1.length + nums2.length];
        int k = arr.length-1;

        //putting elements sorted in increasing order
        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
                arr[k] = nums1[i--];
            }else{
                arr[k] = nums2[j--];
            }
            k--;
        }

        //shifting remaining elements
        while(i>=0){
            arr[k--] = nums1[i--];
        }
        while(j>=0){
            arr[k--] = nums2[j--];
        }

        int med = arr.length / 2;
        if(arr.length % 2 == 0){
            return (arr[med] + arr[med-1]) / 2.00000;
        }else{
            return arr[med] / 1.00000;
        }
    }
}