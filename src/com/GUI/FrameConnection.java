package com.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class FrameConnection extends JFrame {

	private JPanel ConnectPanel;
JPanel paneltt = new JPanel();
		
	JLabel lblLogo = new JLabel("");
		JLabel lblConnect = new JLabel("Connect");
		JLabel lblUs = new JLabel("US");
		JLabel lblAu = new JLabel("");
		JLabel lblIet = new JLabel("");
		JLabel lblLoggedIn = new JLabel("Logged In as:");
		JLabel labelforusername = new JLabel("");
		JLabel lblConnections = new JLabel("Connections");
		JLabel labelshowreq = new JLabel("");
		JLabel lblFriendRequests = new JLabel("Friend Requests");
		public JButton button = new JButton("");
		public JButton btnProfile = new JButton("");
		public JButton btnSearch = new JButton("");
		JPanel panelsearch = new JPanel();
		public JButton btnHome = new JButton("");
		JPanel panelmenus = new JPanel();
		JButton btnConnections = new JButton("");
		public JButton btnNotification = new JButton("");
	
                
                public FrameConnection() 
                {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 493);
		ConnectPanel = new JPanel();
		ConnectPanel.setBackground(Color.BLACK);
		ConnectPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		ConnectPanel.setLayout(null);
		
		
		//Tittle Panel
		paneltt.setBackground(Color.BLACK);
		paneltt.setBounds(0, 0, 711, 145);
		ConnectPanel.add(paneltt);
		paneltt.setLayout(null);
		
		
		//Logo Tittle
		lblLogo.setBackground(Color.BLACK);
		final ImageIcon TittleLogo;
		TittleLogo = new ImageIcon(this.getClass().getResource("/Main window logo.png"));
		lblLogo = new JLabel(TittleLogo);
		lblLogo.setBounds(262, 6, 147, 83);
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
		ConnectPanel.add(panelmenus);
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
		ConnectPanel.add(panelsearch);
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
		
		
		
		
		setContentPane(ConnectPanel);
		
		lblConnections.setForeground(new Color(30, 144, 255));
		lblConnections.setFont(new Font("moonhouse", Font.PLAIN, 28));
		lblConnections.setBounds(238, 145, 212, 40);
		ConnectPanel.add(lblConnections);
		
		lblFriendRequests.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFriendRequests.setForeground(new Color(255, 255, 255));
		lblFriendRequests.setBounds(461, 204, 112, 21);
		ConnectPanel.add(lblFriendRequests);
		
		labelshowreq.setBounds(461, 230, 112, 200);
		ConnectPanel.add(labelshowreq);
	}
}