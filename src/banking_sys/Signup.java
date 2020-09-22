package banking_sys;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
		//labels and all necessary types of objects
	
		JLabel name_label,father_label,dob_label,gender_label,email_label,marital_label,address_label,
		city_label,pincode_label,state_label;
		
		JTextField name_field,father_field,email_field,address_field,city_field,pincode_field,state_field;
		
		JRadioButton male_but,female_but,married_but,unmarried_but,other_but;
		
		JButton next_but;
		
		JComboBox date_box,month_box,year_box;
		
		Random random_obj=new Random();
		Long app_number = Math.abs((random_obj.nextLong() % 9000L)+1000L);
		
		
		
		Signup(){
			
			//super("SIGNUP");
			
			//setting labels
			name_label=new JLabel("Name:");
			name_label.setFont(new Font("Raleway",Font.BOLD,24));
		
			father_label=new JLabel("Father's Name:");
			father_label.setFont(new Font("Raleway",Font.BOLD,24));
			
			dob_label=new JLabel("Date of Birth");
			dob_label.setFont(new Font("Raleway",Font.BOLD,24));
		
			gender_label=new JLabel("Gender:");
			gender_label.setFont(new Font("Raleway",Font.BOLD,24));
			
		    email_label=new JLabel("Email:");
			email_label.setFont(new Font("Raleway",Font.BOLD,24));
			
			marital_label=new JLabel("Marital status:");
			marital_label.setFont(new Font("Raleway",Font.BOLD,24));
			
			address_label=new JLabel("Address:");
			address_label.setFont(new Font("Raleway",Font.BOLD,24));
			
			city_label=new JLabel("City:");
			city_label.setFont(new Font("Raleway",Font.BOLD,24));
			
			pincode_label=new JLabel("Pincode:");
			pincode_label.setFont(new Font("Raleway",Font.BOLD,24));
			
		    state_label=new JLabel("State");
			state_label.setFont(new Font("Raleway",Font.BOLD,24));

			//intialising text fields objects
			
		    name_field=new JTextField(15);
		    name_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			father_field=new JTextField(15);
		    father_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			email_field=new JTextField(15);
		    email_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			address_field=new JPasswordField(15);
		    address_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			city_field=new JTextField(15);
		    city_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			pincode_field=new JTextField(15);
		    pincode_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			state_field=new JPasswordField(15);
		    state_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			//Initializing radio button
		    male_but=new JRadioButton("Male");
		    male_but.setFont(new Font("Raleway",Font.BOLD,14));
//		    male_but.setBackground(Color.WHITE);
		    
		    
		    female_but=new JRadioButton("Female");
		    female_but.setFont(new Font("Raleway",Font.BOLD,14));
//		    female_but.setBackground(Color.WHITE);
		    
		    married_but=new JRadioButton("Married");
		    married_but.setFont(new Font("Raleway",Font.BOLD,14));
//		    married_but.setBackground(Color.WHITE); 
//		    
		    unmarried_but=new JRadioButton("Unmarried");
		    married_but.setFont(new Font("Raleway",Font.BOLD,14));
//		    married_but.setBackground(Color.WHITE); 
		    
		    other_but=new JRadioButton("Other");
		    other_but.setFont(new Font("Raleway",Font.BOLD,14));
//		    other_but.setBackground(Color.WHITE); 
		  
		    
		    //Intializing  button
		    
		    next_but=new JButton("Next");
			next_but.setBackground(Color.BLACK);
		    next_but.setFont(new Font("Arial",Font.BOLD,14));
		    
		    //initializing combobox
		    
		    String date[]= {"1","2","3","4","5","6","7","8","9","10"};
		    date_box=new JComboBox(date);
//		    date_box.setBackground(Color.WHITE);
		    
		    
		    String month[]= {"January","February","March","April","May","June","July","August","September",
		    		"October","November", "December"};
		    month_box=new JComboBox(month);
//		    month_box.setBackground(Color.WHITE);
		    
		    String year[]= {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001",
		    		  "2002","2003","2004"};
		    year_box=new JComboBox(year);
//		    _box.setBackground(Color.WHITE);
		    
            setLayout(null);
            
            
		    
		    
		    
		    
		    
		    }
		    
			
		}		
		
