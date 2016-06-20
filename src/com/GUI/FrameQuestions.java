package com.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.Icon;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class FrameQuestions extends JFrame {

	//private JPanel contentPane;
	public JLabel label_1 = new JLabel("Home");
	public JLabel label_3 = new JLabel("Search");
	public JLabel label_5 = new JLabel("Profile");
	public JLabel label_12 = new JLabel("Logout");
	public JLabel lblLogout = new JLabel("Logout");
	public JLabel lblHome = new JLabel("Home");
	public JLabel lblProfile = new JLabel("Profile");
	//table_1 = new JTable();
	
	
	private JPanel PanelAns;
	public JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JPanel panel_3 = new JPanel();
	JPanel panel_2= new JPanel();
	public JTable table_1 = new JTable();
	
	public JButton btnSearch;
	public JButton btnBackToMain;
	public JButton btnNewButton = new JButton("New button");
	public JTable table_2;
	public JTable table;
	public JTable table_3;
	public JTable table_4;
	public JTable table_5;
	public JTable table_6;
	public JTable table_7;
	public JTable table_8;
	public JTable table_9;
	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameQuestions frame = new FrameQuestions();
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
	public FrameQuestions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Pasted
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(30, 144, 255));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(186, 144, 1195, 586);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		tabbedPane.setBorder(null);
		tabbedPane.setFont(new Font("Gill Sans MT", Font.BOLD, 16));
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setBackground(new Color(192, 192, 192));
		
		tabbedPane.setBounds(12, 13, 1171, 560);
		panel_1.add(tabbedPane);
		panel_3.setForeground(new Color(30, 144, 255));
		panel_3.setBackground(Color.BLACK);
		
		tabbedPane.addTab("ICT", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane(table_1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(0, 0, 1166, 517);
		//tabbedPane.setIconAt(10, "NF.jpg");
		panel_3.add(scrollPane_1);
		scrollPane_1.getViewport().setBackground(new Color(176,196,222));
		table_1.setShowVerticalLines(false);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		table_1.setBackground(new Color(255, 255, 255));
		table_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_1.setDefaultEditor(Object.class, null);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(0).setMinWidth(150);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(1).setMinWidth(150);
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Mech. Engg.", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = 
				new JScrollPane();
		scrollPane.setBounds(0, 0, 1166, 517);
		panel.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.getColumnModel().getColumn(1).setPreferredWidth(120);
		table_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Chem. Engg.", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1166, 517);
		panel_4.add(scrollPane_2);
		
		table = new JTable();
		scrollPane_2.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Management", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1166, 517);
		panel_5.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Accounts & Commerce", null, panel_6, null);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 1166, 530);
		panel_6.add(scrollPane_4);
		
		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_4.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_10 = new JPanel();
		tabbedPane.addTab("Entrepreneurship & Startups", null, panel_10, null);
		panel_10.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 1166, 530);
		panel_10.add(scrollPane_5);
		
		table_5 = new JTable();
		scrollPane_5.setViewportView(table_5);
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_5.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("Architecture", null, panel_11, null);
		panel_11.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 0, 1166, 517);
		panel_11.add(scrollPane_6);
		
		table_6 = new JTable();
		scrollPane_6.setViewportView(table_6);
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table_6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_6.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_12 = new JPanel();
		tabbedPane.addTab("Design", null, panel_12, null);
		panel_12.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 1166, 517);
		panel_12.add(scrollPane_7);
		
		table_7 = new JTable();
		scrollPane_7.setViewportView(table_7);
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Ouestions"
			}
		));
		table_7.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_7.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_13 = new JPanel();
		tabbedPane.addTab("Computer Science", null, panel_13, null);
		panel_13.setLayout(null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(0, 0, 1166, 517);
		panel_13.add(scrollPane_8);
		
		table_8 = new JTable();
		scrollPane_8.setViewportView(table_8);
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table_8.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_8.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		JPanel panel_14 = new JPanel();
		tabbedPane.addTab("Festivals & Events", null, panel_14, null);
		panel_14.setLayout(null);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(0, 0, 1166, 517);
		panel_14.add(scrollPane_9);
		
		table_9 = new JTable();
		scrollPane_9.setViewportView(table_9);
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Ques. No.", "Questions"
			}
		));
		table_9.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		table_9.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		DefaultTableModel model  = new DefaultTableModel();
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(-517, 144, 186, 594);
		contentPane.add(panel_7);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 99, 70, 63);
		panel_7.add(label);
		
		scrollPane.getViewport().setBackground(new Color(176,196,222));
		scrollPane_2.getViewport().setBackground(new Color(176,196,222));
		scrollPane_3.getViewport().setBackground(new Color(176,196,222));
		scrollPane_4.getViewport().setBackground(new Color(176,196,222));
		scrollPane_5.getViewport().setBackground(new Color(176,196,222));
		scrollPane_6.getViewport().setBackground(new Color(176,196,222));
		scrollPane_7.getViewport().setBackground(new Color(176,196,222));
		scrollPane_8.getViewport().setBackground(new Color(176,196,222));
		scrollPane_9.getViewport().setBackground(new Color(176,196,222));
		
		
		label_1.setForeground(new Color(30, 144, 255));
		label_1.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_1.setBounds(80, 117, 70, 33);
		panel_7.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(0, 43, 70, 63);
		panel_7.add(label_2);
		
		label_3.setForeground(new Color(30, 144, 255));
		label_3.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_3.setBounds(80, 58, 70, 33);
		panel_7.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(0, 155, 70, 63);
		panel_7.add(label_4);
		
		label_5.setForeground(new Color(30, 144, 255));
		label_5.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_5.setBounds(80, 173, 70, 33);
		panel_7.add(label_5);
		
		JLabel label_6 = new JLabel("Terms & Conditions");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_6.setBounds(41, 534, 116, 14);
		panel_7.add(label_6);
		
		JLabel label_7 = new JLabel("Help");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_7.setBounds(80, 508, 35, 27);
		panel_7.add(label_7);
		
		JLabel label_8 = new JLabel("About Ahmedabad University");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_8.setBounds(10, 549, 166, 22);
		panel_7.add(label_8);
		
		JLabel label_9 = new JLabel("_________________________");
		label_9.setForeground(SystemColor.controlDkShadow);
		label_9.setBounds(10, 217, 166, 14);
		panel_7.add(label_9);
		
		JLabel label_10 = new JLabel("View Details");
		label_10.setForeground(new Color(30, 144, 255));
		label_10.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_10.setBounds(34, 242, 123, 33);
		panel_7.add(label_10);
		
		JLabel label_11 = new JLabel("_________________________");
		label_11.setForeground(SystemColor.controlDkShadow);
		label_11.setBounds(10, 483, 166, 14);
		panel_7.add(label_11);
		
		label_12.setForeground(new Color(30, 144, 255));
		label_12.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_12.setBounds(57, 454, 70, 33);
		panel_7.add(label_12);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		panel_8.setBackground(Color.BLACK);
		panel_8.setBounds(0, 0, 1381, 145);
		contentPane.add(panel_8);
		
		JLabel label_13 = new JLabel("Connect");
		label_13.setForeground(new Color(30, 144, 255));
		label_13.setFont(new Font("moonhouse", Font.PLAIN, 32));
		label_13.setBounds(563, 73, 167, 47);
		panel_8.add(label_13);
		
		JLabel label_14 = new JLabel("US");
		label_14.setForeground(Color.GREEN);
		label_14.setFont(new Font("moonhouse", Font.PLAIN, 32));
		label_14.setBounds(724, 86, 73, 20);
		panel_8.add(label_14);
		
		JLabel label_15 = new JLabel(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\Main window logo.png"));
		label_15.setBounds(601, 11, 147, 83);
		panel_8.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_16.setBounds(626, 84, 64, 14);
		panel_8.add(label_16);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(105, 105, 105), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		panel_9.setBackground(Color.BLACK);
		panel_9.setBounds(0, 144, 186, 594);
		contentPane.add(panel_9);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\NF.jpg"));
		label_17.setBounds(0, 99, 70, 63);
		panel_9.add(label_17);
		
		lblHome.setForeground(new Color(30, 144, 255));
		lblHome.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		lblHome.setBounds(80, 117, 70, 33);
		panel_9.add(lblHome);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\SCH.jpg"));
		label_19.setBounds(0, 43, 70, 63);
		panel_9.add(label_19);
		
		JLabel label_20 = new JLabel("Search");
		label_20.setForeground(new Color(30, 144, 255));
		label_20.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		label_20.setBounds(80, 58, 70, 33);
		panel_9.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Suraj\\college\\Summer 2016\\ConnectUS\\PF.jpg"));
		label_21.setBounds(0, 155, 70, 63);
		panel_9.add(label_21);
		
		lblProfile.setForeground(new Color(30, 144, 255));
		lblProfile.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		lblProfile.setBounds(80, 173, 70, 33);
		panel_9.add(lblProfile);
		
		JLabel label_23 = new JLabel("Terms & Conditions");
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_23.setBounds(41, 534, 116, 14);
		panel_9.add(label_23);
		
		JLabel label_24 = new JLabel("Help");
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_24.setBounds(80, 508, 35, 27);
		panel_9.add(label_24);
		
		JLabel label_25 = new JLabel("About Ahmedabad University");
		label_25.setForeground(Color.WHITE);
		label_25.setFont(new Font("Champagne & Limousines", Font.BOLD, 14));
		label_25.setBounds(10, 549, 166, 22);
		panel_9.add(label_25);
		
		JLabel label_26 = new JLabel("_________________________");
		label_26.setForeground(SystemColor.controlDkShadow);
		label_26.setBounds(10, 217, 166, 14);
		panel_9.add(label_26);
		
		JLabel label_28 = new JLabel("_________________________");
		label_28.setForeground(SystemColor.controlDkShadow);
		label_28.setBounds(10, 483, 166, 14);
		panel_9.add(label_28);
		
		lblLogout.setForeground(new Color(30, 144, 255));
		lblLogout.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		lblLogout.setBounds(57, 454, 70, 33);
		panel_9.add(lblLogout);
	//	columnModel.getColumn(1).setWidth(250);
		//frame.getContentPane().add(panel_1);
		
		
	}
}
