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
import javax.swing.SwingConstants;

public class FrameAbout extends JFrame {

	public  JPanel contentPane;
	public JLabel label = new JLabel("Back to Connect Us");
	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAbout frame = new FrameAbout();
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
	public FrameAbout() {
		setTitle("About-Connect Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(-35, 0, 1354, 733);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.setBounds(620, 39, 205, 32);
		lblAboutUs.setForeground(new Color(30, 144, 255));
		lblAboutUs.setFont(new Font("Champagne & Limousines", Font.PLAIN, 41));
		panel.add(lblAboutUs);
		
		JLabel lblNewLabel = new JLabel("Founded : 4th February, 2016 ");
		lblNewLabel.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(501, 127, 810, 92);
		panel.add(lblNewLabel);
		
		JLabel lblShortDescription = new JLabel("Short Description : Connect Us is an esteemed organization,\r\n");
		lblShortDescription.setForeground(Color.WHITE);
		lblShortDescription.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblShortDescription.setBounds(431, 185, 620, 92);
		panel.add(lblShortDescription);
		
		JLabel lblDevelopedByStudents = new JLabel("developed by students of Ahmedabad University");
		lblDevelopedByStudents.setForeground(Color.WHITE);
		lblDevelopedByStudents.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblDevelopedByStudents.setBounds(600, 214, 620, 92);
		panel.add(lblDevelopedByStudents);
		
		JLabel lblToHelpStudents = new JLabel("to help students solve their doubts regarding subjects ");
		lblToHelpStudents.setForeground(Color.WHITE);
		lblToHelpStudents.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblToHelpStudents.setBounds(600, 244, 620, 92);
		panel.add(lblToHelpStudents);
		
		JLabel lblAndDevelopingAn = new JLabel("and developing an enviornment of healthy interaction");
		lblAndDevelopingAn.setForeground(Color.WHITE);
		lblAndDevelopingAn.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblAndDevelopingAn.setBounds(600, 265, 620, 92);
		panel.add(lblAndDevelopingAn);
		
		JLabel lblAndDebate = new JLabel("and debate.");
		lblAndDebate.setForeground(Color.WHITE);
		lblAndDebate.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblAndDebate.setBounds(600, 288, 620, 92);
		panel.add(lblAndDebate);
		
		JLabel lblMissionConnect = new JLabel("Mission : Founded in 2016, Connect Us\u2019 mission is to give students ");
		lblMissionConnect.setForeground(Color.WHITE);
		lblMissionConnect.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblMissionConnect.setBounds(520, 328, 620, 92);
		panel.add(lblMissionConnect);
		
		JLabel lblThePowerTo = new JLabel("the power to share and make the Ahemadabad University ");
		lblThePowerTo.setForeground(Color.WHITE);
		lblThePowerTo.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblThePowerTo.setBounds(600, 360, 620, 92);
		panel.add(lblThePowerTo);
		
		JLabel lblMoreOpenAnd = new JLabel("more open and connected.");
		lblMoreOpenAnd.setForeground(Color.WHITE);
		lblMoreOpenAnd.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblMoreOpenAnd.setBounds(600, 391, 620, 92);
		panel.add(lblMoreOpenAnd);
		
		JLabel lblWebsite = new JLabel("Website :");
		lblWebsite.setForeground(Color.WHITE);
		lblWebsite.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblWebsite.setBounds(509, 440, 620, 92);
		panel.add(lblWebsite);
		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		label.setBounds(628, 696, 197, 26);
		panel.add(label);
	}
}
