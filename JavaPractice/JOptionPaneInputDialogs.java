import javax.swing.JOptionPane;

public class JOptionPaneInputDialogs {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    System.out.println(name);
    
    String trail = JOptionPane.showInputDialog(
      null,
      "Enter your name",
      "name programme",
      JOptionPane.INFORMATION_MESSAGE);
      System.out.println(trail);
  }
}