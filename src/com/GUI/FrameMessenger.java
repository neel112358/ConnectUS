package com.GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;

public class FrameMessenger extends JFrame 
{

	JPanel panelProfile = new JPanel();

	JPanel paneltt = new JPanel();
	JLabel lblLogo = new JLabel("");
	JLabel lblConnect = new JLabel("Connect");
	JLabel lblIet = new JLabel("");
	JPanel panelmenus = new JPanel();
	JLabel lblLoggedIn = new JLabel("Logged In as:");
	JLabel lblUs = new JLabel("US");
	JLabel lblAu = new JLabel("");
	JLabel labelforusername = new JLabel("");
	public JButton btnProfile = new JButton("");
	public JButton btnConnections = new JButton("");
	public JButton btnHome = new JButton("");
	JPanel panelsearch = new JPanel();
	public JButton btnNotification = new JButton("");
	public JButton btnSearch = new JButton("");
	public JButton button = new JButton("");
	JLabel lblProfile = new JLabel("Messenger");
	private final JLabel lblWeDoNot = new JLabel("We do not have a own built messenger right now");
	private final JLabel lblTheWorkIs = new JLabel("The work is under progress");
	private final JLabel lblButYouCan = new JLabel("But you can use an external application at the moment");
        public JButton btnClickHereTo = new JButton("Click here to use ways2sms");
	
	
	public FrameMessenger() 
	{
		setTitle("Messenger-Connect Us");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Connect US GUI\\Icons\\connectus.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 492);
		panelProfile.setBackground(Color.BLACK);
		panelProfile.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelProfile);
		panelProfile.setLayout(null);
		
		//Tittle Panel
				paneltt.setBackground(Color.BLACK);
				paneltt.setBounds(0, 0, 711, 145);
				panelProfile.add(paneltt);
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
				panelProfile.add(panelmenus);
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
				
				
				btnHome.setBounds(0, 11, 77, 65);
				panelmenus.add(btnHome);
								
				
				//Search Panel
				panelsearch.setBackground(Color.BLACK);
				panelsearch.setBounds(618, 133, 93, 314);
				panelProfile.add(panelsearch);
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
				
				
				//Profile Label
				lblProfile.setFont(new Font("moonhouse", Font.PLAIN, 28));
				lblProfile.setForeground(new Color(30, 144, 255));
				lblProfile.setBounds(258, 146, 222, 54);
				panelProfile.add(lblProfile);
				lblWeDoNot.setForeground(new Color(255, 255, 255));
				lblWeDoNot.setFont(new Font("Times New Roman", Font.PLAIN, 17));
				lblWeDoNot.setBounds(192, 221, 431, 40);
				
				panelProfile.add(lblWeDoNot);
				lblTheWorkIs.setForeground(new Color(255, 255, 255));
				lblTheWorkIs.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				lblTheWorkIs.setBounds(268, 254, 222, 40);
				
				panelProfile.add(lblTheWorkIs);
				lblButYouCan.setForeground(new Color(255, 255, 255));
				lblButYouCan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				lblButYouCan.setBounds(193, 298, 336, 40);
				
				panelProfile.add(lblButYouCan);
				btnClickHereTo.setBounds(276, 349, 169, 23);
				
				panelProfile.add(btnClickHereTo);
				
	}
}