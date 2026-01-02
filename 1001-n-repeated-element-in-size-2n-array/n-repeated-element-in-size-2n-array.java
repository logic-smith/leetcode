class Solution {
    public int repeatedNTimes(int[] nums) {
        //storing frequency in map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        int n = nums.length/2;
        
        //final traversal
        for(int num: nums){
            if(frequencyMap.get(num) == n){
                return num;
            }
        }
        return -1;
    }
}