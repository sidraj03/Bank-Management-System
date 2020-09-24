package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class signup_add extends JFrame implements ActionListener{
	
	//defining our objects
	
	JLabel heading_label,religion_label, category_label,income_label,education_label,occupation_label,
	pan_label,aadhar_label,seniorcit_label,existingac_label;
	
	JComboBox religion_field,category_field,income_field,education_field,occupation_field;
	
	JTextField pan_field,aadhar_field,new_field;
	
	JRadioButton seniorcityes_but,seniorcitno_but,existingacyes_but,existingacno_but;
	
	JButton next_but;
	
	
	signup_add(){
	
	//initialising labels
		
		heading_label=new JLabel("Page 2: Additional Details");
		heading_label.setFont(new Font("Raleway",Font.BOLD,20));
		
		religion_label=new JLabel("Religion");
		religion_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		category_label=new JLabel("Category");
		category_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		income_label=new JLabel("Income");
		income_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		education_label=new JLabel("Education");
		education_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		occupation_label=new JLabel("Occupation");
		occupation_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		pan_label=new JLabel("PAN Number");
		pan_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		aadhar_label=new JLabel("Aadhar Number");
		aadhar_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		seniorcit_label=new JLabel("Senior Citizen");
		seniorcit_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		existingac_label=new JLabel("Existing Account");
		existingac_label.setFont(new Font("Raleway",Font.BOLD,14));
		
		//initiallising button
		next_but=new JButton("Next");
		next_but.setBackground(Color.BLACK);
	    next_but.setFont(new Font("Arial",Font.BOLD,14));
		
		//initialising radio buttons
		
		 seniorcityes_but=new JRadioButton("Yes");
		 seniorcityes_but.setFont(new Font("Raleway",Font.BOLD,14));
	
		 seniorcitno_but=new JRadioButton("No");
		 seniorcitno_but.setFont(new Font("Raleway",Font.BOLD,14));
		 
		 existingacyes_but=new JRadioButton("Yes");
		 existingacyes_but.setFont(new Font("Raleway",Font.BOLD,14));
	
	     existingacno_but=new JRadioButton("No");
		 existingacno_but.setFont(new Font("Raleway",Font.BOLD,14));
	
		//Intialising comboboxes
		 
		 String religions[]= {"Hindu","Christian","Muslim","Sikh","Other"};
		 religion_field=new JComboBox(religions);
		 religion_field.setFont(new Font("Raleway",Font.BOLD,14));
		 
		 
		 String category[]= {"General","OBC","SC","ST","Other"};
		 category_field=new JComboBox(category);
		 category_field.setFont(new Font("Raleway",Font.BOLD,14));
		 
		 String income[]= {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000","Above 10,00,000"};
		 income_field=new JComboBox(income);
		 income_field.setFont(new Font("Raleway",Font.BOLD,14));
		 
		 String education_qual[]= {"Undergraduate","Graduate","Post-Graduate","Doctorate","Others"};
		 education_field=new JComboBox(education_qual);
		 education_field.setFont(new Font("Raleway",Font.BOLD,14));
				 
		 		
		 String occupation[]= {"Salaried","Self-Employed","Business","Student","Retired","Others"};
		 occupation_field=new JComboBox(occupation);
		 occupation_field.setFont(new Font("Raleway",Font.BOLD,14));
		 
		 
	    //Intialising text field
		 pan_field=new JTextField(15);
		 pan_field.setFont(new Font("Raleway",Font.BOLD,14));
		 
		 aadhar_field=new JTextField(15);
		 aadhar_field.setFont(new Font("Raleway",Font.BOLD,14));
	

		 //setting bounds for labels
		 
		 setLayout(null);
		 
		 heading_label.setBounds(250,50,400,75);
         add(heading_label);
         
         religion_label.setBounds(90,140,140,30);
         add(religion_label);
         
         category_label.setBounds(90,190,140,30);
         add(category_label);
         
         income_label.setBounds(90,240,140,30);
         add(income_label);
         
         education_label.setBounds(90,290,140,30);
         add(education_label);
         
         occupation_label.setBounds(90,340,140,30);
         add(occupation_label);
 		
         pan_label.setBounds(90,390,140,30);
         add(pan_label);
 		
 		 aadhar_label.setBounds(90,440,140,30);
         add(aadhar_label);
 		 
 		 seniorcit_label.setBounds(90,490,140,30);
         add(seniorcit_label);
 		 
 		 existingac_label.setBounds(90,540,140,30);
         add(existingac_label);
         
         //setting bound for comboboxes
         
         religion_field.setBounds(270,140,400,30);
         add(religion_field);
         
         category_field.setBounds(270,190,400,30);
         add(category_field);
         
         income_field.setBounds(270,240,400,30);
         add(income_field);
         
         education_field.setBounds(270,290,400,30);
         add(education_field);
         
         occupation_field.setBounds(270,340,400,30);
         add(occupation_field);
         
         
         //setting bounds for text fields
         pan_field.setBounds(270,390,400,30);
         add(pan_field);
         
         aadhar_field.setBounds(270,440,400,30);
         add(aadhar_field);
         
         //setting bounds for radio buttons
         
         seniorcityes_but.setBounds(270,490,100,30);
         add(seniorcityes_but);
         
         seniorcitno_but.setBounds(470,490,100,30);
         add(seniorcitno_but);
         
         existingacyes_but.setBounds(270,540,100,30);
         add(existingacyes_but);
         
         existingacno_but.setBounds(470,540,100,30);
         add(existingacno_but);
         
         //setting bounds for button
         next_but.setBounds(530,600,70,30);
         add(next_but);
       
         
         //next_but.addActionListener(this);
         
         next_but.addActionListener(this);
        
        setSize(750,750);
 		setLocation(500,200);
 		setVisible(true);
      
	}
	public void actionPerformed(ActionEvent event) {
	   	
		String religion_val,category_val,income_val, education_val,occupation_val,pan_val
	   	,aadhar_val,senior_val=null,existingac_val=null;
		
		religion_val=(String)religion_field.getSelectedItem();
		category_val=(String)category_field.getSelectedItem();
		income_val=(String)income_field.getSelectedItem();
		education_val=(String)education_field.getSelectedItem();
		occupation_val=(String)occupation_field.getSelectedItem();
		pan_val=pan_field.getText();
		aadhar_val=aadhar_field.getText();
		
		if(seniorcityes_but.isSelected())
			senior_val="Yes";
		else if(seniorcitno_but.isSelected())
			senior_val="No";
		
		if(existingacyes_but.isSelected())
			existingac_val="Yes";
		else if(existingacno_but.isSelected())
			existingac_val="No";
		
		try {
			
			if(religion_val==""||category_val==""||income_val==""||education_val==""||occupation_val==""||pan_val==""
				||aadhar_val==""||senior_val==""||existingac_val=="")
			{
				JOptionPane.showMessageDialog(null,"Fill all required fields");
			}
			
			else {
//			connection_db signup_object=new connection_db();
			Connection con=connection_db.getConnection();
			Statement s=con.createStatement();
            String signup_query="insert into signup_ad values('"+religion_val+"',' "+category_val+" ','"+income_val+"','"+education_val+"','"+occupation_val+"','"+pan_val+"',"
            		+ "'"+aadhar_val+"','"+senior_val+"','"+existingac_val+"')";		
			s.executeUpdate(signup_query);
			}
			
		}
		catch(Exception e){
		 e.printStackTrace();		
		}
		
	   	
	}
	
	
	public static void main(String [] args) {
		signup_add obj=new signup_add();
	}
	
}
