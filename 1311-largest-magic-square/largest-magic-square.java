class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int k=Math.min(m,n); k>=2; k--){
            for(int r=0; r<=m-k; r++){
                for(int c=0; c<=n-k; c++){
                    if(isMagic(grid, r,c,k)){
                        return k;
                    }
                }
            }
        }
        return 1;
    }

    private boolean isMagic(int[][] grid, int r, int c, int k){
        int targetSum = 0;
        for(int j=0; j<k; j++){
            targetSum += grid[r][c+j];
        }

        //check other rows
        for(int i=1; i<k; i++){
            int rowSum = 0;
            for(int j=0; j<k; j++){
                rowSum += grid[r+i][c+j];
            }
            if(rowSum != targetSum) return false;
        }

        //check other columns
        for(int j=0; j<k; j++){
            int colSum = 0;
            for(int i=0; i<k; i++){
                colSum += grid[r+i][c+j];
            }
            if(colSum != targetSum) return false;
        }

        //check main diagonal
        int mainDiagSum = 0;
        for(int i=0; i<k; i++){
            mainDiagSum += grid[r+i][c+i];
        }
        if(mainDiagSum != targetSum) return false;

        //check antidiagonal
        int antiDiagSum = 0;
        for(int i=0; i<k; i++){
            antiDiagSum += grid[r+i][c+k-1-i];
        }
        if(antiDiagSum != targetSum) return false;
        return true;
    }
}