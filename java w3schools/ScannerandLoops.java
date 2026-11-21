import java.util.Scanner;

public class ScannerandLoops {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {

      System.out.println("Enter name");
      String name = input.nextLine();

      System.out.println("Enter age");
      int age = input.nextInt();

      System.out.println("Enter salary");
      int salary = input.nextInt();


      // clear the buffer
      input.nextLine();

      System.out.println(name);
      System.out.println(age);
      System.out.println(salary);
    }
  }
}