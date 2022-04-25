  public static int[] histogram(int[] a, int count) {
    int[] counts = new int[100];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }

  public static int[] randomArray(int size) {
    
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    return a;
  }

