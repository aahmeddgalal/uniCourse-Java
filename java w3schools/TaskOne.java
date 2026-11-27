import java.util.Scanner;

public class TaskOne {
  public static void main(String[] args) {
    Scanner limit = new Scanner(System.in);
    System.out.print("Enter your table limit: ");
    int limitM = limit.nextInt();

    for (int i = 1;i <= limitM; i++) {
      for (int j = 1; j <= limitM; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }

    limit.close();
  }
}