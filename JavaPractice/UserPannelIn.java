import javax.swing.JOptionPane;

public class UserPannelIn {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(
      null, // no parent component 
      "What is your name?", //message 
      "Name questionary", // dialog title
      JOptionPane.QUESTION_MESSAGE); // ICON

      System.out.println("HI, there! \nyour name " + name + " is rlly cool");
  }
}