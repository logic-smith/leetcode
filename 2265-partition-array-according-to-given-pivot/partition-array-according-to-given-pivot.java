class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //Brute force
        List<Integer> list = new ArrayList<>();
        
        //adding elements < pivot to the list
        for(int num : nums){
            if(num < pivot){
                list.add(num);
            }
        }

        //adding elements = pivot
        for(int num : nums){
            if(num == pivot){
                list.add(num);
            }
        }

        //adding elements > pivot
        for(int num : nums){
            if(num > pivot){
                list.add(num);
            }
        }

        //putting elements back to nums
        for(int i=0; i<nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}