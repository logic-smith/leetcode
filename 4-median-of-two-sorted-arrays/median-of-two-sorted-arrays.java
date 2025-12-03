class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Brute force
        int m = nums1.length, n = nums2.length;
        int[] arr = new int[m+n];

        for(int i=0; i<m; i++){
            arr[i] = nums1[i];
        }
        for(int i=0; i<n; i++){
            arr[m+i] = nums2[i];
        }
        Arrays.sort(arr);

        int med = (m+n)/2;
        if(arr.length % 2 == 0){
            return (arr[med-1] + arr[med]) / 2.00000;
        }else{
            return arr[med] / 1.00000;
        }
    }
}