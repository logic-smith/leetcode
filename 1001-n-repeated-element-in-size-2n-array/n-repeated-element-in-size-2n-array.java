class Solution {
    public int repeatedNTimes(int[] nums) {
        //using hashset
        Set<Integer> seen = new HashSet<>();

        for(int num: nums){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}