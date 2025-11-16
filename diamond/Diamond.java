// Importing Scanner class for user input
import java.util.Scanner;

public class Diamond {
// Function to print a line with a newline
  public static void pln(String value) {
    System.out.println(value);
  }
// Function to print a line without a newline
  public static void p(String value) {
    System.out.print(value);
  }
// Main method
  public static void main(String[] args) {
// Variables
    int rowCount = 0;
    int starCount = 1;
// Input
    Scanner scanner = new Scanner(System.in);
    p("Enter a positive number: ");
    int numberInput = scanner.nextInt();
    int halfInput = numberInput / 2;
// Print even diamond
    if (numberInput % 2 == 0) {
      for (int i = (numberInput + 1); i > halfInput; i--) {
        for (int j = (numberInput - 1); j > rowCount; j--) {
          p(" ");
        }
        for (int j = starCount; j > 0; j--) {
          if (rowCount < 1) {
            p(" *");
          }
          else {
            p("* ");
          }
        }
        pln("");
        starCount += 2;
        if (rowCount < 1) {
          rowCount++;
        }
        else {
          rowCount += 2;
        }
      }
      starCount = (numberInput -1);
      for (int i = numberInput; i > halfInput; i--) {
        for (int j = (numberInput - 1); j < rowCount; j++) {
          p(" ");
        }
        for (int j = starCount; j > 0; j--) {
          p("* ");
        }
        pln("");
        starCount -= 2;
        if (rowCount < 1) {
          rowCount++;
        }
        else {
          rowCount += 2;
        }
      }
    }
    else {
// Print odd diamond
      for (int k = (numberInput - 1); k > halfInput; k--) {
        for (int l = halfInput; l > rowCount; l--) {
          p(" ");
        }
        for (int l = starCount; l > 0; l--) {
          p("*");
        }
        pln("");
        starCount += 2;
        rowCount++;
      }
      for (int k = (numberInput + 1); k > halfInput; k--) {
        for (int l = halfInput; l < rowCount; l++) {
          p(" ");
        }
        for (int l = starCount; l > 0; l--) {
          p("*");
        }
        pln("");
        starCount -= 2;
        rowCount++;
      }
    }
// Close scanner
    scanner.close();
  }
}
