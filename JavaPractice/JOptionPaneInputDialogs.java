import javax.swing.JOptionPane;

public class JOptionPaneInputDialogs {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    System.out.println(name);
  }
}