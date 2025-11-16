import java.util.Scanner;

public class Matrix {

  public static void p(String value) {
    System.out.print(value);
  }

  int[][] matrix;
  int size;
  int x1 = 0;
  int y1 = 0;
  int x2Temp = 1;
  int y2Temp = 1;
  public static final String RED = "\u001B[31m";
  public static final String RESET = "\u001B[0m";

  public void buildMyMatrix() {
    Scanner scanner = new Scanner(System.in);
    p("Please enter the size of the matrix: ");
    size = scanner.nextInt();
    matrix = new int[size][size];
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        matrix[i][j] = 0;
      }
    }
  }

  public void populateMatrix() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = i * size + j + 1;
      }
    }
  }

  public void printMatrix() {
    int xTemp = 0;
    int yTemp = size - 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] < 10) {
          if (i == xTemp && j == yTemp) {
            p(RED + matrix[i][j] + "  " + RESET);
          }
          else {
            p(matrix[i][j] + "  ");
          }
        }
        else {
          if (i == xTemp && j == yTemp) {
            p(RED + matrix[i][j] + " " + RESET);
          }
          else {
            p(matrix[i][j] + " ");
          }
        }
      }
      xTemp++;
      yTemp--;
      p("\n");
    }
  }

  private void swapMatrix(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void flipMatrix() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i + j != size - 1 && j < size - 1 - i) {
          int x2 = size - 1 - j;
          int y2 = size - 1 - i;
          swapMatrix(i, j, x2, y2);
        }
      }
    }
  }
}
