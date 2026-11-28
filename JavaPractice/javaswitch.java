package JavaPractice;

public class JavaSwitch {
  public static void main(String[] args) {
    String product = "Water";
    int money = 1;

    switch (money) {
      case 1:
        System.out.println("FUCK " + product);
        break;
      case 2:
        System.out.println("NOO");
        break;
      default:
        System.out.println("Unknown price");
    }
  }
}  