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
import javax.swing.border.BevelBorder;
import javax.swing.Icon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class FrameProfileDisplay extends JFrame 
{
	public JButton btnedit = new JButton("Edit Details");
	
	private JPanel panelProfile= new JPanel();
	JLabel lblLogo = new JLabel("");
	JLabel lblAu = new JLabel("");
	JLabel lblIet = new JLabel("");
	JButton btnProfile = new JButton("");
	public JLabel labelnamedisplay = new JLabel("");
	public JLabel lblDisplaysex = new JLabel("");
	
	
	final ImageIcon Profilelogo;
	public JButton btnConnections = new JButton("");
	public JButton btnHome = new JButton("");
	public JButton btnNotification = new JButton("");
	public JButton btnSearch = new JButton("");
	public JButton button = new JButton("");
	public JLabel labeleducationdetails = new JLabel("");
	
	JLabel lblMyProfile = new JLabel("MY PROFILE");
	private final JPanel panel = new JPanel();
	private final JLabel label = new JLabel("Connect");
	private final JLabel label_1 = new JLabel("US");
	private final JLabel label_2 = new JLabel(new ImageIcon("Main window logo.png"));
	private final JLabel label_3 = new JLabel("");
	private final JPanel panel_1 = new JPanel();
	private final JLabel label_4 = new JLabel("");
	public JLabel lblHome = new JLabel("Home");
	private final JLabel label_6 = new JLabel("");
	public JLabel lblSearch = new JLabel("Search");
	private final JLabel label_8 = new JLabel("");
	public JLabel lblProfile = new JLabel("Profile");
	private final JLabel label_10 = new JLabel("Terms & Conditions");
	public JLabel label_11 = new JLabel("Help");
	private final JLabel label_12 = new JLabel("About Ahmedabad University");
	private final JLabel label_13 = new JLabel("_________________________");
	private final JLabel label_15 = new JLabel("_________________________");
	public JLabel lblLogout = new JLabel("Logout");
	public final JLabel lblDisplaycc = new JLabel("");
	public final JLabel lblDisplathometown = new JLabel("");
	public final JLabel labeldisplayskills = new JLabel("");
	public final JLabel lblDisplayea = new JLabel("");
	public final JLabel lblDisplayDOB = new JLabel("");
	public JLabel lblContactdissplay = new JLabel("");
	private final JLabel lblAllTheAbove = new JLabel("*All the above Details are just for Administration. No other student has access to your personal info.");
	
	

	
	public FrameProfileDisplay()
	{
		setTitle("Profile-Connect Us");
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Connect US GUI\\Icons\\connectus.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		panelProfile.setBackground(Color.BLACK);
		panelProfile.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelProfile);
		panelProfile.setLayout(null);
				
				
				//Logo Tittle
				
				lblLogo.setBackground(Color.BLACK);
				final ImageIcon TittleLogo;
				TittleLogo = new ImageIcon(this.getClass().getResource("/Main window logo.png"));
				
				
				//AU logo Label
				
				final ImageIcon AUCorner;
				AUCorner = new ImageIcon(this.getClass().getResource("/aucorner.png"));
				
				
				//Logged into IET Logo
				
				final ImageIcon logiet;
				logiet = new ImageIcon(this.getClass().getResource("/logged into iet.png"));
				
				
				//Profile Icon
				
				
				Profilelogo = new ImageIcon(this.getClass().getResource("/profileicon.png"));
				
				
				//Connection Icon
				
				final ImageIcon Connectionlogo;
				Connectionlogo = new ImageIcon(this.getClass().getResource("/Connection.png"));
				
				
				//Home Icon
				
				final ImageIcon Homelogo;
				Homelogo = new ImageIcon(this.getClass().getResource("/Home button.png"));
				
				
				//Notification Button
				
				final ImageIcon Notificationlogo;
				Notificationlogo = new ImageIcon(this.getClass().getResource("/Notification button.png"));
				
				
				//Search Button
				
				final ImageIcon Searchlogo;
				Searchlogo = new ImageIcon(this.getClass().getResource("/Searchicon.png"));
				
				
				
				//Message button
				
				final ImageIcon messagelogo;
				messagelogo = new ImageIcon(this.getClass().getResource("/messagebutton.png"));
				panel.setLayout(null);
				panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
				panel.setBackground(Color.BLACK);
				panel.setBounds(0, 0, 1362, 145);
				
				panelProfile.add(panel);
				label.setForeground(new Color(30, 144, 255));
				labelnamedisplay.setForeground(Color.cyan);
				label.setFont(new Font("moonhouse", Font.PLAIN, 32));
				label.setBounds(563, 73, 167, 47);
				
				panel.add(label);
				label_1.setForeground(Color.GREEN);
				label_1.setFont(new Font("moonhouse", Font.PLAIN, 32));
				label_1.setBounds(724, 86, 73, 20);
				
				panel.add(label_1);
				label_2.setBounds(589, 11, 147, 83);
				
				panel.add(label_2);
				label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				label_3.setBounds(626, 84, 64, 14);
				
				panel.add(label_3);
				panel_1.setLayout(null);
				panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
				panel_1.setBackground(Color.BLACK);
				panel_1.setBounds(0, 144, 186, 594);
				
				panelProfile.add(panel_1);
				label_4.setIcon(new ImageIcon("NF.jpg"));
				label_4.setBounds(0, 99, 70, 63);
				
				panel_1.add(label_4);
				lblHome.setForeground(new Color(30, 144, 255));
				lblHome.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblHome.setBounds(80, 117, 70, 33);
				
				panel_1.add(lblHome);
				label_6.setIcon(new ImageIcon("SCH.jpg"));
				label_6.setBounds(0, 43, 70, 63);
				
				panel_1.add(label_6);
				lblSearch.setForeground(new Color(30, 144, 255));
				lblSearch.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblSearch.setBounds(80, 58, 70, 33);
				
				panel_1.add(lblSearch);
				label_8.setIcon(new ImageIcon("PF.jpg"));
				label_8.setBounds(0, 155, 70, 63);
				
				panel_1.add(label_8);
				lblProfile.setForeground(new Color(30, 144, 255));
				lblProfile.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblProfile.setBounds(80, 173, 70, 33);
				
				panel_1.add(lblProfile);
				label_10.setForeground(Color.WHITE);
				label_10.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				label_10.setBounds(41, 534, 116, 14);
				
				panel_1.add(label_10);
				label_11.setForeground(Color.WHITE);
				label_11.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				label_11.setBounds(80, 508, 35, 27);
				
				panel_1.add(label_11);
				label_12.setForeground(Color.WHITE);
				label_12.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				label_12.setBounds(10, 549, 166, 22);
				
				panel_1.add(label_12);
				label_13.setForeground(SystemColor.controlDkShadow);
				label_13.setBounds(10, 217, 166, 14);
				
				panel_1.add(label_13);
				label_15.setForeground(SystemColor.controlDkShadow);
				label_15.setBounds(10, 483, 166, 14);
				
				panel_1.add(label_15);
				lblLogout.setForeground(new Color(30, 144, 255));
				lblLogout.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblLogout.setBounds(57, 454, 70, 33);
				
				panel_1.add(lblLogout);
				
				JPanel ProfilePanel = new JPanel();
				ProfilePanel.setBackground(Color.BLACK);
				ProfilePanel.setBounds(188, 147, 1174, 591);
				panelProfile.add(ProfilePanel);
				ProfilePanel.setLayout(null);
				lblMyProfile.setBounds(386, 11, 265, 54);
				ProfilePanel.add(lblMyProfile);
				
				
				//Profile Label
				
				lblMyProfile.setFont(new Font("moonhouse", Font.PLAIN, 28));
				lblMyProfile.setForeground(new Color(30, 144, 255));
				
				btnedit.setForeground(Color.BLACK);
				btnedit.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				btnedit.setBackground(Color.WHITE);
				btnedit.setBounds(961, 66, 119, 33);
				ProfilePanel.add(btnedit);
				
				JLabel label_5 = new JLabel("Name ");
				label_5.setForeground(Color.WHITE);
				label_5.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_5.setBounds(392, 131, 65, 27);
				ProfilePanel.add(label_5);
				
				JLabel label_7 = new JLabel("College");
				label_7.setForeground(Color.WHITE);
				label_7.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_7.setBounds(392, 164, 65, 34);
				ProfilePanel.add(label_7);
				
				JLabel label_9 = new JLabel("D. O. B. ");
				label_9.setForeground(Color.WHITE);
				label_9.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_9.setBounds(392, 217, 65, 14);
				ProfilePanel.add(label_9);
				
				JLabel label_16 = new JLabel("Current City ");
				label_16.setForeground(Color.WHITE);
				label_16.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_16.setBounds(675, 255, 99, 19);
				ProfilePanel.add(label_16);
				
				JLabel label_17 = new JLabel("Sex ");
				label_17.setForeground(Color.WHITE);
				label_17.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_17.setBounds(675, 211, 40, 27);
				ProfilePanel.add(label_17);
				
				JLabel label_18 = new JLabel("Home Town ");
				label_18.setForeground(Color.WHITE);
				label_18.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_18.setBounds(392, 251, 94, 14);
				ProfilePanel.add(label_18);
				
				JLabel label_19 = new JLabel("Contact No. ");
				label_19.setForeground(Color.WHITE);
				label_19.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_19.setBounds(242, 221, 101, 14);
				ProfilePanel.add(label_19);
				
				JLabel label_20 = new JLabel("Areas of Interest");
				label_20.setForeground(Color.WHITE);
				label_20.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_20.setBounds(392, 293, 126, 14);
				ProfilePanel.add(label_20);
				
				JLabel label_21 = new JLabel("Experiences & Achievements");
				label_21.setForeground(Color.WHITE);
				label_21.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_21.setBounds(675, 293, 208, 14);
				ProfilePanel.add(label_21);
				
				JLabel label_22 = new JLabel("");
				label_22.setIcon(new ImageIcon("profileicon.png"));
				label_22.setBounds(232, 107, 134, 120);
				ProfilePanel.add(label_22);
				
				labelnamedisplay.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				labelnamedisplay.setBounds(467, 121, 325, 33);
				ProfilePanel.add(labelnamedisplay);
				labeleducationdetails.setForeground(Color.CYAN);
				
				labeleducationdetails.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				labeleducationdetails.setBounds(467, 165, 325, 33);
				ProfilePanel.add(labeleducationdetails);
				lblDisplaysex.setForeground(Color.CYAN);
				
				lblDisplaysex.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblDisplaysex.setBounds(710, 205, 113, 33);
				ProfilePanel.add(lblDisplaysex);
				lblDisplaycc.setForeground(Color.CYAN);
				lblDisplaycc.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblDisplaycc.setBounds(769, 241, 225, 33);
				
				ProfilePanel.add(lblDisplaycc);
				lblDisplathometown.setForeground(Color.CYAN);
				lblDisplathometown.setVerticalAlignment(SwingConstants.BOTTOM);
				lblDisplathometown.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblDisplathometown.setBounds(477, 232, 185, 33);
				
				ProfilePanel.add(lblDisplathometown);
				labeldisplayskills.setForeground(Color.CYAN);
				labeldisplayskills.setVerticalAlignment(SwingConstants.TOP);
				labeldisplayskills.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				labeldisplayskills.setBounds(392, 318, 270, 172);
				
				ProfilePanel.add(labeldisplayskills);
				lblDisplayea.setForeground(Color.CYAN);
				lblDisplayea.setVerticalAlignment(SwingConstants.TOP);
				lblDisplayea.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblDisplayea.setBounds(675, 318, 270, 172);
				
				ProfilePanel.add(lblDisplayea);
				lblDisplayDOB.setForeground(Color.CYAN);
				lblDisplayDOB.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblDisplayDOB.setBounds(467, 205, 113, 33);
				
				ProfilePanel.add(lblDisplayDOB);
				lblContactdissplay.setForeground(Color.CYAN);
				lblContactdissplay.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblContactdissplay.setBounds(206, 246, 160, 33);
				
				ProfilePanel.add(lblContactdissplay);
				lblAllTheAbove.setForeground(Color.RED);
				lblAllTheAbove.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				lblAllTheAbove.setBounds(232, 546, 875, 34);
				
				ProfilePanel.add(lblAllTheAbove);
	}
}
