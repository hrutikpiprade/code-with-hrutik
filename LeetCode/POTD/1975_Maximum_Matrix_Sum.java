// time : O(m × n)
// space : O(1)
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int count = 0;
        long sum = 0;
        long min = Long.MAX_VALUE;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int val = Math.abs(matrix[i][j]);
                sum += val;
                min = Math.min(val, min);

                if(matrix[i][j] < 0 ) count++;
            }
        }

        if(count%2==0) return sum;

        return sum - (2 * min);
    }
}