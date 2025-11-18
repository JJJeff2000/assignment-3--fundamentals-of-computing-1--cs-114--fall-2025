public class RunMatrix {
  public static void p(String value) {
    System.out.print(value);
  }

  public static void main(String[] args) {
    Matrix myMatrix = new Matrix();
    p("Building Matrix... \n");
    myMatrix.buildMyMatrix();
    p("Matrix Build Successful. \n");
    myMatrix.printMatrix();
    p("Populating Matrix... \n");
    myMatrix.populateMatrix();
    p("Matrix Populated. \n");
    myMatrix.printMatrix();
    p("Flipping Matrix. \n");
    myMatrix.flipMatrix();
    p("Matrix Flip Successful. \n");
    myMatrix.printMatrix();
  }
}
