package com.GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameNewsfeed extends JFrame
{
	public JLabel lblLogout = new JLabel("Logout");
	
        JFrame News = new JFrame();
        JPanel PanelNF  = new JPanel();;
        JLabel lblLogo = new JLabel("");
	JLabel lblConnect1 = new JLabel("Connect");
	JLabel lblUs1 = new JLabel("US");
	public JButton btnProfile = new JButton("");
	public JButton btnConnections = new JButton("");
	JButton btnHome = new JButton("");
	public JButton btnNotification = new JButton("");
	public JButton btnSearch = new JButton("");
	public JButton button = new JButton("");
        JPanel HeadPanel = new JPanel();
        JLabel lblAu = new JLabel("");
        JLabel labelforusername = new JLabel("");
        JLabel lblIet = new JLabel("");
        private final JPanel SidePanel = new JPanel();
        private final JLabel lblHomelogo = new JLabel("");
        public JLabel lblHome = new JLabel("Home");
        private final JLabel lblsearchlogo = new JLabel("");
        public JLabel lblSearch = new JLabel("Search");
        private final JLabel lblProfilelogo = new JLabel("");
        public JLabel lblProfile = new JLabel("Profile");
        private final JLabel lblTerms = new JLabel("Terms & Conditions");
        public JLabel lblHelp = new JLabel("Help");
        private final JLabel lblAboutAhmedabadUniversity = new JLabel("About Ahmedabad University");
        private final JLabel label = new JLabel("_________________________");
        public JLabel lblMyQuestions = new JLabel("My Questions");
        public JLabel lblViewQuestions = new JLabel("View Questions");
        public final JLabel label_1 = new JLabel("_________________________");
        private final JPanel HomePanel = new JPanel();
        public  TextArea PostDoubtTextarea = new TextArea();
        private final JLabel label_2 = new JLabel("Post your doubts here!");
        public JButton btnPost = new JButton("Post");
        public final JComboBox comboBoxField = new JComboBox();
		
        
	//Frame
	public FrameNewsfeed() 
	{
		setTitle("NewsFeed-Connect US");
		setIconImage(Toolkit.getDefaultToolkit().getImage("connectus.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		
                
		PanelNF.setBackground(Color.BLACK);
		setContentPane(PanelNF);
		PanelNF.setLayout(null);
		HeadPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
	
		//Tittle Panel
		
		HeadPanel.setBackground(Color.BLACK);
		HeadPanel.setBounds(0, 0, 1362, 145);
		PanelNF.add(HeadPanel);
		HeadPanel.setLayout(null);
		lblLogo.setIcon(new ImageIcon("Main window logo.png"));
		
		//Logo Tittle
		
		lblLogo.setBackground(Color.BLACK);
		
		final ImageIcon TittleLogo;
		//TittleLogo = new ImageIcon(this.getClass().getResource("Main window logo.png"));
		
		//Name Label
		
		lblConnect1.setFont(new Font("moonhouse", Font.PLAIN, 32));
		lblConnect1.setForeground(new Color(30, 144, 255));
		lblConnect1.setBounds(563, 73, 167, 47);
		HeadPanel.add(lblConnect1);
		
		
		lblUs1.setFont(new Font("moonhouse", Font.PLAIN, 32));
		lblUs1.setForeground(new Color(0, 255, 0));
		lblUs1.setBounds(724, 86, 73, 20);
		HeadPanel.add(lblUs1);
		
		
		
		lblLogo.setBounds(601, 11, 147, 83);
		HeadPanel.add(lblLogo);
		
		//Label where User name is to be handled
		
		labelforusername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelforusername.setBounds(626, 84, 64, 14);
		HeadPanel.add(labelforusername);
		/*btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				FrameProfile P = new FrameProfile();
				P.setVisible(true);
				
			}
		});*/
		
		
                
                getContentPane().add(HeadPanel);
        		SidePanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
        		SidePanel.setBackground(new Color(0, 0, 0));
        		SidePanel.setBounds(0, 144, 186, 594);
        		
        		PanelNF.add(SidePanel);
        		SidePanel.setLayout(null);
        		lblHomelogo.setIcon(new ImageIcon("NF.jpg"));
        		lblHomelogo.setBounds(0, 99, 70, 63);
        		
        		SidePanel.add(lblHomelogo);
        		lblHome.setForeground(new Color(30, 144, 255));
        		lblHome.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
        		lblHome.setBounds(80, 117, 70, 33);
        		
        		SidePanel.add(lblHome);
        		lblsearchlogo.setIcon(new ImageIcon("SCH.jpg"));
        		lblsearchlogo.setBounds(0, 43, 70, 63);
        		
        		SidePanel.add(lblsearchlogo);
        		lblSearch.setForeground(new Color(30, 144, 255));
        		lblSearch.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
        		lblSearch.setBounds(80, 58, 70, 33);
        		
        		SidePanel.add(lblSearch);
        		lblProfilelogo.setIcon(new ImageIcon("PF.jpg"));
        		lblProfilelogo.setBounds(0, 155, 70, 63);
        		
        		SidePanel.add(lblProfilelogo);
        		/*lblProfile.addMouseListener(new MouseAdapter() {
        			@Override
        			
        			public void mouseClicked(MouseEvent arg0) {
        				FrameProfile FP1 = new FrameProfile();
            			FP1.setVisible(true);
        			}
        		});*/
        		lblProfile.setForeground(new Color(30, 144, 255));
        		lblProfile.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
        		lblProfile.setBounds(80, 173, 70, 33);
        		
        		SidePanel.add(lblProfile);
        		lblTerms.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
        		lblTerms.setForeground(new Color(255, 255, 255));
        		lblTerms.setBounds(41, 534, 116, 14);
        		
        		SidePanel.add(lblTerms);
        		lblHelp.setForeground(Color.WHITE);
        		lblHelp.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
        		lblHelp.setBounds(80, 508, 35, 27);
        		
        		SidePanel.add(lblHelp);
        		lblAboutAhmedabadUniversity.setForeground(Color.WHITE);
        		lblAboutAhmedabadUniversity.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
        		lblAboutAhmedabadUniversity.setBounds(10, 549, 166, 22);
        		
        		SidePanel.add(lblAboutAhmedabadUniversity);
        		label.setForeground(new Color(105, 105, 105));
        		label.setBounds(10, 217, 166, 14);
        		
        		SidePanel.add(label);
        		lblMyQuestions.setForeground(new Color(30, 144, 255));
        		lblMyQuestions.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
        		lblMyQuestions.setBounds(34, 242, 123, 33);
        		
        		SidePanel.add(lblMyQuestions);
        		lblViewQuestions.setForeground(new Color(30, 144, 255));
        		lblViewQuestions.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
        		lblViewQuestions.setBounds(29, 286, 132, 33);
        		
        		SidePanel.add(lblViewQuestions);
        		label_1.setForeground(SystemColor.controlDkShadow);
        		label_1.setBounds(10, 483, 166, 14);
        		
        		SidePanel.add(label_1);
        		
        		lblLogout.setForeground(new Color(30, 144, 255));
        		lblLogout.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
        		lblLogout.setBounds(54, 455, 132, 33);
        		SidePanel.add(lblLogout);
        		HomePanel.setBackground(Color.BLACK);
        		HomePanel.setBounds(186, 156, 1176, 571);
        		
        		PanelNF.add(HomePanel);
        		HomePanel.setLayout(null);
        		PostDoubtTextarea.setBounds(95, 72, 912, 180);
        		HomePanel.add(PostDoubtTextarea);
        		PostDoubtTextarea.setForeground(Color.BLACK);
        		PostDoubtTextarea.setFont(new Font("Arial", Font.PLAIN, 14));
        		PostDoubtTextarea.setBackground(new Color(220, 220, 220));
        		label_2.setForeground(Color.WHITE);
        		label_2.setFont(new Font("Champagne & Limousines", Font.PLAIN, 29));
        		label_2.setBounds(377, 11, 293, 31);
        		
        		HomePanel.add(label_2);
        		btnPost.setForeground(Color.BLACK);
        		btnPost.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
        		btnPost.setBackground(Color.WHITE);
        		btnPost.setBounds(918, 264, 89, 23);
        		
        		HomePanel.add(btnPost);
        		comboBoxField.setModel(new DefaultComboBoxModel(new String[] {"ICT", "Mech. Engg.", "Chem. Engg.","Architecture","Design","Computer Science","Festivals & Events","Entrepreneurship & Startups", "Accounts & Commerce","Management"}));
        		comboBoxField.setForeground(Color.BLACK);
        		comboBoxField.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        		comboBoxField.setBackground(Color.WHITE);
        		comboBoxField.setBounds(95, 266, 293, 31);
        		
        		HomePanel.add(comboBoxField);
        		
        }
}