class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxSide = Math.min(getMaxGap(hBars), getMaxGap(vBars));
        return maxSide * maxSide;
    }

    private int getMaxGap(int[] bars){
        if(bars.length == 0) return 1;
        Arrays.sort(bars);

        int maxLen = 1, currLen = 1;
        for(int i=1; i<bars.length; i++){
            if(bars[i] == bars[i-1] + 1){
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            }else{
                currLen = 1;
            }
        }
        return maxLen + 1;
    }
}