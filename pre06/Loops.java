import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Guess a number: ");
    double a = in.nextDouble();
    double x1 = (a + a / a) / 2;
    double x2 = (x1 + a / x1) / 2;
    x1 = x2;
    double n = {Math.abs(x2 - x1);
    while (n < 0.001);
    System.out.println(x2);
    System.out.println(x1);
  }
}