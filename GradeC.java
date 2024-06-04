package assignmentone;

import java.util.Scanner;

/**
 * This is the class for the C grade part of the assignment.\
 * Make sure you uncomment the corresponding test cases.
 */

public class GradeC {

  /**
   * Solution to the calcutlator task.
   *
   * @param input is the scanner used to read input from the user.
   */

  public void calculator(Scanner input) {
    System.out.println("\nEnter two numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    System.out.println("Select an operation: ");
    String operation = input.next();

    Calculator c = new Calculator();

    if (operation.equals("add")) {
      System.out.println(c.add(num1, num2));

    } else if (operation.equals("subtract")) {
      System.out.println(c.subtract(num1, num2));

    } else if (operation.equals("multiply")) {
      System.out.println(c.multiply(num1, num2));

    } else if (operation.equals("divide")) {
      System.out.println(c.divide(num1, num2));
    } else {
      System.out.println("Wrong operation! ");
    }
  }

  /**
   * Solution to the 3D arrays task.
   */
  public void arrays2D() {
    int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };

    ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms();
    System.out.println("The sum is: " + arrayAlgorithms.sum(numbers));

    // transpose
    int[][] transpose2 = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
    int[][] newArray = arrayAlgorithms.transpose(transpose2);

    // print the contents
    for (int i = 0; i < newArray.length; i++) {
      for (int j = 0; j < newArray[0].length; j++) {
        System.out.print(newArray[i][j] + " ");
      }
      System.out.println();
    }

    // diagnol sum

    int[][] bigNumbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 } };

    int sum = arrayAlgorithms.diagonalSum(bigNumbers);
    System.out.println("Diagonal sum: " + sum);

  }

  /**
   * Solution to the genre task.
   */
  public void band() {
    // Band band = new Band();
    Band band = new Band("The Beatles", 1960);
    band.addAlbum("Please Please Me", 1963);
    band.addAlbum("With The Beatles", 1963);
    band.addAlbum("A Hard Day's Night", 1964);
    band.getOldestAlbum();

  }
}