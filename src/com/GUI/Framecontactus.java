package com.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Framecontactus extends JFrame 
{

        	private JPanel contactpanel;
	        JLabel lblContactUs = new JLabel("Contact Us");
		public JButton btnMail = new JButton("");
		public JButton btncall = new JButton("");
		public JButton button = new JButton("");
		JLabel lblCheckIn = new JLabel("Check In");
		JLabel lblCall = new JLabel("Call");
		JLabel lblEmail = new JLabel("E-mail Us");
		JLabel label = new JLabel("+91-79-40044161");
		JLabel lblCustomerconnectusgmailcom = new JLabel("customer.connectus@gmail.com");
		JLabel lblAddress = new JLabel("");
		public JButton button_1 = new JButton("");
		public JButton btnFeedback = new JButton("");
	        JLabel lblProvideYourFeedback = new JLabel("Provide your feedback");
	
	public Framecontactus() 
        {
		setIconImage(Toolkit.getDefaultToolkit().getImage("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\connectus.png"));
		setTitle("Frame-Contact Us");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 501);
		contactpanel = new JPanel();
		contactpanel.setBackground(Color.BLACK);
		contactpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contactpanel);
		contactpanel.setLayout(null);
		
		lblContactUs.setBounds(300, 26, 344, 68);
		lblContactUs.setForeground(new Color(30, 144, 255));
		lblContactUs.setFont(new Font("moonhouse", Font.PLAIN, 40));
		contactpanel.add(lblContactUs);
		
		btnMail.setBackground(Color.BLACK);
		btnMail.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\Emailicon.png"));
		btnMail.setBounds(44, 147, 102, 100);
		contactpanel.add(btnMail);
		
	    
		btncall.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\PhoneIcon.png"));
		btncall.setBackground(Color.BLACK);
		btncall.setBounds(745, 147, 102, 100);
		contactpanel.add(btncall);
		
		button.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\location.png"));
		button.setBackground(Color.BLACK);
		button.setBounds(542, 147, 102, 100);
		contactpanel.add(button);
		
		lblCheckIn.setForeground(Color.WHITE);
		lblCheckIn.setFont(new Font("Champagne & Limousines", Font.BOLD, 16));
		lblCheckIn.setBounds(567, 258, 102, 31);
		contactpanel.add(lblCheckIn);
		
		lblCall.setForeground(Color.WHITE);
		lblCall.setFont(new Font("Champagne & Limousines", Font.BOLD, 16));
		lblCall.setBounds(781, 258, 102, 31);
		contactpanel.add(lblCall);
		
		lblEmail.setFont(new Font("Champagne & Limousines", Font.BOLD, 16));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(67, 258, 102, 31);
		contactpanel.add(lblEmail);
		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(745, 300, 219, 19);
		contactpanel.add(label);
		
		lblCustomerconnectusgmailcom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCustomerconnectusgmailcom.setForeground(Color.WHITE);
		lblCustomerconnectusgmailcom.setBounds(10, 288, 269, 43);
		contactpanel.add(lblCustomerconnectusgmailcom);
		
		lblAddress.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\img\\AUadress.jpg"));
		lblAddress.setBounds(424, 274, 311, 122);
		contactpanel.add(lblAddress);
		
		button_1.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\B2h.jpg"));
		button_1.setBounds(300, 407, 279, 42);
		contactpanel.add(button_1);
		
		btnFeedback.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\feedbackIcon.png"));
		btnFeedback.setBounds(300, 153, 89, 94);
		contactpanel.add(btnFeedback);
		
		lblProvideYourFeedback.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProvideYourFeedback.setForeground(new Color(255, 255, 255));
		lblProvideYourFeedback.setBounds(286, 257, 168, 34);
		contactpanel.add(lblProvideYourFeedback);
	}
}
