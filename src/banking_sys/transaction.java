package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class transaction extends JFrame implements ActionListener {
	
JLabel main_heading;
JButton deposit,fast_cash,pin_change,cash_widthrawl,mini_statement,balance_enquiry,exit;
public static String transaction_pin="";

 transaction(){

	main_heading=new JLabel("Please Select Your Transactions");
	main_heading.setFont(new Font("Raleway",Font.BOLD,30));
	
	deposit=new JButton("DEPOSIT");
	deposit.setBackground(Color.BLACK);
	deposit.setFont(new Font("Raleway",Font.BOLD,20));
	
    fast_cash=new JButton("FAST CASH");
    fast_cash.setBackground(Color.BLACK);
    fast_cash.setFont(new Font("Raleway",Font.BOLD,20));
    		
    pin_change=new JButton("PIN CHANGE");
    pin_change.setBackground(Color.BLACK);
    pin_change.setFont(new Font("Raleway",Font.BOLD,20));
    
    cash_widthrawl=new JButton("CASH WIDTHRAWL");
    cash_widthrawl.setBackground(Color.BLACK);
    cash_widthrawl.setFont(new Font("Raleway",Font.BOLD,20));
    
    mini_statement=new JButton("MINI STATEMENT");
    mini_statement.setBackground(Color.BLACK);
    mini_statement.setFont(new Font("Raleway",Font.BOLD,20));
    
    balance_enquiry=new JButton("BALANCE ENQUIRY");
    balance_enquiry.setBackground(Color.BLACK);
    balance_enquiry.setFont(new Font("Raleway",Font.BOLD,20));
    
    exit=new JButton("EXIT");
    exit.setBackground(Color.BLACK);
    exit.setFont(new Font("Raleway",Font.BOLD,20));
   
    
    //set bounds
    setLayout(null);
    
    main_heading.setBounds(120,120,500,75);
    add(main_heading);
    
    deposit.setBounds(100,250,250,50);
    add(deposit);
    
    fast_cash.setBounds(100,350,250,50);
    add(fast_cash);
    
    pin_change.setBounds(100,450,250,50);
    add(pin_change);
    
    cash_widthrawl.setBounds(400,250,250,50);
    add(cash_widthrawl);
    
    mini_statement.setBounds(400,350,250,50);
    add(mini_statement);
    
    balance_enquiry.setBounds(400,450,250,50);
    add(balance_enquiry);
    
    exit.setBounds(250,600,200,50);
    add(exit);
    
    deposit.addActionListener(this);
    pin_change.addActionListener(this);
    balance_enquiry.addActionListener(this);
    cash_widthrawl.addActionListener(this);
    exit.addActionListener(this);
    

    setSize(750,750);
	setLocation(500,200); 
 }
 
 public void actionPerformed(ActionEvent event) {
	 
	 
	 if(event.getSource()==deposit) {
		 new Deposit().setVisible(true);
		 setVisible(false);
	 }
	 
	 else if(event.getSource()==pin_change) {
		 new ChangePin().setVisible(true);
		 setVisible(false);
	 }
	 
	 else if(event.getSource()==cash_widthrawl) {
		 new Widthrawl().setVisible(true);
		 setVisible(false);
	 }
	 
	 else if(event.getSource()==balance_enquiry) {
	  transaction_pin=JOptionPane.showInputDialog("Enter Pin");
	  
	    try {
	    Connection con=connection_db.getConnection();
		Statement s=con.createStatement();
		//String query="Select balance from bank_amount where pin='"+transaction_pin+"' ";
		String query="Select balance from bank_amount where pin="+transaction_pin;
		
		ResultSet res=s.executeQuery(query);
		
		 if(res.next()) {
	 	   String balance=res.getString("balance");
           JOptionPane.showMessageDialog(null,"Your account balance is "+balance);
		 }
		 else {
			 System.out.println("false");
		 }
		
	    }
	
	    catch(Exception ex) {
	    	ex.printStackTrace();
	    }
	 }
	 else if(event.getSource()==exit)
	 {
		 System.exit(0);
	 }
 }
 
 public static void main(String[]args) {
	 new transaction().setVisible(true);
 }
}
