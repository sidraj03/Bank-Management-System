package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class ChangePin extends JFrame implements ActionListener{

	JLabel heading,current_pin,new_pin,reenter;
	JTextField current_field,new_field,reenter_field;
	JButton Save,Back;
	
	
	ChangePin(){
	
     //initialise
	
	heading=new JLabel("CHANGE YOUR PIN");
	heading.setFont(new Font("Raleway",Font.BOLD,30));
	
	current_pin=new JLabel("Current PIN:");
	current_pin.setFont(new Font("Raleway",Font.BOLD,20));
	
	new_pin=new JLabel("New Pin:");
	new_pin.setFont(new Font("Raleway",Font.BOLD,20));
	
	reenter=new JLabel("Re-enter New Pin:");
	reenter.setFont(new Font("Raleway",Font.BOLD,20));
	
    current_field=new JTextField(15);
    current_field.setFont(new Font("Raleway",Font.BOLD,20));
    
    new_field=new JTextField(15);
    new_field.setFont(new Font("Raleway",Font.BOLD,20));
    
    reenter_field=new JTextField(15);
    reenter_field.setFont(new Font("Raleway",Font.BOLD,20));
    
    Back=new JButton("Back");
	Back.setBackground(Color.BLACK);
    Back.setFont(new Font("Raleway",Font.BOLD,20));
	    
    Save=new JButton("Save");
	Save.setBackground(Color.BLACK);
	Save.setFont(new Font("Raleway",Font.BOLD,20));
    
    //Set bounds
    setLayout(null);
    
    heading.setBounds(240,100,500,75);
    add(heading);
    

    current_pin.setBounds(90,220,300,50);
    add(current_pin);
    
    current_field.setBounds(290,220,400,50);
    add(current_field);
    
    new_pin.setBounds(90,320,400,50);
    add(new_pin);

    new_field.setBounds(290,320,400,50);
    add(new_field);

    reenter.setBounds(90,420,400,50);
    add(reenter);

    reenter_field.setBounds(290,420,400,50);
    add(reenter_field);

    Save.setBounds(190,520,200,50);
    add(Save);

    Back.setBounds(440,520,200,50);
    add(Back);
    
    
      setSize(750,750);
	  setLocation(500,200);
	  setVisible(true);
    
	}

	public static void main(String[]args) {
		ChangePin obj1=new ChangePin();
	}
}
