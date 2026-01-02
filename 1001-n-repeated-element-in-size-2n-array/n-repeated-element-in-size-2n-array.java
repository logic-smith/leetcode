class Solution {
    public int repeatedNTimes(int[] nums) {
        //storing frequency in map
        int n = nums.length/2;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
            if(frequencyMap.get(num) == n){
                return num;
            }
        }
        return -1;
    }
}