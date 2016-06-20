import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame
{
	public static void main(String[] args) {
	}
}

class FrameProfile extends JFrame {

	private JPanel panelProfile;
	private JTextField textFieldname;
	private JTextField textFieldedu;
	private JTextField textFieldcc;
	private JTextField textFieldht;
	private JTextField Achievementstext;
	private JTextField textno;

	
	


	
	public FrameProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 492);
		panelProfile = new JPanel();
		panelProfile.setBackground(Color.BLACK);
		panelProfile.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelProfile);
		panelProfile.setLayout(null);
		
		//Tittle Panel
				JPanel paneltt = new JPanel();
				paneltt.setBackground(Color.BLACK);
				paneltt.setBounds(0, 0, 711, 145);
				panelProfile.add(paneltt);
				paneltt.setLayout(null);
				
				
				//Logo Tittle
				JLabel lblLogo = new JLabel("");
				lblLogo.setBackground(Color.BLACK);
				lblLogo.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Main window logo.png"));
				lblLogo.setBounds(280, 3, 147, 83);
				paneltt.add(lblLogo);
				
				
				//Name Label
				JLabel lblConnect = new JLabel("Connect");
				lblConnect.setFont(new Font("moonhouse", Font.PLAIN, 28));
				lblConnect.setForeground(new Color(30, 144, 255));
				lblConnect.setBounds(247, 65, 140, 47);
				paneltt.add(lblConnect);
				
				JLabel lblUs = new JLabel("US");
				lblUs.setFont(new Font("moonhouse", Font.PLAIN, 24));
				lblUs.setForeground(new Color(0, 255, 0));
				lblUs.setBounds(391, 82, 46, 14);
				paneltt.add(lblUs);
				
				
				//AU logo Label
				JLabel lblAu = new JLabel("");
				lblAu.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\aucorner.png"));
				lblAu.setBounds(10, 3, 108, 65);
				paneltt.add(lblAu);
				
				
				//Logged into IET Logo
				JLabel lblIet = new JLabel("");
				lblIet.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\logged into iet.png"));
				lblIet.setBounds(604, 11, 97, 57);
				paneltt.add(lblIet);
				
				JLabel lblLoggedIn = new JLabel("Logged In as:");
				lblLoggedIn.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
				lblLoggedIn.setForeground(new Color(30, 144, 255));
				lblLoggedIn.setBounds(626, 65, 64, 24);
				paneltt.add(lblLoggedIn);
				
				//Label where User name is to be handled
				JLabel labelforusername = new JLabel("");
				labelforusername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				labelforusername.setBounds(626, 84, 64, 14);
				paneltt.add(labelforusername);
				
				
				//Menus Panel
				JPanel panelmenus = new JPanel();
				panelmenus.setBackground(new Color(0, 0, 0));
				panelmenus.setBounds(0, 133, 98, 314);
				panelProfile.add(panelmenus);
				panelmenus.setLayout(null);
				
				
				//Profile Icon
				JButton btnProfile = new JButton("");
				btnProfile.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\profileicon.png"));
				btnProfile.setBounds(0, 126, 77, 65);
				panelmenus.add(btnProfile);
				
				
				//Connection Icon
				JButton btnConnections = new JButton("");
				btnConnections.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Connection.png"));
				btnConnections.setBounds(0, 249, 77, 65);
				panelmenus.add(btnConnections);
				
				
				//Home Icon
				JButton btnHome = new JButton("");
				btnHome.setBounds(0, 11, 77, 65);
				panelmenus.add(btnHome);
				btnHome.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Home button.png"));
				btnHome.setSelectedIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Home button.png"));
				
				
				
				//Search Panel
				JPanel panelsearch = new JPanel();
				panelsearch.setBackground(Color.BLACK);
				panelsearch.setBounds(618, 133, 93, 314);
				panelProfile.add(panelsearch);
				panelsearch.setLayout(null);
				
				
				//Notification Button
				JButton btnNotification = new JButton("");
				btnNotification.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Notification button.png"));
				btnNotification.setBounds(22, 11, 72, 67);
				panelsearch.add(btnNotification);
				
				
				//Search Button
				JButton btnSearch = new JButton("");
				btnSearch.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Searchicon.png"));
				btnSearch.setBounds(23, 234, 71, 69);
				panelsearch.add(btnSearch);
				
				
				
				//Message button
				JButton button = new JButton("");
				button.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\messagebutton.png"));
				button.setBounds(22, 122, 72, 67);
				panelsearch.add(button);
				
				
				//Profile Label
				JLabel lblProfile = new JLabel("PROFILE");
				lblProfile.setFont(new Font("moonhouse", Font.PLAIN, 28));
				lblProfile.setForeground(new Color(30, 144, 255));
				lblProfile.setBounds(271, 147, 170, 54);
				panelProfile.add(lblProfile);
				
				
				
				//Label Name
				JLabel lblName = new JLabel("Name :");
				lblName.setForeground(new Color(255, 255, 255));
				lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblName.setBounds(121, 213, 46, 14);
				panelProfile.add(lblName);
				
				
				//Name Text field
				textFieldname = new JTextField();
				textFieldname.setForeground(new Color(255, 255, 255));
				textFieldname.setBackground(new Color(128, 128, 128));
				textFieldname.setBounds(203, 212, 126, 20);
				panelProfile.add(textFieldname);
				textFieldname.setColumns(10);
				
				
				
				//Label Education
				JLabel lblEducation = new JLabel("Education :");
				lblEducation.setForeground(new Color(255, 255, 255));
				lblEducation.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblEducation.setBounds(121, 252, 70, 14);
				panelProfile.add(lblEducation);
				
				
				
				//Education Textfield
				textFieldedu = new JTextField();
				textFieldedu.setForeground(new Color(255, 255, 255));
				textFieldedu.setBackground(new Color(128, 128, 128));
				textFieldedu.setBounds(203, 251, 126, 20);
				panelProfile.add(textFieldedu);
				textFieldedu.setColumns(10);
				
				
				//Label current city
				JLabel lblCurrentCity = new JLabel("Current City :");
				lblCurrentCity.setForeground(new Color(255, 255, 255));
				lblCurrentCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCurrentCity.setBounds(376, 212, 84, 14);
				panelProfile.add(lblCurrentCity);
				
				
				
				//Current city Textfield
				textFieldcc = new JTextField();
				textFieldcc.setBackground(new Color(128, 128, 128));
				textFieldcc.setForeground(new Color(255, 255, 255));
				textFieldcc.setBounds(470, 207, 86, 20);
				panelProfile.add(textFieldcc);
				textFieldcc.setColumns(10);
				
				
				
				//Label hometown
				JLabel lblHomeTown = new JLabel("Home Town :");
				lblHomeTown.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblHomeTown.setForeground(new Color(255, 255, 255));
				lblHomeTown.setBounds(376, 254, 84, 14);
				panelProfile.add(lblHomeTown);
				
				
				//Hometown textfield
				textFieldht = new JTextField();
				textFieldht.setBackground(new Color(128, 128, 128));
				textFieldht.setForeground(new Color(255, 255, 255));
				textFieldht.setBounds(470, 251, 86, 20);
				panelProfile.add(textFieldht);
				textFieldht.setColumns(10);
				
				
				//DOB Label
				JLabel lblDOB = new JLabel("D. O. B. :");
				lblDOB.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblDOB.setForeground(new Color(255, 255, 255));
				lblDOB.setBounds(121, 292, 70, 14);
				panelProfile.add(lblDOB);
				
				
				//Date ComboBoxes
				JComboBox comboBoxdate = new JComboBox();
				comboBoxdate.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
				comboBoxdate.setMaximumRowCount(31);
				comboBoxdate.setBackground(new Color(128, 128, 128));
				comboBoxdate.setBounds(203, 291, 37, 20);
				panelProfile.add(comboBoxdate);
				
				JComboBox comboBoxmonth = new JComboBox();
				comboBoxmonth.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
				comboBoxmonth.setBackground(new Color(128, 128, 128));
				comboBoxmonth.setBounds(241, 291, 70, 20);
				panelProfile.add(comboBoxmonth);
				
				JComboBox comboBoxyear = new JComboBox();
				comboBoxyear.setBackground(new Color(128, 128, 128));
				comboBoxyear.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"}));
				comboBoxyear.setBounds(311, 291, 56, 20);
				panelProfile.add(comboBoxyear);
				
				
				//Sex label
				JLabel lblSex = new JLabel("Sex :");
				lblSex.setForeground(new Color(255, 255, 255));
				lblSex.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblSex.setBounds(421, 292, 46, 14);
				panelProfile.add(lblSex);
				
				
				
				//Sex combobox
				JComboBox comboBoxsex = new JComboBox();
				comboBoxsex.setBackground(new Color(128, 128, 128));
				comboBoxsex.setModel(new DefaultComboBoxModel(new String[] {"----Select----", "Male", "Female", "Other"}));
				comboBoxsex.setBounds(470, 291, 86, 20);
				panelProfile.add(comboBoxsex);
				
				
				
				//Skills Label
				JLabel lblSkills = new JLabel("Skills:");
				lblSkills.setForeground(new Color(255, 255, 255));
				lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblSkills.setBounds(121, 333, 46, 14);
				panelProfile.add(lblSkills);
				
				
				
				//Text area for skills
				JTextArea skillstext = new JTextArea();
				skillstext.setForeground(new Color(255, 255, 255));
				skillstext.setBackground(new Color(128, 128, 128));
				skillstext.setBounds(203, 330, 137, 43);
				panelProfile.add(skillstext);
				
				
				
				//Label Experiences and achievement
				JLabel lblExperiencesAndAchievements = new JLabel("Experiences & Achievements:");
				lblExperiencesAndAchievements.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblExperiencesAndAchievements.setForeground(new Color(255, 255, 255));
				lblExperiencesAndAchievements.setBounds(121, 411, 208, 14);
				panelProfile.add(lblExperiencesAndAchievements);
				
				
				
				//Achievement Textfield
				Achievementstext = new JTextField();
				Achievementstext.setForeground(new Color(255, 255, 255));
				Achievementstext.setFont(new Font("Tahoma", Font.PLAIN, 14));
				Achievementstext.setBackground(new Color(128, 128, 128));
				Achievementstext.setBounds(307, 383, 249, 43);
				panelProfile.add(Achievementstext);
				Achievementstext.setColumns(10);
				
				
				
				//Contact no label
				JLabel lblContactNo = new JLabel("Contact No. :");
				lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblContactNo.setForeground(new Color(255, 255, 255));
				lblContactNo.setBounds(376, 333, 84, 14);
				panelProfile.add(lblContactNo);
				
				
				
				//Textfield Contact no
				textno = new JTextField();
				textno.setForeground(new Color(255, 255, 255));
				textno.setBackground(new Color(128, 128, 128));
				textno.setBounds(470, 332, 120, 20);
				panelProfile.add(textno);
				textno.setColumns(10);
	}
}



class FrameNewsfeed extends JFrame {

	private JPanel PanelNF;

	
	

	//Frame
	public FrameNewsfeed() {
		setTitle("NewsFeed-Connect US");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\connectus.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 486);
		PanelNF = new JPanel();
		PanelNF.setBackground(Color.BLACK);
		PanelNF.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelNF);
		PanelNF.setLayout(null);
	
		
		
		//Tittle Panel
		JPanel paneltt = new JPanel();
		paneltt.setBackground(Color.BLACK);
		paneltt.setBounds(0, 0, 711, 145);
		PanelNF.add(paneltt);
		paneltt.setLayout(null);
		
		
		//Logo Tittle
		JLabel lblLogo = new JLabel("");
		lblLogo.setBackground(Color.BLACK);
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Main window logo.png"));
		lblLogo.setBounds(280, 3, 147, 83);
		paneltt.add(lblLogo);
		
		
		//Name Label
		JLabel lblConnect = new JLabel("Connect");
		lblConnect.setFont(new Font("moonhouse", Font.PLAIN, 28));
		lblConnect.setForeground(new Color(30, 144, 255));
		lblConnect.setBounds(247, 65, 140, 47);
		paneltt.add(lblConnect);
		
		JLabel lblUs = new JLabel("US");
		lblUs.setFont(new Font("moonhouse", Font.PLAIN, 24));
		lblUs.setForeground(new Color(0, 255, 0));
		lblUs.setBounds(391, 82, 46, 14);
		paneltt.add(lblUs);
		
		
		//AU logo Label
		JLabel lblAu = new JLabel("");
		lblAu.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\aucorner.png"));
		lblAu.setBounds(10, 3, 108, 65);
		paneltt.add(lblAu);
		
		
		//Logged into IET Logo
		JLabel lblIet = new JLabel("");
		lblIet.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\logged into iet.png"));
		lblIet.setBounds(604, 11, 97, 57);
		paneltt.add(lblIet);
		
		JLabel lblLoggedIn = new JLabel("Logged In as:");
		lblLoggedIn.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		lblLoggedIn.setForeground(new Color(30, 144, 255));
		lblLoggedIn.setBounds(626, 65, 64, 24);
		paneltt.add(lblLoggedIn);
		
		//Label where User name is to be handled
		JLabel labelforusername = new JLabel("");
		labelforusername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelforusername.setBounds(626, 84, 64, 14);
		paneltt.add(labelforusername);
		
		
		//Menus Panel
		JPanel panelmenus = new JPanel();
		panelmenus.setBackground(new Color(0, 0, 0));
		panelmenus.setBounds(0, 133, 98, 314);
		PanelNF.add(panelmenus);
		panelmenus.setLayout(null);
		
		
		//Profile Icon
		JButton btnProfile = new JButton("");
		btnProfile.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\profileicon.png"));
		btnProfile.setBounds(0, 126, 77, 65);
		panelmenus.add(btnProfile);
		
		
		//Connection Icon
		JButton btnConnections = new JButton("");
		btnConnections.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Connection.png"));
		btnConnections.setBounds(0, 249, 77, 65);
		panelmenus.add(btnConnections);
		
		
		//Home Icon
		JButton btnHome = new JButton("");
		btnHome.setBounds(0, 11, 77, 65);
		panelmenus.add(btnHome);
		btnHome.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Home button.png"));
		btnHome.setSelectedIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Home button.png"));
		
		
		
		//Search Panel
		JPanel panelsearch = new JPanel();
		panelsearch.setBackground(Color.BLACK);
		panelsearch.setBounds(618, 133, 93, 314);
		PanelNF.add(panelsearch);
		panelsearch.setLayout(null);
		
		
		//Notification Button
		JButton btnNotification = new JButton("");
		btnNotification.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Notification button.png"));
		btnNotification.setBounds(22, 11, 72, 67);
		panelsearch.add(btnNotification);
		
		
		//Search Button
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\Searchicon.png"));
		btnSearch.setBounds(23, 234, 71, 69);
		panelsearch.add(btnSearch);
		
		
		
		//Message button
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\Assignments\\OOP\\ConnectUS\\src\\messagebutton.png"));
		button.setBounds(22, 122, 72, 67);
		panelsearch.add(button);
		
		
		//Doubts Label
		JLabel lblWhatWouldYou = new JLabel("Post your doubts here!");
		lblWhatWouldYou.setFont(new Font("Century", Font.PLAIN, 17));
		lblWhatWouldYou.setForeground(Color.WHITE);
		lblWhatWouldYou.setBounds(241, 144, 293, 31);
		PanelNF.add(lblWhatWouldYou);
		
		
		//Question text area
		JTextArea saytextArea = new JTextArea();
		saytextArea.setBackground(Color.DARK_GRAY);
		saytextArea.setForeground(Color.WHITE);
		saytextArea.setBounds(128, 188, 422, 71);
		PanelNF.add(saytextArea);
		
		
		
		
		//Post question button
		JButton btnPost = new JButton("Post");
		btnPost.setFont(new Font("Century", Font.PLAIN, 14));
		btnPost.setForeground(new Color(255, 255, 255));
		btnPost.setBackground(new Color(105, 105, 105));
		btnPost.setBounds(460, 263, 89, 23);
		PanelNF.add(btnPost);
		
		
		
		
		//Course ComboBox
		JComboBox coursecomboBox = new JComboBox();
		coursecomboBox.setForeground(new Color(255, 255, 255));
		coursecomboBox.setModel(new DefaultComboBoxModel(new String[] {"Related To", "", "Engineering", "Science & Technoogy", "Design", "Management", "Life Science", "Computer Applications", "Commerce"}));
		coursecomboBox.setBackground(new Color(105, 105, 105));
		coursecomboBox.setFont(new Font("Century", Font.PLAIN, 11));
		coursecomboBox.setBounds(128, 265, 169, 23);
		PanelNF.add(coursecomboBox);
		
		
		//News feeds post to be managed here
		JLabel labelnewsfeeds = new JLabel("");
		labelnewsfeeds.setBounds(125, 305, 465, 131);
		PanelNF.add(labelnewsfeeds);
	}
}

