package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
	
 JLabel heading;
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
    
    
    setSize(750,750);
	setLocation(500,200);
	setVisible(true);
    
 }
 public static void main(String[]args) {
	 Deposit obj1=new Deposit();
 }
 
 
}
