package banking_sys;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
		//labels and all necessary types of objects
	
		JLabel heading_label,page1_label,name_label,father_label,dob_label,gender_label,email_label,marital_label,address_label,
		city_label,pincode_label,state_label;
		
		JTextField name_field,father_field,email_field,address_field,city_field,pincode_field,state_field;
		
		JRadioButton male_but,female_but,married_but,unmarried_but,other_but;
		
		JButton next_but;
		
		JComboBox date_box,month_box,year_box;
		
		Random random_obj=new Random();
		Long app_number = Math.abs((random_obj.nextLong() % 9000L)+1000L);
		
		
		
		Signup(){
			
			super("SIGNUP");
			
			//setting labels
			heading_label=new JLabel("APPLICATION FORM NO "+app_number);
			heading_label.setFont(new Font("Raleway",Font.BOLD,30));
			
			page1_label=new JLabel("Page 1:Personal Details");
			page1_label.setFont(new Font("Raleway",Font.BOLD,20));
					
			
			name_label=new JLabel("Name:");
			name_label.setFont(new Font("Raleway",Font.BOLD,14));
		
			father_label=new JLabel("Father's Name:");
			father_label.setFont(new Font("Raleway",Font.BOLD,14));
			
			dob_label=new JLabel("Date of Birth");
			dob_label.setFont(new Font("Raleway",Font.BOLD,14));
		
			gender_label=new JLabel("Gender:");
			gender_label.setFont(new Font("Raleway",Font.BOLD,14));
			
		    email_label=new JLabel("Email:");
			email_label.setFont(new Font("Raleway",Font.BOLD,14));
			
			marital_label=new JLabel("Marital status:");
			marital_label.setFont(new Font("Raleway",Font.BOLD,14));
			
			address_label=new JLabel("Address:");
			address_label.setFont(new Font("Raleway",Font.BOLD,14));
			
			city_label=new JLabel("City:");
			city_label.setFont(new Font("Raleway",Font.BOLD,14));
			
			pincode_label=new JLabel("Pincode:");
			pincode_label.setFont(new Font("Raleway",Font.BOLD,14));
			
		    state_label=new JLabel("State");
			state_label.setFont(new Font("Raleway",Font.BOLD,14));

			//intialising text fields objects
			
		    name_field=new JTextField(15);
		    name_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			father_field=new JTextField(15);
		    father_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			email_field=new JTextField(15);
		    email_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			address_field=new JTextField(15);
		    address_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			city_field=new JTextField(15);
		    city_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			pincode_field=new JTextField(15);
		    pincode_field.setFont(new Font("Raleway",Font.BOLD,14));
			
			state_field=new JTextField(15);
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
		    unmarried_but.setFont(new Font("Raleway",Font.BOLD,14));
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
            
            //set bounds for labels
            
            heading_label.setBounds(150,20,700,75);
            add(heading_label);
           
            
            page1_label.setBounds(250,50,400,75);
            add(page1_label);
            
            name_label.setBounds(90,140,70,30);
            add(name_label);
            
            father_label.setBounds(90,190,140,30);
            add(father_label);
            
            dob_label.setBounds(90,240,100,30);
            add(dob_label);
            
            gender_label.setBounds(90,290,70,30);
            add(gender_label);
            
            email_label.setBounds(90,340,70,30);
            add(email_label);
            
            marital_label.setBounds(90,390,140,30);
            add(marital_label);
            
            address_label.setBounds(90,440,70,30);
            add(address_label);
            
            city_label.setBounds(90,490,70,30);
            add(city_label);
            
            pincode_label.setBounds(90,540,70,30);
            add(pincode_label);
            
            state_label.setBounds(90,590,70,30);
            add(state_label);
            
            
            //set bound for text fields
            
            name_field.setBounds(200,140,400,30);
            add(name_field);
            
            father_field.setBounds(200,190,400,30);
            add(father_field);
            
            email_field.setBounds(200,340,400,30);
            add(email_field);
            
            address_field.setBounds(200,440,400,30);
            add(address_field);
            
            city_field.setBounds(200,490,400,30);
            add(city_field);
            
            pincode_field.setBounds(200,540,400,30);
            add(pincode_field);
            
            state_field.setBounds(200,590,400,30);
            add(state_field);
            
            
            //set bounds for combo boxes 
            date_box.setBounds(200,240,75,30);
            add(date_box);
            
            month_box.setBounds(300,240,100,30);
            add(month_box);
            
            year_box.setBounds(400,240,100,30);
            add(year_box);
            
            
            //set bounds for radio buttons
            male_but.setBounds(200,290,100,30);
            add(male_but);
            
            female_but.setBounds(300,290,100,30);
            add(female_but);
            
            
            married_but.setBounds(200,390,100,30);
            add(married_but);
            
            unmarried_but.setBounds(300,390,150,30);
            add(unmarried_but);
            
            other_but.setBounds(425,390,100,30);
            add(other_but);
            
      
           //set bounds for button next
            
            next_but.setBounds(530,650,70,30);
            add(next_but);
          
            
            next_but.addActionListener(this);
            
              
            setSize(750,750);
    		setLocation(500,200);
    		setVisible(true);
		    
		    }
		
		public void actionPerformed(ActionEvent event) {
			
			String name_val,father_val,email_val,address_val,city_val,pincode_val,state_val,
			dob_date,dob_month,dob_year,gender_stat="",marital_stat="";
			
			name_val=name_field.getText();
			father_val=father_field.getText();
			email_val=email_field.getText();
			address_val=address_field.getText();
			city_val=city_field.getText();
			pincode_val=pincode_field.getText();
			state_val=state_field.getText();
			
			dob_date=(String)date_box.getSelectedItem();
			dob_month=(String)month_box.getSelectedItem();
			dob_year=(String)year_box.getSelectedItem();
			
			if(male_but.isSelected())
				gender_stat="Male";
			else if(female_but.isSelected())
				gender_stat="Female";
			
			if(married_but.isSelected())
				marital_stat="Married";
			else if(unmarried_but.isSelected())
				marital_stat="Unmarried";
			else if(other_but.isSelected())
				marital_stat="Other";
			
			try {
				
				if(name_val==""||father_val==""||email_val==""||address_val==""||city_val==""||pincode_val==""
					||state_val==""||dob_date==""||dob_month==""||dob_year==""||gender_stat==""||marital_stat=="")
				{
					JOptionPane.showMessageDialog(null,"Fill all required fields");
				}
				
				else {
//				connection_db signup_object=new connection_db();
				Connection con=connection_db.getConnection();
				Statement s=con.createStatement();
	            String signup_query="insert into signup values('"+name_val+"',' "+father_val+" ','"+dob_date+"','"+dob_month+"','"+dob_year+"','"+gender_stat+"',"
	            		+ "'"+email_val+"','"+marital_stat+"','"+address_val+"','"+city_val+"','"+pincode_val+"','"+state_val+"')";		
				s.executeUpdate(signup_query);
				
				//set signup 2 as visible
				
				}
				
			}
			catch(Exception e){
			 e.printStackTrace();		
			}

			
		}
		
		public static void main(String[]args) {
			Signup ob1=new Signup();
		}
		    
			
		}		
		
