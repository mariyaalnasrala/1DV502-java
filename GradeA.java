package assignmentone;

import java.util.Scanner;

/**
 * This is the class for the A grade part of the assignment.\
 * Make sure you uncomment the corresponding test cases.
 */
public class GradeA {

  /**
   * Solution to the calcutlator task.
   *
   * @param input is the scanner used to read input from the user.
   */
  public void calculator(Scanner input) {
    Calculator a = new Calculator();
    System.out.println("Enter a number: ");
    double s = input.nextDouble();
    System.out.println("Select an operation: ");
    String operation = input.nextLine();

    double result = 0.0;

    if (operation.equals("root")) {
      result = a.sqrt(s);
    } else if (operation.equals("square")) {
      result = a.square(s);
    } else if (operation.equals("factorial")) {
      result = a.factorial(s);
    }

    System.out.println("Result: " + result);

  }

  /**
   * Solution to the 3D arrays task.
   */
  public void arrays3D() {
    ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms();
    int[][][] numbers = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
    System.out.println("The sum of arrays is: " + arrayAlgorithms.sum(numbers));

    System.out.println("Min value is: " + arrayAlgorithms.minValue(numbers));

    System.out.println("Max value is: " + arrayAlgorithms.maxValue(numbers));

  }

  /**
   * Solution to the genre task.
   */
  public void genre() {
  }
}
