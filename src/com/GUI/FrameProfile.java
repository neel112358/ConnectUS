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
import javax.swing.border.BevelBorder;
import javax.swing.Icon;
import java.awt.SystemColor;
import java.awt.TextField;

public class FrameProfile extends JFrame 
{

	JPanel panelProfile = new JPanel();
	JLabel lblLogo = new JLabel("");
	JLabel lblIet = new JLabel("");
	JLabel lblAu = new JLabel("");
	JButton btnProfile = new JButton("");
	public JButton btnConnections = new JButton("");
	public JButton btnHome = new JButton("");
	public JButton btnNotification = new JButton("");
	public JButton btnSearch = new JButton("");
	public JButton button = new JButton("");
	public JButton BtnSave = new JButton("Save Details");
	public JLabel lblLogout = new JLabel("Logout");
	JPanel ProfilePanel = new JPanel();
	JLabel label_14 = new JLabel("MY PROFILE");
	JLabel label_15 = new JLabel("Name ");
	JLabel label_17 = new JLabel("College");
	JLabel label_18 = new JLabel("Current City ");
	JLabel label_19 = new JLabel("Home Town ");
	JLabel label_20 = new JLabel("D. O. B. ");
	JLabel label_21 = new JLabel("Sex ");
	JLabel label_23 = new JLabel("Experiences & Achievements");
	JLabel label_22 = new JLabel("Areas of Interest");
	JLabel label_24 = new JLabel("Contact No. ");
	
	
	public JDateChooser dateChooser = new JDateChooser();
	private final JPanel HeadPanel = new JPanel();
	private final JLabel label = new JLabel("Connect");
	private final JLabel label_1 = new JLabel("US");
	private final JLabel label_2 = new JLabel(new ImageIcon("Main window logo.png"));
	private final JLabel label_3 = new JLabel("");
	private final JPanel SidePanel = new JPanel();
	private final JLabel label_4 = new JLabel("");
	public JLabel lblHome = new JLabel("Home");
	private final JLabel label_6 = new JLabel("");
	public JLabel lblSearch = new JLabel("Search");
	public JLabel label_8 = new JLabel("");
	public JLabel lblProfile = new JLabel("Profile");
	private final JLabel lblterms = new JLabel("Terms & Conditions");
	private final JLabel lblhelp = new JLabel("Help");
	public JLabel lblauinfo = new JLabel("About Ahmedabad University");
	private final JLabel label_13 = new JLabel("_________________________");
	public JLabel lblViewDetails = new JLabel("View Details");
	private final JLabel label_16 = new JLabel("_________________________");
	public JTextField NameTxtbox = new JTextField();
	public JTextField Collegetxtbox = new JTextField();
	public JTextField CurrentCityTxtbox = new JTextField();
	public JComboBox comboBoxSex = new JComboBox();
	public JTextArea InterestTextarea = new JTextArea();
	
	public JTextField HTTextbox = new JTextField();
	
	public JTextField ExpTxtbox = new JTextField();
	
	public JTextField CNumTextbox = new JTextField();
	//MouseListener listener = new Mo
	
	
	public FrameProfile() 
	{
		setTitle("Profile-Connect Us");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("connectus.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		panelProfile.setBackground(Color.BLACK);
		panelProfile.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelProfile);
		panelProfile.setLayout(null);
				
				
								HeadPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
				HeadPanel.setBackground(Color.BLACK);
				HeadPanel.setBounds(0, 0, 1362, 145);
				
				panelProfile.add(HeadPanel);
				label.setForeground(new Color(30, 144, 255));
				label.setFont(new Font("moonhouse", Font.PLAIN, 32));
				label.setBounds(563, 73, 167, 47);
				
				HeadPanel.add(label);
				label_1.setForeground(Color.GREEN);
				label_1.setFont(new Font("moonhouse", Font.PLAIN, 32));
				label_1.setBounds(724, 86, 73, 20);
				
				HeadPanel.add(label_1);
				label_2.setBounds(601, 11, 147, 83);
				
				HeadPanel.add(label_2);
				label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				label_3.setBounds(626, 84, 64, 14);
				
				HeadPanel.add(label_3);
				SidePanel.setLayout(null);
				SidePanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
				SidePanel.setBackground(Color.BLACK);
				SidePanel.setBounds(0, 144, 186, 594);
				
				panelProfile.add(SidePanel);
				label_4.setIcon(new ImageIcon("NF.jpg"));
				label_4.setBounds(0, 99, 70, 63);
				
				SidePanel.add(label_4);
				lblHome.setForeground(new Color(30, 144, 255));
				lblHome.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblHome.setBounds(80, 117, 70, 33);
				
				SidePanel.add(lblHome);
				label_6.setIcon(new ImageIcon("SCH.jpg"));
				label_6.setBounds(0, 43, 70, 63);
				
				SidePanel.add(label_6);
				lblSearch.setForeground(new Color(30, 144, 255));
				lblSearch.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblSearch.setBounds(80, 58, 70, 33);
				
				SidePanel.add(lblSearch);
				label_8.setIcon(new ImageIcon("PF.jpg"));
				label_8.setBounds(0, 155, 70, 63);
				
				SidePanel.add(label_8);
				lblProfile.setForeground(new Color(30, 144, 255));
				lblProfile.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblProfile.setBounds(80, 173, 70, 33);
				
				SidePanel.add(lblProfile);
				lblterms.setForeground(Color.WHITE);
				lblterms.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				lblterms.setBounds(41, 534, 116, 14);
				
				SidePanel.add(lblterms);
				lblhelp.setForeground(Color.WHITE);
				lblhelp.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				lblhelp.setBounds(80, 508, 35, 27);
				
				SidePanel.add(lblhelp);
				lblauinfo.setForeground(Color.WHITE);
				lblauinfo.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
				lblauinfo.setBounds(10, 549, 166, 22);
				
				SidePanel.add(lblauinfo);
				label_13.setForeground(SystemColor.controlDkShadow);
				label_13.setBounds(10, 217, 166, 14);
				
				SidePanel.add(label_13);
				lblViewDetails.setForeground(new Color(30, 144, 255));
				lblViewDetails.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblViewDetails.setBounds(34, 242, 123, 33);
				
				SidePanel.add(lblViewDetails);
				label_16.setForeground(SystemColor.controlDkShadow);
				label_16.setBounds(10, 483, 166, 14);
				
				SidePanel.add(label_16);
				
				lblLogout.setForeground(new Color(30, 144, 255));
				lblLogout.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
				lblLogout.setBounds(57, 454, 70, 33);
				SidePanel.add(lblLogout);
				
				
				
				ProfilePanel.setBackground(Color.BLACK);
				ProfilePanel.setBounds(186, 144, 1176, 594);
				panelProfile.add(ProfilePanel);
				ProfilePanel.setLayout(null);
				
				label_14.setForeground(new Color(30, 144, 255));
				label_14.setFont(new Font("moonhouse", Font.PLAIN, 28));
				label_14.setBounds(380, 25, 249, 54);
				ProfilePanel.add(label_14);
				
				label_15.setForeground(Color.WHITE);
				label_15.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_15.setBounds(397, 106, 56, 14);
				ProfilePanel.add(label_15);
				
				NameTxtbox.setForeground(Color.WHITE);
				NameTxtbox.setColumns(10);
				NameTxtbox.setBackground(Color.GRAY);
				NameTxtbox.setBounds(453, 106, 126, 20);
				ProfilePanel.add(NameTxtbox);
				
				label_17.setForeground(Color.WHITE);
				label_17.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_17.setBounds(378, 131, 65, 34);
				ProfilePanel.add(label_17);
				
				Collegetxtbox.setForeground(Color.WHITE);
				Collegetxtbox.setColumns(10);
				Collegetxtbox.setBackground(Color.GRAY);
				Collegetxtbox.setBounds(453, 137, 126, 20);
				ProfilePanel.add(Collegetxtbox);
				
				label_18.setForeground(Color.WHITE);
				label_18.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_18.setBounds(352, 200, 99, 19);
				ProfilePanel.add(label_18);
				
				CurrentCityTxtbox.setForeground(Color.WHITE);
				CurrentCityTxtbox.setColumns(10);
				CurrentCityTxtbox.setBackground(Color.GRAY);
				CurrentCityTxtbox.setBounds(453, 199, 86, 20);
				ProfilePanel.add(CurrentCityTxtbox);
				
				label_19.setForeground(Color.WHITE);
				label_19.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_19.setBounds(359, 274, 94, 14);
				ProfilePanel.add(label_19);
				
				HTTextbox.setForeground(Color.WHITE);
				HTTextbox.setColumns(10);
				HTTextbox.setBackground(Color.GRAY);
				HTTextbox.setBounds(453, 274, 86, 20);
				ProfilePanel.add(HTTextbox);
				
				label_20.setForeground(Color.WHITE);
				label_20.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_20.setBounds(388, 175, 65, 14);
				ProfilePanel.add(label_20);
				
				label_21.setForeground(Color.WHITE);
				label_21.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_21.setBounds(413, 230, 40, 27);
				ProfilePanel.add(label_21);
				
				comboBoxSex.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
				comboBoxSex.setBackground(Color.GRAY);
				comboBoxSex.setBounds(453, 237, 86, 20);
				ProfilePanel.add(comboBoxSex);
				
				label_22.setForeground(Color.WHITE);
				label_22.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_22.setBounds(324, 342, 126, 14);
				ProfilePanel.add(label_22);
				
				InterestTextarea.setForeground(Color.WHITE);
				InterestTextarea.setBackground(Color.GRAY);
				InterestTextarea.setBounds(453, 340, 137, 43);
				ProfilePanel.add(InterestTextarea);
				
				label_23.setForeground(Color.WHITE);
				label_23.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_23.setBounds(233, 395, 208, 14);
				ProfilePanel.add(label_23);
				
				ExpTxtbox.setForeground(Color.WHITE);
				ExpTxtbox.setFont(new Font("Tahoma", Font.PLAIN, 14));
				ExpTxtbox.setColumns(10);
				ExpTxtbox.setBackground(Color.GRAY);
				ExpTxtbox.setBounds(453, 394, 249, 43);
				ProfilePanel.add(ExpTxtbox);
				
				label_24.setForeground(Color.WHITE);
				label_24.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
				label_24.setBounds(352, 309, 101, 14);
				ProfilePanel.add(label_24);
				
				CNumTextbox.setForeground(Color.WHITE);
				CNumTextbox.setColumns(10);
				CNumTextbox.setBackground(Color.GRAY);
				CNumTextbox.setBounds(453, 309, 120, 20);
				ProfilePanel.add(CNumTextbox);
				
				BtnSave.setForeground(Color.BLACK);
				BtnSave.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				BtnSave.setBackground(Color.WHITE);
				BtnSave.setBounds(397, 468, 126, 20);
				ProfilePanel.add(BtnSave);
				dateChooser.setBounds(453, 168, 126, 20);
				ProfilePanel.add(dateChooser);
				
	}

	

	public String getNameframe()
	{
		return NameTxtbox.getText();
	}
	
	public void setNameframe(String name)
	{
		NameTxtbox.setText(name);
	}
	
	public String getCityframe()
	{
		return CurrentCityTxtbox.getText();
	}
	
	public void setCityframe(String name)
	{
		CurrentCityTxtbox.setText(name);
	}
	
	public String geteduframe()
	{
		return Collegetxtbox.getText();
	}
	
	public void seteduframe(String name)
	{
		Collegetxtbox.setText(name);
	}
	
	public String gethomeframe()
	{
		return HTTextbox.getText();
	}
	
	public void sethomeframe(String name)
	{
		HTTextbox.setText(name);
	}
	
	public String getsexframe()
	{
		return (String) comboBoxSex.getSelectedItem();
	}
	/*
	public void setsexframe(char name)
	{
		textFieldedu.setText(name);
	}
	*/
	
	public String getdobframe()
	{	
		String date  = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		return date;
	}
	
	public void setdobframe(String name)
	{
		((JTextField)dateChooser.getDateEditor().getUiComponent()).setText(name);
		
	}
	
	public String getskillsframe()
	{
		return InterestTextarea.getText();
				
	}
	
	public void setskillsframe(String name)
	{
		InterestTextarea.setText(name);
	}
	
	public String getphframe()
	{
		return CNumTextbox.getText();
	}
	
	public void setphframe(String name)
	{
		CNumTextbox.setText(name);
	}
	
	public String getexpframe()
	{
		return ExpTxtbox.getText();
				
	}
	
	public void setexpframe(String name)
	{
		ExpTxtbox.setText(name);
	}
	
}
