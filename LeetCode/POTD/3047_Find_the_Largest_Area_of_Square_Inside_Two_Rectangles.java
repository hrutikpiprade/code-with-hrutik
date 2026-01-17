class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long area = 0;
        int n = bottomLeft.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int bottom = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int top = Math.min(topRight[i][1], topRight[j][1]);
                int left = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int right = Math.min(topRight[i][0], topRight[j][0]);
                
                if(top>bottom && right> left){
                    int side = Math.min(top-bottom, right-left);
                    area = Math.max(area, 1L * side * side);
                }

            }
        }
        return area;
    }
}