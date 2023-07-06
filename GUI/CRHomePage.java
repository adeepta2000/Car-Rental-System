package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CRHomePage extends JFrame //implements ActionListener
{
	
	JLabel label1, label2, imageLabel1, imageLabel2,imageLabel3,imageLabel4;
    
    JButton button1,button2,button3,button4;
	
	ImageIcon image1,image2,image3,image4;
	
	public CRHomePage(){
		
		
        
        
        /*label2 = new JLabel("pph");
        label2.setBounds(410, 100, 150, 120);
        add(label2);
        */
        
        button1 = new JButton("RENT?");
        button1.setBounds(850, 120, 150, 50);
        add(button1);
		
		button2 = new JButton("RENT?");
        button2.setBounds(850, 320, 150, 50);
        add(button2);
		
		button3 = new JButton("RENT?");
        button3.setBounds(850, 520, 150, 50);
        add(button3);
		
		button4 = new JButton("RENT?");
        button4.setBounds(850, 720, 150, 50);
        add(button4);
        
		
		ImageIcon image1 = new ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\CarRentals\\images\\carimages\\ToyotaPremio2018.png");
		ImageIcon image2 = new ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\CarRentals\\images\\carimages\\ToyotaPremio2015.png");
		ImageIcon image3 = new ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\CarRentals\\images\\carimages\\ToyotaCamry.png");
		ImageIcon image4 = new ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\CarRentals\\images\\carimages\\ToyotaAllion2018.png");
		
		
		imageLabel1 = new JLabel();
		imageLabel1.setText("Toyota Premio 2018");
		imageLabel1.setBounds(100, 100, 650, 190);
		imageLabel1.setFont(new Font("Comic Sans",Font.BOLD, 25));
		imageLabel1.setVerticalAlignment(JLabel.BOTTOM);
		imageLabel1.setHorizontalAlignment(JLabel.RIGHT); 
		//imageLabel1.setBounds(100, 100, 75, 75);
		imageLabel1.setIcon(image1);
		
		imageLabel2 = new JLabel();
		imageLabel2.setText("Toyota Premio 2015");
		imageLabel2.setBounds(100, 300, 650, 190);
		imageLabel2.setVerticalAlignment(JLabel.BOTTOM);
		imageLabel2.setHorizontalAlignment(JLabel.RIGHT); 
		//imageLabel2.setBounds(100, 100, 75, 75);
		imageLabel2.setFont(new Font("Comic Sans",Font.BOLD, 25));
		imageLabel2.setIcon(image2);
		
        imageLabel3 = new JLabel();
		imageLabel3.setText("             Toyota Camry");
		imageLabel3.setBounds(100, 500, 650, 190);
		imageLabel3.setVerticalAlignment(JLabel.BOTTOM);
		imageLabel3.setHorizontalAlignment(JLabel.RIGHT); 
		imageLabel3.setFont(new Font("Comic Sans",Font.BOLD, 25));
		imageLabel3.setIcon(image3);
	
		imageLabel4 = new JLabel();
		imageLabel4.setText("Toyota Allion 2018");
		imageLabel4.setBounds(100, 700, 650, 190);
		imageLabel4.setVerticalAlignment(JLabel.BOTTOM);
		imageLabel4.setHorizontalAlignment(JLabel.RIGHT); 
		imageLabel4.setFont(new Font("Comic Sans",Font.BOLD, 25));
		imageLabel4.setIcon(image4);
		
		
		this.setTitle("HomePage CAR CHAI");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1100,700);
		this.setBackground(Color.yellow);
		this.add(imageLabel1);
		this.add(imageLabel2);
		this.add(imageLabel3);
		this.add(imageLabel4);
        
        setVisible(true);
	}
		
}