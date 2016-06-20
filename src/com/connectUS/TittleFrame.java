package com.connectUS;
import com.GUI.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.GUI.DevelopersFrame;
//import com.GUI.FrameAnswer;
import com.GUI.FrameConnection;
import com.GUI.FrameMessenger;
import com.GUI.FrameNewsfeed;
import com.GUI.FrameProfile;
import com.GUI.FrameProfileDisplay;
import com.GUI.Framecontactus;
import com.GUI.Framefeedback;
import com.GUI.Framenotificationsdisplay;
import com.GUI.LoginError;
import com.GUI.PasswordError;
import com.GUI.searchframe;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TittleFrame extends JFrame 
{
	public FrameNewsfeed NF = new FrameNewsfeed();
    public FrameProfile FP = new FrameProfile();
    public FrameProfileDisplay FPD = new FrameProfileDisplay();
    public DevelopersFrame DF = new DevelopersFrame();
    public Framecontactus FC = new Framecontactus();
    public searchframe SF = new searchframe();
    public Framefeedback FFB = new Framefeedback();
    public PasswordError PE = new PasswordError();//copy
    public LoginError LE = new LoginError();//copy
    public FrameAbout FA = new FrameAbout();
    public FrameGuidelines FG = new FrameGuidelines();
    public FrameMyquestions FMQ = new FrameMyquestions();
    //Copy here
    public FrameMessenger FM = new FrameMessenger();
    public Framenotificationsdisplay FN = new Framenotificationsdisplay();
    public FrameConnection FC1 = new FrameConnection();
    public Frameviewandgiveanswer FVA = new Frameviewandgiveanswer();
    public FrameQuestions FQ = new FrameQuestions();
    //Tittle Frame
    public JPanel TittlePanel = new JPanel();
    public JTextField txtroll = new JTextField();;
    public JPasswordField logpass = new JPasswordField();
    public JButton btnDevelopers = new JButton();
    public JButton btnContactus = new JButton();
    public JLabel lblBottomlogos = new JLabel("bottomlogos");
    public JLabel lblAustrip = new JLabel("");
    public JPanel panel = new JPanel();
    public JLabel label_2 = new JLabel("Connect");
    public JLabel label_3 = new JLabel("US");
    

    FrameNewsfeed  news =new FrameNewsfeed();
    JPanel LoginPanel = new JPanel();
    JLabel lblRollNo = new JLabel("Roll No. :");
    public JLabel lblConnect = new JLabel("Connect");
    public JButton btnConnect = new JButton("");
    JLabel lblPassword = new JLabel("Password :");
    JPanel Npanel = new JPanel();
    JLabel lblUs = new JLabel("US");
    JLabel label = new JLabel("");
    JLabel label_1 = new JLabel("");
    private final JPanel BottomPanel = new JPanel();
    final JLabel lblAbout = new JLabel("About");
    final JLabel label_4 = new JLabel("________________________________________________________________________________________________________________________________________________________________________________________");
    final JLabel lblMobile = new JLabel("Mobile");
    public JLabel lblFeedback = new JLabel("FeedBack");
    public final JLabel lblDevelopers = new JLabel("Developers");
    final JLabel lblGuidelines = new JLabel("Guidelines");
    final JLabel lblReportAbuse = new JLabel("Report Abuse");
    final JLabel lblHelpCentre = new JLabel("Help Centre");
    public JLabel lblContactUs = new JLabel("Contact Us");
    final JLabel lblConnectUsAn = new JLabel("Connect Us- An Ahemadabad University Network");
    final JLabel lblAulogo = new JLabel("");
    final JLabel lblNewLabel = new JLabel("\u00A9 2016 Ahmedabad University, All rights reserved.");
    //Till here
    
    //Frame
    public TittleFrame() 
    {
    	 dataActionListener listener  = new dataActionListener(this);
    	 dataMouseListener mouse_Listener  = new dataMouseListener(this);
    	 
            this.setTitle("Home-Connect US");
            this.setFont(new Font("moonhouse", Font.PLAIN, 15));
            this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\connectus.png"));
            this.setBounds(0,0, 1399, 777);
            
            
            TittlePanel.setBackground(new Color(0, 0, 0));
            TittlePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            this.setContentPane(TittlePanel);   
            TittlePanel.setLayout(null);

            //Login Panel
            
            LoginPanel.setBounds(475, 346, 419, 126);
            LoginPanel.setBackground(new Color(0, 0, 0));
            TittlePanel.add(LoginPanel);
            LoginPanel.setLayout(null);

            //Roll No label
            
		lblRollNo.setForeground(new Color(30, 144, 255));
		lblRollNo.setBounds(117, 0, 89, 44);
		lblRollNo.setFont(new Font("moonhouse", Font.PLAIN, 18));
		LoginPanel.add(lblRollNo);
		
		//Roll No textfield
		 
		txtroll.setBackground(new Color(192, 192, 192));
		txtroll.setBounds(209, 10, 116, 22);
		txtroll.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		LoginPanel.add(txtroll);
		txtroll.setColumns(10);
		
		//Password Label
		
		lblPassword.setForeground(new Color(30, 144, 255));
		lblPassword.setFont(new Font("moonhouse", Font.PLAIN, 18));
		lblPassword.setBounds(85, 43, 144, 14);
		LoginPanel.add(lblPassword);
		 
		//Password Field
		
		logpass.setBackground(new Color(192, 192, 192));
		logpass.setBounds(209, 43, 116, 20);
		LoginPanel.add(logpass);
		
		//Connect button
		
		final ImageIcon btnConnectlogo;
		btnConnectlogo = new ImageIcon(this.getClass().getResource("/button-connect.png"));
		btnConnect = new JButton(btnConnectlogo);
		/*btnConnect.addKeyListener(new KeyAdapter() { 
			@Override
			public void keyPressed(KeyEvent arg0) {
				FrameNewsfeed NF = new FrameNewsfeed();
				NF.setVisible(true);
				//TittleFrame.setvisible(dispose);
			}
		});*/
		
		btnConnect.setBounds(154, 73, 116, 22);
		LoginPanel.add(btnConnect);
		
		
		//Name Panel
		Npanel.setBounds(475, 231, 419, 111);
		TittlePanel.add(Npanel);
		Npanel.setBackground(new Color(0, 0, 0));
		Npanel.setLayout(null);
		final ImageIcon TittleLogo;
		TittleLogo = new ImageIcon(this.getClass().getResource("/Main window logo.png"));
		label = new JLabel(TittleLogo);
		
		
		label.setBounds(159, 0, 100, 54);
		Npanel.add(label);
		
		//Connect us name Labels
		
		lblConnect.setBounds(119, 48, 140, 28);
		lblConnect.setFont(new Font("moonhouse", Font.PLAIN, 28));
		lblConnect.setForeground(new Color(30, 144, 255));
		Npanel.add(lblConnect);
		
		//JLabel lblUs = new JLabel("US");
		lblUs.setBounds(258, 51, 39, 24);
		lblUs.setFont(new Font("moonhouse", Font.PLAIN, 24));
		lblUs.setForeground(new Color(0, 255, 0));
		Npanel.add(lblUs);
		
		
		
		
         getContentPane().add(LoginPanel);
         getContentPane().add(Npanel);
         
         JLabel lblBeta = new JLabel("Beta");
         lblBeta.setForeground(new Color(30, 144, 255));
         lblBeta.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblBeta.setBounds(295, 74, 112, 24);
         Npanel.add(lblBeta);
         BottomPanel.setBackground(Color.BLACK);
         BottomPanel.setBounds(0, 610, 1372, 138);
         
         TittlePanel.add(BottomPanel);
         BottomPanel.setLayout(null);
         lblAbout.setForeground(new Color(255, 255, 255));
         lblAbout.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblAbout.setBounds(125, 44, 79, 24);
         
         BottomPanel.add(lblAbout);
         label_4.setForeground(new Color(105, 105, 105));
         label_4.setBounds(117, 63, 1130, 14);
         
         BottomPanel.add(label_4);
         lblMobile.setForeground(Color.WHITE);
         lblMobile.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblMobile.setBounds(243, 44, 79, 24);
         
         BottomPanel.add(lblMobile);
         lblFeedback.setForeground(Color.WHITE);
         lblFeedback.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblFeedback.setBounds(356, 44, 112, 24);
         
         BottomPanel.add(lblFeedback);
         lblDevelopers.setForeground(Color.WHITE);
         lblDevelopers.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblDevelopers.setBounds(495, 44, 112, 24);
         
         BottomPanel.add(lblDevelopers);
         lblGuidelines.setForeground(Color.WHITE);
         lblGuidelines.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblGuidelines.setBounds(652, 44, 112, 24);
         
         BottomPanel.add(lblGuidelines);
         lblReportAbuse.setForeground(Color.WHITE);
         lblReportAbuse.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblReportAbuse.setBounds(792, 44, 112, 24);
         
         BottomPanel.add(lblReportAbuse);
         lblHelpCentre.setForeground(Color.WHITE);
         lblHelpCentre.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblHelpCentre.setBounds(1115, 44, 112, 24);
         
         BottomPanel.add(lblHelpCentre);
         lblContactUs.setForeground(Color.WHITE);
         lblContactUs.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
         lblContactUs.setBounds(956, 44, 112, 24);
         
         BottomPanel.add(lblContactUs);
         lblConnectUsAn.setFont(new Font("Champagne & Limousines", Font.PLAIN, 22));
         lblConnectUsAn.setForeground(new Color(105, 105, 105));
         lblConnectUsAn.setBounds(505, 88, 422, 24);
         
         BottomPanel.add(lblConnectUsAn);
         lblNewLabel.setForeground(new Color(128, 128, 128));
         lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
         lblNewLabel.setBounds(548, 113, 383, 25);
         
         BottomPanel.add(lblNewLabel);
         lblAulogo.setIcon(new ImageIcon("au-logo-color.png"));
         lblAulogo.setBounds(488, 24, 398, 126);
         
         TittlePanel.add(lblAulogo);
         
         
         //Developers button
         final ImageIcon Developersbutton;
         Developersbutton = new ImageIcon(this.getClass().getResource("/Developers.jpg"));
         
         //Contact us button
         final ImageIcon Connectus;
         Connectus = new ImageIcon(this.getClass().getResource("/contact.jpg"));
         
         
         //Austrip logo
         
         final ImageIcon lblAUstrip;
         lblAUstrip = new ImageIcon(this.getClass().getResource("/Austrip.jpg"));
         
         
         //copy 
         //Bottom logos
         
         final ImageIcon lbllogosc;
         lbllogosc = new ImageIcon(this.getClass().getResource("/Bottom Pannel.png"));
         
         
         	btnConnect.addActionListener(listener);
         	lblDevelopers.addMouseListener(mouse_Listener);
         	lblContactUs.addMouseListener(mouse_Listener);
         	lblFeedback.addMouseListener(mouse_Listener);
         	lblAbout.addMouseListener(mouse_Listener);
         	lblGuidelines.addMouseListener(mouse_Listener);
         	//lbl
            //NewsFeed
            NF.setVisible(false);
           //NF.lbl
            //NF.btnPost.addActionListener(listener);
            
            //NF.lb
            
            NF.btnConnections.addActionListener(listener);
            NF.btnNotification.addActionListener(listener);
            NF.btnPost.addActionListener(listener);
            NF.button.addActionListener(listener);
            NF.lblProfile.addMouseListener(mouse_Listener);
            NF.lblLogout.addMouseListener(mouse_Listener);
            NF.lblHome.addMouseListener(mouse_Listener);
            NF.lblViewQuestions.addMouseListener(mouse_Listener);
            NF.lblMyQuestions.addMouseListener(mouse_Listener);
            //Frame Profile
            FP.setVisible(false);
            FP.lblHome.addMouseListener(mouse_Listener);
            FP.BtnSave.addActionListener(listener);
            FP.lblViewDetails.addMouseListener(mouse_Listener);
            FP.lblLogout.addMouseListener(mouse_Listener);
            FP.lblProfile.addMouseListener(mouse_Listener);
            //Frame Profile Display
            FPD.setVisible(false);
            FPD.btnedit.addActionListener(listener);
            FPD.btnHome.addActionListener(listener);
            FPD.btnSearch.addActionListener(listener);
            FPD.button.addActionListener(listener);
            FPD.lblHome.addMouseListener(mouse_Listener);
            FPD.lblProfile.addMouseListener(mouse_Listener);
            FPD.lblLogout.addMouseListener(mouse_Listener);
            
            FQ.setVisible(false);
            FQ.lblHome.addMouseListener(mouse_Listener);
            FQ.lblLogout.addMouseListener(mouse_Listener);
            FQ.lblProfile.addMouseListener(mouse_Listener);
            FQ.table_1.addMouseListener(mouse_Listener);
            FQ.table_2.addMouseListener(mouse_Listener);
            FQ.table_3.addMouseListener(mouse_Listener);
            FQ.table_4.addMouseListener(mouse_Listener);
            FQ.table_5.addMouseListener(mouse_Listener);
            FQ.table_6.addMouseListener(mouse_Listener);
            FQ.table_7.addMouseListener(mouse_Listener);
            FQ.table_8.addMouseListener(mouse_Listener);
            FQ.table_9.addMouseListener(mouse_Listener);
            FQ.table.addMouseListener(mouse_Listener);
            
            FVA.setVisible(false);
            FVA.label_1.addMouseListener(mouse_Listener);
            FVA.label_5.addMouseListener(mouse_Listener);
            FVA.label_11.addMouseListener(mouse_Listener);
            FVA.btnNewButton.addActionListener(listener);
            //FVA.tbl
            
            //Developers frame
            DF.setVisible(false);
            DF.lblBackToConnect.addMouseListener(mouse_Listener);
            //DF.btnBh.addActionListener(listener);
           
            FMQ.setVisible(false);
            FMQ.lblHome.addMouseListener(mouse_Listener);
            FMQ.lblLogout.addMouseListener(mouse_Listener);
            FMQ.lblProfile.addMouseListener(mouse_Listener);
            FMQ.table_1.addMouseListener(mouse_Listener);
            FMQ.table_2.addMouseListener(mouse_Listener);
            FMQ.table_3.addMouseListener(mouse_Listener);
            FMQ.table_4.addMouseListener(mouse_Listener);
            FMQ.table_5.addMouseListener(mouse_Listener);
            FMQ.table_6.addMouseListener(mouse_Listener);
            FMQ.table_7.addMouseListener(mouse_Listener);
            FMQ.table_8.addMouseListener(mouse_Listener);
            FMQ.table_9.addMouseListener(mouse_Listener);
            FMQ.table.addMouseListener(mouse_Listener);
            
            //Frame ContactUs
            FC.setVisible(false);
            FC.button_1.addActionListener(listener);
            FC.btnFeedback.addActionListener(listener);
            FC.btnMail.addActionListener(listener);
            FC.btncall.addActionListener(listener);
            
            FA.setVisible(false);
            FA.label.addMouseListener(mouse_Listener);
            
            FG.setVisible(false);
            FG.label.addMouseListener(mouse_Listener);
            //Search Frame
            SF.setVisible(false);
            
            //copy
            //FrameFeedback 
            FFB.setVisible(false);
            FFB.btnPost.addActionListener(listener);
            //till here
            
            //Password 
            PE.setVisible(false);
            //Login Error
            LE.setVisible(false);
            //FrameAnswer 
            FA.setVisible(false);
          //  FA.btnSaveFile.addActionListener(listener);
            
            //Copy here
            //Framve Messenger
            FM.setVisible(false);
            FM.btnConnections.addActionListener(listener);
            FM.btnHome.addActionListener(listener);
            FM.btnNotification.addActionListener(listener);
            FM.btnProfile.addActionListener(listener);
            FM.btnSearch.addActionListener(listener);
            FM.btnClickHereTo.addActionListener(listener);
            SF.setVisible(false);
            //Frame COnnection
            FC1.setVisible(false);
            
            //Frame Notification
            FN.setVisible(false);
           

	}



    public String getRollno() {
		return txtroll.getText();
		
	}

	public void setRollno(JTextField rollno) {
		this.txtroll = rollno;
	}

	//Below is the Only 1 getter for Search Frame
	public String getRollnoSrc() {
		return SF.getrollsearchframe();
		
	}
	
	public String getPassword() {
		return logpass.getText();
	}

	public void setPassword(JPasswordField password) {
		this.logpass = password;
	}

	//Making Getters and Setter for Entry Query From the Class FRAME PROFILE
	
	public String GETname(){
		return FP.getNameframe();
	}
	
	public String GETcity(){
		return FP.getCityframe();
	}
	
	public String GETedu(){
		return FP.geteduframe();
	}
	
	public String GEThome(){
		return FP.gethomeframe();
	}
	public String GETsex(){
		return FP.getsexframe();
	}
	public String GETdob(){
		return FP.getdobframe();
	}
	public String GETskils(){
		return FP.getskillsframe();
	}
	public String GETph(){
		return FP.getphframe();
	}
	public String GETexp(){
		return FP.getexpframe();
	}
}