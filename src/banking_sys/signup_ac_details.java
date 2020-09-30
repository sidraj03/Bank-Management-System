package banking_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class signup_ac_details extends JFrame implements ActionListener {

	//declaration
    JLabel main_heading, ac_type,card_num,pin_num,card_descr,pin_descr,service_req,card_extra_info,pin_info,cardnum_info;
	
	JRadioButton saving_ac,fixed_ac,current_ac,recurring_ac;
	
	JCheckBox Atm_box,intbank_box,mobbank_box,email_box,cheque_box,estat_box,terms_box;
	
	JButton Submit,Cancel;

 
	signup_ac_details(){
	 
    //intialising labels
		
	main_heading=new JLabel("Page 3:Account Details");
	main_heading.setFont(new Font("Raleway",Font.BOLD,20));
	
	ac_type=new JLabel("Account type");
	ac_type.setFont(new Font("Raleway",Font.BOLD,20));
	
	card_num=new JLabel("Card Number");
	card_num.setFont(new Font("Raleway",Font.BOLD,20));
	
	card_descr=new JLabel("XXXX-XXXX-XXXX-4184");
	card_descr.setFont(new Font("Raleway",Font.BOLD,20));
	
	pin_num=new JLabel("Pin");
	pin_num.setFont(new Font("Raleway",Font.BOLD,20));
	
	pin_descr=new JLabel("XXXX");
	pin_descr.setFont(new Font("Raleway",Font.BOLD,20));

	service_req=new JLabel("Services Required");
	service_req.setFont(new Font("Raleway",Font.BOLD,20));
	
	saving_ac=new JRadioButton("Savings Account");
	saving_ac.setFont(new Font("Raleway",Font.BOLD,14));
	
	fixed_ac=new JRadioButton("Fixed Deposit Account");
	fixed_ac.setFont(new Font("Raleway",Font.BOLD,14));
	
	current_ac=new JRadioButton("Current Account");
	current_ac.setFont(new Font("Raleway",Font.BOLD,14));
	
	recurring_ac=new JRadioButton("Recurring Deposit Account");
	recurring_ac.setFont(new Font("Raleway",Font.BOLD,14));
			
	card_extra_info=new JLabel("(Your 16-digit Card number)");
	card_extra_info.setFont(new Font("Raleway",Font.BOLD,10));
	
	pin_info=new JLabel("(4-digit Password)");
	pin_info.setFont(new Font("Raleway",Font.BOLD,10));
	
	cardnum_info=new JLabel("(It would appear on ATM Card,Chequebook and statements)");
	cardnum_info.setFont(new Font("Raleway",Font.BOLD,10));
	
	//Initialising radio buttons
	
	Atm_box=new JCheckBox("ATM card");
	Atm_box.setFont(new Font("Raleway",Font.BOLD,14));
	
	intbank_box=new JCheckBox("Internet Banking");
	intbank_box.setFont(new Font("Raleway",Font.BOLD,14));
	
	mobbank_box=new JCheckBox("Mobile Banking");
	mobbank_box.setFont(new Font("Raleway",Font.BOLD,14));
	
	email_box=new JCheckBox("Email Alerts");
	email_box.setFont(new Font("Raleway",Font.BOLD,14));
	
	cheque_box=new JCheckBox("Chequebook");
	cheque_box.setFont(new Font("Raleway",Font.BOLD,14));
	
	estat_box=new JCheckBox("E-statement");
	estat_box.setFont(new Font("Raleway",Font.BOLD,14));
	
	terms_box=new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge");
	terms_box.setFont(new Font("Raleway",Font.BOLD,11));
   
	//Intialising buttons
	
	Submit=new JButton("Submit");
	Submit.setBackground(Color.BLACK);
	Submit.setFont(new Font("Raleway",Font.BOLD,20));
	
	Cancel=new JButton("Cancel");
	Cancel.setBackground(Color.BLACK);
	Cancel.setFont(new Font("Raleway",Font.BOLD,20));
			
	//setting bounds
			
	setLayout(null);
	
	main_heading.setBounds(250,30,400,75);
    add(main_heading);
    
    ac_type.setBounds(90,120,140,30);
    add(ac_type);
     
    saving_ac.setBounds(100,170,200,30);
	add(saving_ac);
    
	fixed_ac.setBounds(300,170,200,30);
	add(fixed_ac);
    
	current_ac.setBounds(100,220,200,30);
	add(current_ac);
    
	recurring_ac.setBounds(300,220,300,30);
	add(recurring_ac);
	
	card_num.setBounds(90,270,300,30);
	add(card_num);
	
	card_descr.setBounds(300,270,300,30);
	add(card_descr);
	
	card_extra_info.setBounds(90,290,300,30);
	add(card_extra_info);
	 	
	cardnum_info.setBounds(300,290,400,30);
	add(cardnum_info);

	pin_num.setBounds(90,340,300,30);
	add(pin_num);
	
	pin_descr.setBounds(300,340,300,30);
	add(pin_descr);
	
	pin_info.setBounds(90,360,300,30);
	add(pin_info);

	service_req.setBounds(90,410,300,30);
	add(service_req);
	
	
	Atm_box.setBounds(90,460,200,30);
	add(Atm_box);
	
	intbank_box.setBounds(300,460,200,30);
	add(intbank_box);
	
	mobbank_box.setBounds(90,510,200,30);
	add(mobbank_box);
	
	email_box.setBounds(300,510,200,30);
	add(email_box);
	
	cheque_box.setBounds(90,560,200,30);
	add(cheque_box);
	
	estat_box.setBounds(300,560,200,30);
    add(estat_box);
	
	terms_box.setBounds(90,620,600,30);
	add(terms_box);
	
	
	Submit.setBounds(140,660,140,30);
	add(Submit);
	
	Cancel.setBounds(340,660,140,30);
	add(Cancel);
	
	Submit.addActionListener(this);
	Cancel.addActionListener(this);
	
 	setSize(750,750);
	setLocation(500,200);
	setVisible(true); 
	
   }
	public void actionPerformed(ActionEvent event) {
		String ac_type="",service_req="";
	
		if(saving_ac.isSelected()) {
			ac_type="Savings Account";
		}
		else if(fixed_ac.isSelected()) {
			ac_type="Fixed Account";
		}
		else if(current_ac.isSelected()) {
			ac_type="Current Account";
		}
		else if(recurring_ac.isSelected()) {
			ac_type="Recurring Deposit Account";
		}
		
		Random num=new Random();
		
		long first7=(num.nextLong()%90000000L)+5040936000000000L;
		long first8=Math.abs(first7);
		
		long first3=(num.nextLong()%9000L)+1000L;
		long first4=Math.abs(first3);
	
		
		if(Atm_box.isSelected()) {
			service_req=service_req+"ATM card ";
		}
		if(intbank_box.isSelected()) {
			service_req=service_req+"Internet Banking ";
		}
		if(mobbank_box.isSelected()) {
			service_req=service_req+"Mobile Banking ";
		}
		if(email_box.isSelected()) {
			service_req=service_req+"EMAIL Alerts ";
		}
		if(cheque_box.isSelected()) {
			service_req=service_req+"Cheque book ";
		}
		if(estat_box.isSelected()) {
			service_req=service_req+"E-statement  ";
		}
		
         
		try {
			
			if(event.getSource()==Submit) {
				
			if(ac_type==""||service_req==""||terms_box.isSelected()==false)
			{
				JOptionPane.showMessageDialog(null,"Fill all required fields");
			}
			
			else if(terms_box.isSelected()==false) {
				JOptionPane.showMessageDialog(null,"Agree to the terms and Conditions");
			}
			
			else {
//			connection_db signup_object=new connection_db();
			Connection con=connection_db.getConnection();
			Statement s=con.createStatement();
            String signup_query="insert into signup_ac values('"+ac_type+"',' "+first8+" ','"+first4+"','"+service_req+"')";
            String login_query="insert into login values('"+first8+"',' "+first4+"')";
			s.executeUpdate(signup_query);
			s.executeUpdate(login_query);
			
			new Deposit().setVisible(true);
			setVisible(false);
			
			}
			
			}
			
			else if(event.getSource()==Cancel)
				System.exit(0);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	
	}
	
	public static void main(String[]args) {
		signup_ac_details obj1=new signup_ac_details();
	}


}
