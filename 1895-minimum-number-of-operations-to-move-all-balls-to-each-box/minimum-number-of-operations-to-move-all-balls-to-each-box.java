class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        List<Integer> ballPositions = new ArrayList<>();

        //finding positions where ball is already there
        for(int i=0; i<n; i++){
            if(boxes.charAt(i) == '1'){
                ballPositions.add(i);
            }
        }

        for(int i=0; i<n; i++){
            int ops = 0;
            for(int pos: ballPositions){
                ops += Math.abs(pos-i);
            }
            answer[i] = ops;
        }
        return answer;
    }
}