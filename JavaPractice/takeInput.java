import java.util.Scanner;

public class takeInput {
  public static void main(String[] ars) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    System.out.println(name);
  }
}
