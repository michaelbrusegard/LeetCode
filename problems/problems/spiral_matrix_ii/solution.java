class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int row = 0;
        int col = 0;
        int rowEnd = n - 1;
        int colEnd = n - 1;

        int num = 1;
        while (num <= n * n) {
            for (int i = col; i <= colEnd; i++) {
                result[row][i] = num++;
            }
            row++;
            for (int i = row; i <= rowEnd; i++) {
                result[i][colEnd] = num++;
            }
            colEnd--;
            for (int i = colEnd; i >= col; i--) {
                result[rowEnd][i] = num++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= row; i--) {
                result[i][col] = num++;
            }            
            col++;
        }
        return result;
    }
}