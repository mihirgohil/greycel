import java.util.*;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
class GuiDemo extends JFrame implements ActionListener{
    JPanel panel;
    JLabel user_label, message;
    JTextField userName_text;
    JButton submit, cancel;
    GuiDemo()
    {
         // Username Label
      user_label = new JLabel();
      user_label.setText("Enter String :");
      userName_text = new JTextField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
     
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Demo !");
      setSize(200,250);
      setVisible(true);
    }
    public static void main(String args[])
    {
        new GuiDemo();
    }
    @Override
   public void actionPerformed(ActionEvent ae) {
    
     
      
         
         String[] splitbySpace;
         String s;
         StringBuilder sr = new StringBuilder();
         System.out.println("Enter String : ");
         String inputStrVar = userName_text.getText();
         System.out.println("\n\nInput String : "+inputStrVar);
         String[] arString = inputStrVar.split("\\.");
         
         for(int i=0; i < arString.length;i++)
         {
             splitbySpace = arString[i].split(" ");
             for(int j=splitbySpace.length-3; j >= 0;j--)
             {   
                     sr.append(" "+splitbySpace[j]);
             }
             for(int g=3; g < splitbySpace.length;g++)
             {   
                     sr.append(" "+splitbySpace[g]);
             }
             sr.append(".");
         }
         message.setText("\n\nOutput : "+sr);
         
   }
}