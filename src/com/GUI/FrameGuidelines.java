package com.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class FrameGuidelines extends JFrame {

	private JPanel contentPane;
	public JLabel label = new JLabel("Back to Connect Us");
	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGuidelines frame = new FrameGuidelines();
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
	public FrameGuidelines() {
		setTitle("Guidelines-Connect Us");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuidelines = new JLabel("Guidelines");
		lblGuidelines.setForeground(new Color(30, 144, 255));
		lblGuidelines.setFont(new Font("Champagne & Limousines", Font.PLAIN, 41));
		lblGuidelines.setBounds(600, 45, 205, 32);
		contentPane.add(lblGuidelines);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(296, 124, 843, 545);
		contentPane.add(scrollPane);
		
		JTextArea txtrHiUtsav = new JTextArea();
		txtrHiUtsav.setLineWrap(true);
		txtrHiUtsav.setWrapStyleWord(true);
		txtrHiUtsav.setEditable(false);
		scrollPane.setViewportView(txtrHiUtsav);
		txtrHiUtsav.setText("1.\tPrivacy\r\n\tYour privacy is very important to us. We designed our Data Policy to make important \t\tdisclosures about how you can use Connect Us to share with others and how we \t\t\tcollect and can use your content and information. We encourage you to read the Data \t\tPolicy, and to use it to help you make informed decisions. \r\n \r\n2.\tSharing Your Content and Information\r\n\r\n\tYou own all of the content and information you post on Connect Us, and you can \t\t\tcontrol how it is shared through your privacy and application settings. In addition:\r\n\t1.\tFor content that is covered by intellectual property rights, like photos and videos \t\t(IP content), you specifically give us the following permission, subject to your \t\tprivacyand application settings: you grant us a non-exclusive, transferable, sub-\t\tlicensable, royalty-free, worldwide license to use any IP content that you post on or in \t\tconnection with Connect Us (IP License). This IP License ends when you delete your IP \t\tcontent or your account unless your content has been shared with others, and they \t\thave not deleted it.\r\n\t2.\tWhen you delete IP content, it is deleted in a manner similar to emptying the \t\trecycle bin on a computer. However, you understand that removed content may \t\tpersist in backup copies for a reasonable period of time (but will not be available to \t\tothers).\r\n\t3.\tWhen you use an application, the application may ask for your permission to \t\taccess your content and information as well as content and information that others \t\thave shared with you.  We require applications to respect your privacy, and your \t\tagreement with that application will control how the application can use, store, and \t\ttransfer that content and information.  (To learn more about Platform, including how \t\tyou can control what information other people may share with applications, read our \t\tData Policy and Platform Page.)\r\n\t4.\tWhen you publish content or information using the Public setting, it means that \t\tyou are allowing everyone, including people off of Connect Us, to access and use that \t\tinformation, and to associate it with you (i.e., your name and profile picture).\r\n\t5.\tWe always appreciate your feedback or other suggestions about Connect Us, but \t\tyou understand that we may use your feedback or suggestions without any obligation \t\tto compensate you for them (just as you have no obligation to offer them).\r\n \r\n3.\tSafety\r\n\r\n\tWe do our best to keep Connect Us safe, but we cannot guarantee it. We need your \t\t\thelp to keep Connect Us safe, which includes the following commitments by you:\r\n\t1.\tYou will not post unauthorized commercial communications (such as spam) on \tConnect Us.\r\n\t2.\tYou will not collect users' content or information, or otherwise access Connect Us, \t\tusing automated means (such as harvesting bots, robots, spiders, or scrapers) without \t\tour prior permission.\r\n\t3.\tYou will not engage in unlawful multi-level marketing, such as a pyramid scheme, \t\ton Connect Us.\r\n\t4.\tYou will not upload viruses or other malicious code.\r\n\t5.\tYou will not solicit login information or access an account belonging to someone \t\telse.\r\n\t6.\tYou will not bully, intimidate, or harass any user.\r\n\t7.\tYou will not post content that: is hate speech, threatening, or pornographic; incites \t\tviolence; or contains nudity or graphic or gratuitous violence.\r\n\t8.\tYou will not develop or operate a third-party application containing alcohol-\t\trelated, dating or other mature content (including advertisements) without appropriate \tage-based restrictions.\r\n\t9.\tYou will not use Connect Us to do anything unlawful, misleading, malicious, or \t\tdiscriminatory.\r\n\t10.\tYou will not do anything that could disable, overburden, or impair the proper \t\tworking or appearance of Connect Us, such as a denial of service attack or interference \t\twith page rendering or other Connect Us functionality.\r\n\t11.\tYou will not facilitate or encourage any violations of this Statement or our policies.\r\n\r\n");
		txtrHiUtsav.setFont(new Font("Champagne & Limousines", Font.BOLD, 20));
		txtrHiUtsav.setBackground(new Color(0, 0, 0));
		txtrHiUtsav.setForeground(new Color(255, 255, 255));
		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		label.setBounds(600, 701, 197, 26);
		contentPane.add(label);
	}
}
