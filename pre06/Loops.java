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
  
  public static void factorial(int n) {
     int result = 1;
    for (int i = 1; i <= n; i = i + 1) {
      result = result * i;
    }
    System.out.println(result);
  }
}