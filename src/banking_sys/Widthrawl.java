package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Widthrawl extends JFrame implements ActionListener {
	 
	 JLabel heading1,heading2,heading3;
	 JTextField amount;
	 JButton widthraw,Back,Exit;
	 
	 //initialising objects

	 Widthrawl(){
	 
	  heading1=new JLabel("MAXIMUM DAILY WITHDRAWL");
	  heading1.setFont(new Font("Raleway",Font.BOLD,30));
	 
	  heading2=new JLabel("IS RS.10,000");
	  heading2.setFont(new Font("Raleway",Font.BOLD,30));
	  
	  heading3=new JLabel("PLEASE ENTER YOUR AMOUNT");
	  heading3.setFont(new Font("Raleway",Font.BOLD,30));
	  
	  amount=new JTextField(15);
	  amount.setFont(new Font("Raleway",Font.BOLD,30));
	  
	  widthraw=new JButton("Widthraw");
	  widthraw.setBackground(Color.BLACK);
	  widthraw.setFont(new Font("Raleway",Font.BOLD,20));
	    
	  Back=new JButton("Back");
	  Back.setBackground(Color.BLACK);
	  Back.setFont(new Font("Raleway",Font.BOLD,20));
	    
	  Exit=new JButton("Exit");
	  Exit.setBackground(Color.BLACK);
	  Exit.setFont(new Font("Raleway",Font.BOLD,20));
	  
	  //set bounds
	  
	  setLayout(null);
	  
	  heading1.setBounds(140,120,500,75);
	  add(heading1);
	  
	  heading2.setBounds(260,170,500,75);
	  add(heading2);
	  
	  heading3.setBounds(150,230,500,75);
	  add(heading3);
	  
	  amount.setBounds(160,330,450,50);
	  add(amount);
	  
	  widthraw.setBounds(200,430,150,50);
	  add(widthraw);
	    
	  Back.setBounds(400,430,150,50);
	  add(Back);
	    
	  Exit.setBounds(290,550,150,50);
	  add(Exit);
	
	    widthraw.addActionListener(this);
	    Back.addActionListener(this);
	    Exit.addActionListener(this);
	  
	  
	  
	  setSize(750,750);
	  setLocation(500,200);
	  setVisible(true);
	  
	 }
	 
	 
	 public void actionPerformed(ActionEvent event) {
		 
		 String widthraw_amount=amount.getText();
		 double balance_amnt,widthraw_val;
		 String pin="";
		 
		 pin=Login.transaction_pin;
		 
		 if(event.getSource()==widthraw) {
			 
		
		 if(widthraw_amount=="") {
			 JOptionPane.showMessageDialog(null,"Fill all required fields");
		  }
		
		else {
				 try {
				    Connection con=connection_db.getConnection();
					Statement s=con.createStatement();
					String query="Select*from bank_amount where pin="+pin;
					ResultSet res=s.executeQuery(query);
					
					if(res.next()){
						balance_amnt=res.getDouble("balance");
						widthraw_val=Double.parseDouble(widthraw_amount);
						balance_amnt-=widthraw_val;
						String update="Update bank_amount set balance="+balance_amnt+" where pin="+pin;
						s.executeUpdate(update);
						
						JOptionPane.showMessageDialog(null,"Amount Successfully widthrawn");
						new transaction().setVisible(true);
						setVisible(false);
					}
				 }
				 
				 catch(Exception ex) {
					 ex.printStackTrace();
				 }
			 }
		 
		 }
		 
		 else if(event.getSource()==Back) {
			 
			 new transaction().setVisible(true);
			 setVisible(false);
			 
		 }
		 else if(event.getSource()==Exit) {
			 System.exit(0);
		 }
		 
	 }
	 
	 public static void main(String[]args) {
		 Widthrawl obj=new Widthrawl();
	 }
}
