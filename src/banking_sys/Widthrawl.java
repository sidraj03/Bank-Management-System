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
	  
	  setSize(750,750);
	  setLocation(500,200);
	  setVisible(true);
	  
	 }
	 
	 public static void main(String[]args) {
		 Widthrawl obj=new Widthrawl();
	 }
}
