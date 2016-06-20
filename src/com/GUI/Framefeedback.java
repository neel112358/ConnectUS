package com.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class Framefeedback extends JFrame {

	private JPanel feedbackpanel;
        	static JTextArea txtrFeedback = new JTextArea();
		JLabel lblProvideYourValuable = new JLabel("Provide your valuable feedback below!");
		public JButton btnPost = new JButton("Post");
		JLabel lblFeedback = new JLabel("");

	public Framefeedback() {
		setTitle("Frame-feedback");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 525);
		feedbackpanel = new JPanel();
		feedbackpanel.setBackground(new Color(0, 0, 0));
		feedbackpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(feedbackpanel);
		feedbackpanel.setLayout(null);
		
		txtrFeedback.setBackground(new Color(128, 128, 128));
		txtrFeedback.setForeground(new Color(255, 255, 255));
		txtrFeedback.setBounds(62, 188, 683, 188);
		feedbackpanel.add(txtrFeedback);
		
		lblProvideYourValuable.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProvideYourValuable.setForeground(new Color(255, 255, 255));
		lblProvideYourValuable.setBounds(260, 125, 444, 43);
		feedbackpanel.add(lblProvideYourValuable);
		
		btnPost.setBackground(new Color(0, 0, 0));
		btnPost.setBounds(656, 387, 89, 23);
		feedbackpanel.add(btnPost);
		
		
		lblFeedback.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\feedbackIcon.png"));
		lblFeedback.setBounds(347, 27, 108, 87);
		feedbackpanel.add(lblFeedback);
	}
}