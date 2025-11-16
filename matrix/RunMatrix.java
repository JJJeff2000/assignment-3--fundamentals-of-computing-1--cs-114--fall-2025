import java.util.Scanner;

public class RunMatrix {
  public static void p(String value) {
    System.out.print(value);
  }

  public static void main(String[] args) {
    Matrix myMatrix = new Matrix();
    Scanner scanner = new Scanner(System.in);
    String input;
    boolean programActive = true;
    p("Welcome to My Matrix. \n");
    while (programActive) {
      p("1. Build Matrix \n");
      p("2. Populate Matrix \n");
      p("3. Print Matrix \n");
      p("4. Flip Matrix \n");
      p("5. Quit\n");
      p("What would you like to do?: ");
      input = scanner.nextLine();
      String lowercaseInput = input.toLowerCase();
      switch (lowercaseInput) {
        case "1", "build matrix":
          p("Building Matrix... \n");
          myMatrix.buildMyMatrix();
          p("Matrix Build Successful. \n");
          break;
        case "2", "populate matrix":
          p("Populating Matrix... \n");
          myMatrix.populateMatrix();
          p("Matrix Populated. \n");
          break;
        case "3", "print matrix":
          myMatrix.printMatrix();
          break;
        case "4", "flip matrix":
          p("Flipping Matrix... \n");
          myMatrix.flipMatrix();
          p("Matrix Flip Successful. \n");
          break;
        case "5", "quit":
          p("Goodbye. \n");
          programActive = false;
          break;
        default:
          p("Invalid input.");
          break;
      }
    }
    scanner.close();
  }
}
