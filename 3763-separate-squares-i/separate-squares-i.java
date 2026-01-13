class Solution {
    public double separateSquares(int[][] squares) {
        long totalArea = 0;
        double maxTop = 0;
        for (int[] sq : squares) {
            long l = sq[2];
            totalArea += l * l;
            maxTop = Math.max(maxTop, sq[1] + l);
        }
        double target = totalArea / 2.0;
        double lo = 0, hi = maxTop;
        for (int iter = 0; iter < 100; ++iter) {
            double mid = lo + (hi - lo) / 2;
            if (areaBelow(mid, squares) < target) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return hi;
    }

    private double areaBelow(double h, int[][] squares) {
        double area = 0;
        for (int[] sq : squares) {
            double y = sq[1], l = sq[2];
            if (h <= y) continue;
            if (h >= y + l) {
                area += l * l;
            } else {
                area += l * (h - y);
            }
        }
        return area;
    }
}