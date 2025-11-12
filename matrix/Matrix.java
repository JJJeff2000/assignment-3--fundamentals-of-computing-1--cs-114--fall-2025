import java.util.Scanner;

public class Matrix {
  public static void p(String value){
    System.out.print(value);
  }

  int[][] matrix;

  public void buildMyMatrix() {
    Scanner scanner = new Scanner(System.in);
    p("Please enter the number of rows: ");
    int rows = scanner.nextInt();
    p("Please enter the number of columns: ");
    int columns = scanner.nextInt();
    matrix = new int[rows][columns];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        matrix[i][j] = 0;
      }
    }
  }

  public void printMatrix(){
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        p(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void swapMatrix(){
    int temp = matrix[0][0];
    matrix[0][0] = matrix[matrix.length-1][matrix.length-1];
    matrix[matrix.length-1][matrix.length-1] = temp;
  }
}
