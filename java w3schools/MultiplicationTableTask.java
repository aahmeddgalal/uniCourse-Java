import java.util.Scanner;

public class MultiplicationTableTask {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the max: ");
    int max = input.nextInt();

    for (int i = 1; i <= max; i++) {
      for (int j = 1; j <= max; j++) {
        System.out.print((i * j) + " ");
      }
      System.out.println();
    }



    input.close(); // for resources to be free 
  }
}
