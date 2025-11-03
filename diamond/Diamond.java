import java.util.Scanner;

public class Diamond {
  public static void p(String value){
    System.out.println(value);
  }

  public static void scan_p(String value){
    System.out.print(value);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scan_p("Enter a positive number: ");
    int numberInput = scanner.nextInt();
    int rowCount = 0;
    int starCount = 1;
    if (numberInput % 2 == 0){
      p("Even Input");
    }
    else{
      int halfInput = numberInput / 2;
      for (int j = (numberInput - 1); j > halfInput; j--) {
        for (int i = halfInput; i > rowCount; i--) {
          scan_p(" ");
        }
        for (int i = starCount; i > 0; i--) {
          scan_p("*");
        }
        p("");
        starCount += 2;
        rowCount++;
      }
      for (int j = (numberInput + 1); j > halfInput; j--) {
        for (int i = halfInput; i < rowCount; i++) {
          scan_p(" ");
        }
        for (int i = starCount; i > 0; i--) {
          scan_p("*");
        }
        p("");
        starCount -= 2;
        rowCount++;
      }
    }
    scanner.close();
  }
}
