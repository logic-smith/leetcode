class Solution {
    private static int sumDivisors(int num){
        int sum = 1 + num;
        for(int i=2; i<=num/2; i++){
            if(num%i==0) sum += i;
        }
        return sum;
    }

    public int sumFourDivisors(int[] nums) {
        //most efficient
        int totalSum = 0;

        for(int num: nums){
            if(num < 4) continue;

            int count = 0;
            int sum = 0;
            for(int i=2; i <= num/2; i++){
                if(num%i == 0){
                    count++;
                }
                if(count >=3) break;
            }
            if(count == 2){
                totalSum += sumDivisors(num);
            } 
        }
        return totalSum;
    }
}