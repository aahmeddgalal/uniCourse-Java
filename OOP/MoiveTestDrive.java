class Movie {
  String name;
  String genera;
  int rating;

  void playIt() {
    System.out.println("Playing " + name + ":)");
  }
}

public class MoiveTestDrive {
  public static void main() {
    Movie one = new Movie();
    one.name = "All the bright places";
    one.genera = "romance and drama";
    one.rating = 5;
    one.playIt();
  }
}