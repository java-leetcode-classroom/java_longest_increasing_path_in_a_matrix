import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void longestIncreasingPathExample1() {
    assertEquals(4, sol.longestIncreasingPath(new int[][]{
        // matrix = [[9,9,4],[6,6,8],[2,1,1]]
        {9,9,4},
        {6,6,8},
        {2,1,1}
    }));
  }
  @Test
  void longestIncreasingPathExample2() {
    assertEquals(4, sol.longestIncreasingPath(new int[][]{
        // matrix = [[3,4,5],[3,2,6],[2,2,1]]
        {3,4,5},
        {3,2,6},
        {2,2,1}
    }));
  }
  @Test
  void longestIncreasingPathExample3() {
    assertEquals(1, sol.longestIncreasingPath(new int[][]{
        // matrix = [[1]]
        {1}
    }));
  }
}