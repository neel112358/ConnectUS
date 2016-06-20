package com.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Frameviewandgiveanswer extends JFrame {
	
	public JButton btnNewButton = new JButton("Answer");
	
	private JPanel answerpanel;
	public JTable table;
	public JLabel label_5 = new JLabel("Profile");
	public JLabel label_1 = new JLabel("Home");
	public JLabel label_11 = new JLabel("Logout");
	public JLabel lblQuestiondisplay = new JLabel("");
	public JLabel lblQuestiontype = new JLabel("");
	public TextArea textArea;
	public static String value,tab;
	public  String getvalue() {
		return value;
	}
	public void setvalue(String value) {
		this.value = value;
	}
	
	public  String gettab() {
		if(tab.equals("Mech. Engg."))
			tab="MechEngg";
		else if(tab.equals("ICT"))
			tab="ICT";
		else if(tab.equals("Chem. Engg."))
			tab="ChemEngg";
		else if(tab.equals("Management"))
			tab="Management";
		else if(tab.equals("Accounts & Commerce"))
			tab="Accounts";
		else if(tab.equals("Festivals & Events"))
			tab="Festivals";
		else if(tab.equals("Computer Science"))
			tab="CS";
		else if(tab.equals("Design"))
			tab="Design";
		else if(tab.equals("Entrepreneurship & Startups"))
			tab="Entrepreneurship";
		else if(tab.equals("Architecture"))
			tab="Architecture";
		return tab;
	}
	public void settab(String tab) {
		this.tab = tab;
	}
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frameviewandgiveanswer frame = new Frameviewandgiveanswer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frameviewandgiveanswer() {
		setTitle("Answer questions - Connect Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		answerpanel = new JPanel();
		answerpanel.setBackground(Color.BLACK);
		answerpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(answerpanel);
		answerpanel.setLayout(null);
		
		
		lblQuestiontype.setForeground(Color.WHITE);
		lblQuestiontype.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		lblQuestiontype.setBounds(204, 13, 401, 56);
		answerpanel.add(lblQuestiontype);
		
		
		lblQuestiondisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestiondisplay.setForeground(Color.WHITE);
		lblQuestiondisplay.setFont(new Font("Champagne & Limousines", Font.BOLD, 25));
		lblQuestiondisplay.setBounds(215, 119, 1154, 134);
		answerpanel.add(lblQuestiondisplay);
		
		textArea = new TextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Champagne & Limousines", Font.BOLD, 18));
		textArea.setBounds(225, 555, 1130, 134);
		answerpanel.add(textArea);
		
		btnNewButton.setFont(new Font("Champagne & Limousines", Font.BOLD, 16));
		btnNewButton.setBounds(1258, 695, 97, 25);
		answerpanel.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 186, 730);
		answerpanel.add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\NF.jpg"));
		label.setBounds(0, 99, 70, 63);
		panel.add(label);
		
		label_1.setForeground(new Color(30, 144, 255));
		label_1.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_1.setBounds(80, 117, 70, 33);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\SCH.jpg"));
		label_2.setBounds(0, 43, 70, 63);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Search");
		label_3.setForeground(new Color(30, 144, 255));
		label_3.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_3.setBounds(80, 58, 70, 33);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\PF.jpg"));
		label_4.setBounds(0, 155, 70, 63);
		panel.add(label_4);
		
		label_5.setForeground(new Color(30, 144, 255));
		label_5.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_5.setBounds(80, 173, 70, 33);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Terms & Conditions");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_6.setBounds(41, 680, 116, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Help");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_7.setBounds(80, 654, 35, 27);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("About Ahmedabad University");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_8.setBounds(10, 695, 166, 22);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("_________________________");
		label_9.setForeground(SystemColor.controlDkShadow);
		label_9.setBounds(10, 217, 166, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("_________________________");
		label_10.setForeground(SystemColor.controlDkShadow);
		label_10.setBounds(10, 629, 166, 14);
		panel.add(label_10);
		
		label_11.setForeground(new Color(30, 144, 255));
		label_11.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_11.setBounds(57, 600, 70, 33);
		panel.add(label_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(225, 266, 1130, 282);
		answerpanel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1130, 282);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		//table.setForeground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"Answers"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(102);
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		
	}
}
