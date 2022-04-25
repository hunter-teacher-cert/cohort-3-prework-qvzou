  public static int[] histogram(int[] a, int count) {
    int[] counts = new int[100];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }


  }

