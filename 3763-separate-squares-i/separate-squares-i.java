class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;

        // Step 1: total area
        for (int[] sq : squares) {
            double l = sq[2];
            totalArea += l * l;
        }

        double target = totalArea / 2.0;

        // Step 2: binary search range
        double low = 1e9, high = -1e9;
        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        // Step 3: binary search
        while (high - low > 1e-6) {
            double mid = (low + high) / 2.0;
            double areaBelow = 0;

            // Step 4: compute area below mid
            for (int[] sq : squares) {
                double y0 = sq[1];
                double l = sq[2];

                if (mid <= y0) continue;
                else if (mid >= y0 + l) areaBelow += l * l;
                else areaBelow += l * (mid - y0);
            }

            // Step 5: adjust search
            if (areaBelow < target)
                low = mid;
            else
                high = mid;
        }

        return low;
    }
}