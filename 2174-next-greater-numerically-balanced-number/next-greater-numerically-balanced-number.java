class Solution {
    public int nextBeautifulNumber(int n) {
        while(true){
            n++;
            if(isBalanced(n)){
                return n;
            }
        }
    }

    private boolean isBalanced(int num){
        int[] count = new int[10];
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;
            count[digit]++;
            temp /= 10;
        }

        for(int d=1; d<=9; d++){
            if(count[d] !=0 && count[d] != d){
                return false;
            }
        }
        return count[0] == 0;
    }
}