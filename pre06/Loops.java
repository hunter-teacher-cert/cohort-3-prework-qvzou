import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double a = in.nextDouble();
    
    System.out.println(squareRoot(a));
    iterativePower(3, 4);
    factorial(3);
	}

  public static double squareRoot(double a) {
    double x0 = a / 2;
		double x1 = x0;

  	do {
      x0 = x1;
  		x1 = (x0 + a / x0) / 2;
    } while (!(Math.abs(x0 - x1) < 0.0001));

    return x1;
  }

  public static void iterativePower(double x, int n) {
    double result = 1;
    for (int i = 0; i < n; i = i + 1) {
      result = result * x;
    }
    System.out.println(result);
  }
  
  public static void factorial(int x) {
     int result = 1;
    for (x = x; x >= 1; x = x - 1) {
      result = result * x;
    }
    System.out.println(result);
  }
}