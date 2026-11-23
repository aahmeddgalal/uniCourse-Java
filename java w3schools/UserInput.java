import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to our system!");
    System.out.print("What's your name? ");
    String name = input.next();
    System.out.println("Hi! " + name);
    System.out.print("how old are you? ");
    int age = input.nextInt();
    System.out.println("Oh big boy! being " + age + " must be crazy!");

    input.close();
  }
}