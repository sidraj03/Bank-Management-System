package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
	
 JLabel heading,pin;
 JTextField amount;
 JButton Depo,Back,Exit;
 
 Deposit(){
	 
	heading=new JLabel("Enter Amount to Deposit");
    heading.setFont(new Font("Raleway",Font.BOLD,30));
    
    amount=new JTextField(15);
    amount.setFont(new Font("Raleway",Font.BOLD,20));
    
    Depo=new JButton("Deposit");
    Depo.setBackground(Color.BLACK);
    Depo.setFont(new Font("Raleway",Font.BOLD,20));
    
    
    Back=new JButton("Back");
    Back.setBackground(Color.BLACK);
    Back.setFont(new Font("Raleway",Font.BOLD,20));
    
    Exit=new JButton("Exit");
    Exit.setBackground(Color.BLACK);
    Exit.setFont(new Font("Raleway",Font.BOLD,20));
    
    //set bounds
    setLayout(null);
    
    heading.setBounds(170,120,500,75);
    add(heading);
    
    amount.setBounds(180,220,350,50);
    add(amount);
    
    Depo.setBounds(180,320,150,50);
    add(Depo);
    
    Back.setBounds(380,320,150,50);
    add(Back);
    
    Exit.setBounds(280,450,150,50);
    add(Exit);
    
    
    Depo.addActionListener(this);
    Back.addActionListener(this);
    Exit.addActionListener(this);
    
    setSize(750,750);
	setLocation(500,200);
	setVisible(true);
    
 }
 
 public void actionPerformed(ActionEvent event) {
	 String deposit_amount=amount.getText();
	 double balance_amnt,deposit_val;
	 String pin="";
	 
	 int flag=0;
	 
	 
	 if(!(transaction.transaction_pin.equals(""))) {
		 System.out.println(transaction.transaction_pin);
		 pin=transaction.transaction_pin;
		 flag=0;
	 }
	 
	 else if(!(signup_ac_details.signup_pin.equals(""))){
		 System.out.println(signup_ac_details.signup_pin);
		 pin=signup_ac_details.signup_pin;
		 flag=1;
	 }
	 
	 if(event.getSource()==Depo) {
	if(deposit_amount.equals("")) {
		 JOptionPane.showMessageDialog(null,"Fill all required fields");
	 }
		 else {
			 
			 try {
			    Connection con=connection_db.getConnection();
				Statement s=con.createStatement();
				String query="";
				deposit_val=Double.parseDouble(deposit_amount);
				
				if(flag==1) {	
				  query="Insert into bank_amount values(' "+pin+" ',' "+deposit_val+"')";	
				  s.executeUpdate(query);
				  JOptionPane.showMessageDialog(null,"Amount Successfully Deposited");
				  setVisible(false);
				  System.exit(0);
				}
				
				else if(flag==0) {
					
				    query="Select*from bank_amount where pin='"+pin+"' ";
					ResultSet res=s.executeQuery(query);			
				
				   if(res.next()){
					balance_amnt=res.getDouble("balance");
					balance_amnt+=deposit_val;
					String update="Update bank_amount set balance='"+balance_amnt+"' where pin='"+pin+"'";
					s.executeUpdate(update);
				   }
				
				   JOptionPane.showMessageDialog(null,"Amount Successfully Deposited");
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
	 Deposit obj1=new Deposit();
 }
 
 
}
