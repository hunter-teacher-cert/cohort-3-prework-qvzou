import java.util.Scanner;

public class Loops {
 /**
  *Exercise 2 of Chapter 7
  */
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double a = in.nextDouble();
		double x2 = a / 2;
		double x1;

	do {
			x1 = x2;
			x2 = (x1 + a / x1) / 2;
    } while (Math.abs(x2 - x1) >= 0.0001);
		System.out.println(x2);

	}
}