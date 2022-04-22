import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    iterativePower(3, 4);
    factorial(3);
  }

  public static void iterativePower(double x, int n) {
    double result = 1;
    for (int i = 0; i < n; i = i + 1) {
      result = result * x;
    }
    System.out.println(result);
  }
  
  public static int factorial(int n) {
     do {
      int recurse = factorial(n - 1);
      int result = n * recurse;
      System.out.println(result);
    } while (n > 0); 
    return 1;
  }
}