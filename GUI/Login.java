package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JLabel label1, label2, logoLabel, backgroundLabel;
    JTextField text1;
    JPasswordField text2;
    JButton button;
    
    public Login(){
        setTitle("Login");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100,700);
        
        // Username label and field
        label1 = new JLabel("Username:");
        label1.setBounds(610, 245, 150, 20);
        add(label1);
        
        text1 = new JTextField(15);
        text1.setBounds(725, 242, 300, 32);
        add(text1);
        
        // Password label and field
        label2 = new JLabel("Password:");
        label2.setBounds(610, 315, 150, 20);
        add(label2);
        
        text2 = new JPasswordField(15);
        text2.setBounds(725, 311, 300, 32);
        add(text2);
        
        // Login button
        button = new JButton("Login");
        button.setBounds(680, 420, 150, 50);
        add(button);
        
        button.addActionListener(this);
        
        //Logo label
        //ImageIcon logo = new ImageIcon("Images/logo.jpg");
        //logoLabel = new JLabel(logo);
        //logoLabel.setBounds(30, 10, 50, 50);
        //add(logoLabel);
        
        // Background label
        ImageIcon background = new ImageIcon("Images/Background 2.jpg");
        backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 1100,700);
        add(backgroundLabel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String username = text1.getText();
        String password = text2.getText();
        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(null, "Login successful!");
            dispose();
			 ChoseVehicle choseVehicle = new ChoseVehicle();
			 //CarList carList = new CarList();
            
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password!");
        }
    }
}