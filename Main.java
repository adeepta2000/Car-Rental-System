import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main{
	public static void main(String[] args){
	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 500);
		frame.setLayout(new GridLayout(5,2,10,10));
		
		frame.add(new JButton("ORDER BIKE"));
		frame.add(new JButton("ORDER MICROBUS/ VAN"));
		frame.add(new JButton("ORDER CAR"));
		
		
		frame.setVisible(true);
		
	
	}
	
}