package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

	JLabel heading_head,cardno_head,pin_head;
	JTextField card_text;
	JPasswordField pin_text;
	JButton signup_but,signin_but,clear_but;
	
	Login(){
		//System.out.println("Hey");
		//moving text to center add later
		super("Bank management system");
		
		heading_head=new JLabel("WELCOME");
		heading_head.setFont(new Font("Osward",Font.BOLD,38));
		
		cardno_head=new JLabel("Card no.");
		cardno_head.setFont(new Font("Raleway",Font.BOLD,24));
		
	
		pin_head=new JLabel("Pin no.");
		pin_head.setFont(new Font("Raleway",Font.BOLD,24));
		
		
		card_text=new JTextField(15);
		pin_text=new JPasswordField(15);
		
		signin_but=new JButton("SIGN IN");
		signin_but.setBackground(Color.BLACK);
//		signin_but.setForeground(Color.WHITE);
		
	
		clear_but=new JButton("CLEAR");
		clear_but.setBackground(Color.BLACK);
//		clear_but.setForeground(Color.WHITE);
		
		signup_but=new JButton("SIGN UP");
		signup_but.setBackground(Color.BLACK);
//		signup_but.setForeground(Color.WHITE);
				
		//To set our own layout
		setLayout(null);
		
		//set layout for headings
		heading_head.setBounds(175,50,450,200);
		add(heading_head);
		
		cardno_head.setBounds(125,150,375,200);
		add(cardno_head);
		
		pin_head.setBounds(125,225,375,200);
		add(pin_head);
		
		
		//set layout for text and password field
		
		card_text.setFont(new Font("Arial",Font.BOLD,14));
		card_text.setBounds(300,235,230,30);
		add(card_text);
		
		pin_text.setFont(new Font("Arial",Font.BOLD,14));
		pin_text.setBounds(300,310,230,30);
		add(pin_text);
		
		//set layout for buttons
		signin_but.setFont(new Font("Arial",Font.BOLD,14));
		signin_but.setBounds(300,400,100,30);
		add(signin_but);
		
		clear_but.setFont(new Font("Arial",Font.BOLD,14));
	    clear_but.setBounds(430,400,100,30);
		add(clear_but);
		
		signup_but.setFont(new Font("Arial",Font.BOLD,14));
		signup_but.setBounds(300,450,230,30);
		add(signup_but);
		
		
		//add actions to buttons
		signin_but.addActionListener(this);
		clear_but.addActionListener(this);
		signup_but.addActionListener(this);
		
		//window constraints
		setSize(750,750);
		setLocation(500,200);
		setVisible(true);
		
}
	
public void performAction(ActionEvent event) {
	
	//exception handling as dealing with database connections
	try {
		connection_db dbobject=new connection_db();
		String card_det=card_text.getText();
		String pin_det=pin_text.getText();
		
		//query the database and store results in a result set
		String query="Select* from login where cardno='"+card_det+"' and pin='"+pin_det+"'";
		ResultSet rs=dbobject.s.executeQuery(query);
		
		if(event.getSource()==signin_but) {
			if(rs.next()) {
				//open transaction class and set visibility as true for transaction window while hiding login window
				setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null,"Incorrect Card number or Password");
			}
			
			
		}
		else if(event.getSource()==clear_but) {
			card_text.setText("");
			pin_text.setText("");
		}
		else if(event.getSource()==signup_but){
			//open sign-up class and set visibility as true for signup window while hiding login window
			setVisible(false);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}

public static void main(String[]args) {
	Login l1=new Login();
}

}
