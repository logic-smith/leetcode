class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n <=1 ) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                if(map.get(num) >= n/2){
                    return num;
                }
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return -1;
    }
}