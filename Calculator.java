package assignmentone;

/**
 * calculator C-grade.
 */

public class Calculator {

  private boolean isDivideByZero;

  public Calculator() {
    this.isDivideByZero = false;
  }

  public double add(double a, double b) {
    return a + b;
  }

  /**
   * Subtraction method.
   */
  public double subtract(double a, double b) {
    return a - b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }

  /**
   * division method.
   */
  public double divide(double a, double b) {
    if (b == 0) {
      this.isDivideByZero = true;
      return Double.NaN;
    } else {
      this.isDivideByZero = false;
      return (a / b);
    }

  }

  public boolean isDivideByZero() {
    return this.isDivideByZero;
  }

  /**
   * square root grade A.
   */
  public double sqrt(double n) {
    double res = Math.sqrt(n);
    if (n < 0) {
      return 0;
    }
    return res;
  }

  public double square(double n) {
    double res = (n * n);
    return res;
  }

  /**
   * factorial grade A.
   */
  public double factorial(double n) {
    double factorial = 1;
    double i = 1;
    if (n < 0) {
      System.out.println("Wrong input");
    }
    for (; i <= n; i++) {
      factorial *= i;
    }
    return factorial;
  }

}
