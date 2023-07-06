package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;


public class ChoseVehicle extends JFrame{
	
	JButton button1, button2, button3;
	
	public ChoseVehicle(){
	
		button1 = new JButton();
		button1.setBounds(200,100,100,50);
		//button.setActionListener(e->System.out.println("something");
		//button1.addActionListener(this);
		button1.setText("RENT CAR");
		button1.setFocusable(false);
		button1.setFont(new Font("Comic Sans",Font.BOLD, 35));
		button1.setBackground(Color.gray);
		button1.setBorder(BorderFactory.createEtchedBorder());
		
		button2 = new JButton();
		button2.setBounds(200,100,100,50);
		//button.setActionListener(e->System.out.println("something");
		//button1.addActionListener(this);
		button2.setText("RENT BIKE");
		button2.setFocusable(false);
		button2.setFont(new Font("Comic Sans",Font.BOLD, 35));
		button2.setBackground(Color.gray);
		button2.setBorder(BorderFactory.createEtchedBorder());
		
		button3 = new JButton();
		button3.setBounds(200,100,100,50);
		//button.setActionListener(e->System.out.println("something");
		//button1.addActionListener(this);
		button3.setText("RENT MICROBUS/VAN");
		button3.setFocusable(false);
		button3.setFont(new Font("Comic Sans",Font.BOLD, 35));
		button3.setBackground(Color.gray);
		button3.setBorder(BorderFactory.createEtchedBorder());
		
	
		//JFrame frame = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 500);
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(5,2,10,10));
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		//frame.add(new JButton("RENT BIKE"));
		//frame.add(new JButton("RENT MICROBUS/ VAN"));
		//frame.add(new JButton("RENT CAR"));
		
		
		this.setVisible(true);
	}
	
	
	
}