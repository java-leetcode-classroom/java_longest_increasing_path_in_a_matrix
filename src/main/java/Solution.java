public class Solution {
  public int longestIncreasingPath(int[][] matrix) {
    int ROW = matrix.length;
    int COL = matrix[0].length;
    int[][] dp = new int[ROW][COL];
    int maxLen = 1;
    for (int row = 0; row < ROW; row++) {
      for (int col = 0; col < COL; col++) {
        int result = DFS(matrix, row, col, -1, dp);
        if (result > maxLen) {
          maxLen = result;
        }
      }
    }
    return maxLen;
  }
  public int DFS(int[][] matrix, int row, int col, int previous, int[][] dp) {
    int ROW = matrix.length;
    int COL = matrix[0].length;
    if (row < 0 || row == ROW || col < 0 || col == COL || matrix[row][col] <= previous) {
      return 0;
    }
    if (dp[row][col] != 0) {
      return dp[row][col];
    }
    int result = 1;
    result = Math.max(result, 1+ DFS(matrix, row-1, col, matrix[row][col], dp));
    result = Math.max(result, 1+ DFS(matrix, row+1, col, matrix[row][col], dp));
    result = Math.max(result, 1+ DFS(matrix, row, col-1, matrix[row][col], dp));
    result = Math.max(result, 1+ DFS(matrix, row, col+1, matrix[row][col], dp));
    dp[row][col] = result;
    return result;
  }
}
