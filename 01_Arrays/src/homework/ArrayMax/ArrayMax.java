package homework.ArrayMax;

class ArrayMax {

  // Task #1
  static int findSmallestTransaction(int[] transactions) {
    int max = Integer.MIN_VALUE;
    for (int transaction : transactions) {
      max = Math.max(transaction, max);
    }
    return max; // Please implement
  }

  // Task #2
  static int findBestStudentMistakes(int[] students) {
    int min = Integer.MAX_VALUE;
    for (int student : students) {
      min = Math.min(student, min);
    }
    return min; // Please implement
  }

  // Task #3
  static double findAverageTime(int[] times) {
    double rel = 0D;
    for (int time : times) {
      rel += time;
    }
    return rel / times.length; // Please implement
  }

  // Task #4
  static int findMostProfitableClient(int[][] income) {
    int val = 0;
    int ans = 0;
    for (int i = 0; i < income.length; i++) {
      int cur = 0;
      for (int j = 0; j < income[i].length; j++) {
        cur += income[i][j];
      }
      if (cur > val) {
        ans = i;
        val = cur;
      }
    }
    return ans; // Please implement
  }
}
