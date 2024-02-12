import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
   private static JLabel userLabel;
   private static JTextField userText;
   private static JLabel passwordPanel;

    private static  JTextField passwordText;
    private static  JButton loginButton;
    private static  JLabel success;

    public static void main(String[] args) {

        //setting the size of the frame
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);


        //create username panel
        panel.setLayout(null);

         userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        //username text field
        userText = new JTextField(20);
       userText.setBounds(100,20,165,25);
       panel.add(userText);

       //create password panel
         passwordPanel = new JLabel("Password");
        passwordPanel.setBounds(10,50,80,25);
        panel.add(passwordPanel);

        //password text field
         passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165, 25);
        panel.add(passwordText);


        //create login Button
         loginButton = new JButton("Login");
        loginButton.setBounds(125,80,100,25);
        loginButton.addActionListener(new GUI());
        panel.add(loginButton);

        //create  success label;
         success = new JLabel("");
        success.setBounds( 10, 110, 300,25);
        panel.add(success);



        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Amy") && password.equals("fluffy123")) {
            success.setText("Login successful!");
        }
    }
}
