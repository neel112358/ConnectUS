package com.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.ResultSet;


//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.*;

import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.Icon;

public class searchframe extends JFrame {

	private JPanel SearchPanel = new JPanel();
	private JTextField textFieldSearch = new JTextField();;

JLabel lblLogo = new JLabel("");
			JLabel lblConnect = new JLabel("Connect");
				JLabel lblAu = new JLabel("");
				JLabel lblUs = new JLabel("US");
				JLabel lblLoggedIn = new JLabel("Logged In as:");
					JLabel labelforusername = new JLabel("");
				JPanel panelmenus = new JPanel();
				public JButton btnHome = new JButton("");
				public JButton btnProfile = new JButton("");
				public JButton btnConnections = new JButton("");
				JPanel panelsearch = new JPanel();
				public JButton btnNotification = new JButton("");
				JButton btnSearch = new JButton("");
				public JButton btnSearch_1 = new JButton("Search");
				public JButton button = new JButton("");
				
	JPanel paneltt = new JPanel();
				
JLabel lblIet = new JLabel("");
				
	//Frame
	public searchframe() {
		setTitle("Search-Connect US");
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Connect US GUI\\Icons\\connectus.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 484);
		//SearchPanel = new JPanel();
		SearchPanel.setBackground(Color.BLACK);
		SearchPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SearchPanel);
				SearchPanel.setLayout(null);

		//Tittle Panel
				paneltt.setBackground(Color.BLACK);
				paneltt.setBounds(0, 0, 711, 145);
				SearchPanel.add(paneltt);
				paneltt.setLayout(null);
				
				
				//Logo Tittle
				lblLogo.setBackground(Color.BLACK);
				final ImageIcon TittleLogo;
				TittleLogo = new ImageIcon(this.getClass().getResource("/Main window logo.png"));
				lblLogo = new JLabel(TittleLogo);
				lblLogo.setBounds(280, 3, 147, 83);
				paneltt.add(lblLogo);
				
				
				//Name Label
				lblConnect.setFont(new Font("moonhouse", Font.PLAIN, 28));
				lblConnect.setForeground(new Color(30, 144, 255));
				lblConnect.setBounds(247, 65, 140, 47);
				paneltt.add(lblConnect);
				
				lblUs.setFont(new Font("moonhouse", Font.PLAIN, 24));
				lblUs.setForeground(new Color(0, 255, 0));
				lblUs.setBounds(391, 82, 46, 14);
				paneltt.add(lblUs);
				
				
				//AU logo Label
				final ImageIcon AUCorner;
				AUCorner = new ImageIcon(this.getClass().getResource("/aucorner.png"));
				lblAu = new JLabel(AUCorner);
				lblAu.setBounds(10, 3, 108, 65);
				paneltt.add(lblAu);
				
				
				//Logged into IET Logo
				final ImageIcon logiet;
				logiet = new ImageIcon(this.getClass().getResource("/logged into iet.png"));
				lblIet = new JLabel(logiet);
				lblIet.setBounds(604, 11, 97, 57);
				paneltt.add(lblIet);
				
				lblLoggedIn.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
				lblLoggedIn.setForeground(new Color(30, 144, 255));
				lblLoggedIn.setBounds(626, 65, 64, 24);
				paneltt.add(lblLoggedIn);
				
				//Label where User name is to be handled
				labelforusername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				labelforusername.setBounds(626, 84, 64, 14);
				paneltt.add(labelforusername);
				
				
				//Menus Panel
				panelmenus.setBackground(new Color(0, 0, 0));
				panelmenus.setBounds(0, 133, 98, 314);
				SearchPanel.add(panelmenus);
				panelmenus.setLayout(null);
				
				
				//Profile Icon
				final ImageIcon Profilelogo;
				Profilelogo = new ImageIcon(this.getClass().getResource("/profileicon.png"));
				btnProfile = new JButton(Profilelogo);
				btnProfile.setBounds(0, 126, 77, 65);
				panelmenus.add(btnProfile);
				
				
				//Connection Icon
				final ImageIcon Connectionlogo;
				Connectionlogo = new ImageIcon(this.getClass().getResource("/Connection.png"));
				btnConnections = new JButton(Connectionlogo);
				btnConnections.setBounds(0, 249, 77, 65);
				panelmenus.add(btnConnections);
				
				
				//Home Icon
				final ImageIcon Homelogo;
				Homelogo = new ImageIcon(this.getClass().getResource("/Home button.png"));
				btnHome = new JButton(Homelogo);
				
				
				btnHome.setBounds(0, 22, 77, 65);
				panelmenus.add(btnHome);
				
				
				//Search Panel
				panelsearch.setBackground(Color.BLACK);
				panelsearch.setBounds(618, 133, 93, 314);
				SearchPanel.add(panelsearch);
				panelsearch.setLayout(null);
				
				
				//Notification Button
				final ImageIcon Notificationlogo;
				Notificationlogo = new ImageIcon(this.getClass().getResource("/Notification button.png"));
				btnNotification = new JButton(Notificationlogo);
				btnNotification.setBounds(22, 11, 72, 67);
				panelsearch.add(btnNotification);
				
				
				//Search Button
				final ImageIcon Searchlogo;
				Searchlogo = new ImageIcon(this.getClass().getResource("/Searchicon.png"));
				btnSearch = new JButton(Searchlogo);
				btnSearch.setBounds(23, 234, 71, 69);
				panelsearch.add(btnSearch);
				
				
				
				//Message button
				final ImageIcon messagelogo;
				messagelogo = new ImageIcon(this.getClass().getResource("/messagebutton.png"));
				button = new JButton(messagelogo);
				button.setBounds(22, 122, 72, 67);
				panelsearch.add(button);
				
				
				
				//display Search
				JLabel lbls1 = new JLabel("");
				lbls1.setBackground(new Color(0, 0, 0));
				lbls1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lbls1.setForeground(new Color(255, 255, 255));
				lbls1.setBounds(108, 242, 170, 20);
				SearchPanel.add(lbls1);
				
				
				//Label Search
				JLabel lblSearch = new JLabel("Search");
				lblSearch.setFont(new Font("moonhouse", Font.PLAIN, 27));
				lblSearch.setForeground(new Color(30, 144, 255));
				lblSearch.setBounds(285, 156, 130, 28);
				SearchPanel.add(lblSearch);
				
				
				//Search Text field
				//textFieldSearch = new JTextField();
				textFieldSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
				textFieldSearch.setForeground(new Color(255, 255, 255));
				textFieldSearch.setBackground(new Color(128, 128, 128));
				textFieldSearch.setBounds(226, 195, 170, 20);
				SearchPanel.add(textFieldSearch);
				textFieldSearch.setColumns(10);
				
				
				
				btnSearch_1.setBackground(new Color(128, 128, 128));
				btnSearch_1.setBounds(399, 195, 89, 23);
				SearchPanel.add(btnSearch_1);
				
				
					
					getContentPane().add(textFieldSearch);
					getContentPane().add(btnSearch_1);
					getContentPane().add(lbls1);
					
					JLabel label = new JLabel("");
					label.setBounds(251, 271, 46, 14);
					SearchPanel.add(label);
					
					JLabel lbls2 = new JLabel("New label");
					lbls2.setBounds(108, 273, 170, 20);
					SearchPanel.add(lbls2);
					
					JLabel lbls3 = new JLabel("New label");
					lbls3.setBounds(108, 297, 170, 20);
					SearchPanel.add(lbls3);
					
					JLabel lbls4 = new JLabel("New label");
					lbls4.setBounds(108, 322, 170, 20);
					SearchPanel.add(lbls4);
					
					JLabel lbls5 = new JLabel("New label");
					lbls5.setBounds(108, 356, 170, 20);
					SearchPanel.add(lbls5);
					
					JLabel lbls6 = new JLabel("New label");
					lbls6.setBounds(108, 394, 170, 20);
					SearchPanel.add(lbls6);
					
					JLabel lbls7 = new JLabel("New label");
					lbls7.setBounds(343, 242, 170, 20);
					SearchPanel.add(lbls7);
					
					JLabel lbls8 = new JLabel("New label");
					lbls8.setBounds(343, 276, 170, 20);
					SearchPanel.add(lbls8);
					
					JLabel lbls9 = new JLabel("New label");
					lbls9.setBounds(343, 311, 170, 20);
					SearchPanel.add(lbls9);
					
					JLabel lbls10 = new JLabel("New label");
					lbls10.setBounds(343, 345, 170, 20);
					SearchPanel.add(lbls10);
					
					JLabel lbls11 = new JLabel("New label");
					lbls11.setBounds(343, 378, 170, 20);
					SearchPanel.add(lbls11);
					
					JLabel lbls12 = new JLabel("New label");
					lbls12.setBounds(343, 409, 170, 20);
					SearchPanel.add(lbls12);
					
		
		}
		
		//SQL
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/connectus";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";

	   //creating Connection Statement 
	   
	   private static Connection conn = null;
	   

		public static Connection getConnection() throws SQLException, ClassNotFoundException
		{
			if(conn != null)
				return conn;
			else
			{
				try{
					   //STEP 2: Register JDBC driver
					   Class.forName("com.mysql.jdbc.Driver");

					   //STEP 3: Open a connection
					   System.out.println("Connecting to database...(ConnectUS Database)");
			//		   conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL,USER,PASS);
					   
					   return conn;
				}
				finally
				{}
			}
		}
		
		//Method to close the Connection
		public static void closeConnection() throws SQLException
		{
			try
			{
				if(conn != null)
					conn.close();
			}
			finally
			{}
		}
		//Getter for Rollnumber to search from
	
	public String getrollsearchframe()
	{
		return textFieldSearch.getText();
	}
	}