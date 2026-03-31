class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] freq = new int[n+1];

        for(int c: citations){
            freq[Math.min(c,n)]++;
        }

        int papers=0;
        for(int h=n; h>=0; h--){
            papers += freq[h];
            if(papers >= h) return h;
        }
        return 0;
    }
}