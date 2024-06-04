package assignmentone;

import java.util.Random;

/**
 * return arrays.
 */

public class ArrayAlgorithms {

  private static final Random rand = new Random();

  /**
   * calculate average.
   */
  public double average(int[] numbers) {
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum / numbers.length;
  }

  /**
   * max value.
   */
  public int maxValue(int[] numbers) {
    int maxNum = numbers[0];
    for (int i : numbers) {
      if (i > maxNum) {
        maxNum = i;
      }
    }
    return maxNum;
  }

  /**
   * min index.
   */
  public int minIndex(int[] numbers) {
    int min = numbers[0];
    int minIndex = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  /**
   * Shift element.
   */

  public int[] shift(int[] numbers) {
    int first = numbers[0];
    for (int i = 0; i < numbers.length - 1; i++) {
      numbers[i] = numbers[i + 1];
    }
    numbers[numbers.length - 1] = first;
    return numbers;
  }

  /**
   * Shuffle elements.
   */

  public int[] shuffle(int[] numbers) {
    for (int i = numbers.length - 1; i > 0; i--) {
      int index = rand.nextInt(i + 1);
      int a = numbers[index];
      numbers[index] = numbers[i];
      numbers[i] = a;
    }
    return numbers;
  }

  /**
   * count the sum of arrays.
   */
  public int sum(int[][] array) {
    int total = 0;
    for (int[] lst : array) {
      for (int num : lst) {
        total += num;

      }
    }
    return total;
  }

  /**
   * transpose.
   */
  public int[][] transpose(int[][] array) {
    // empty array
    if (array == null || array.length == 0) {
      return array;
    }

    // count rows & columns in array
    int rows = array.length;
    int column = array[0].length;

    if (rows != column) {
      System.out.println("Matrix is not square! ");

      return array;
    } else {
      // new array to return with same number of rows & column
      int[][] newArray = new int[column][rows];

      // swap rows & columns
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < column; j++) {

          newArray[j][i] = array[i][j];
        }
      }
      return newArray;
    }
  }

  /**
   * diagonal sum of arrays.
   */
  public int diagonalSum(int[][] args) {
    if (args == null || args.length == 0 || (args.length != args[0].length)) {
      return 0;
    }

    int sum = 0;
    int r = args.length;

    for (int i = 0; i < r; i++) {
      sum += args[i][i];
    }
    return sum;
  }

  /**
   * Grade A, sum.
   */
  public int sum(int[][][] array) {
    int s = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          s += array[i][j][k];
        }
      }
    }
    return s;
  }

  /**
   * min value of array.
   */
  public int minValue(int[][][] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          if (array[i][j][k] < min) {
            min = array[i][j][k];
          }
        }
      }
    }
    return min;
  }

  /**
   * max value of array.
   */
  public int maxValue(int[][][] array) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          max = array[i][j][k];
        }
      }
    }
    return max;
  }
}
