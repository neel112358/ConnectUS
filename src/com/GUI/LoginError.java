package com.GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class LoginError extends JDialog {

	private final JPanel contentPanel = new JPanel();
			JLabel lblError = new JLabel("");
			JLabel lblEnterIdAnd = new JLabel("Enter ID and Password to access");


	/**
	 * Create the dialog.
	 */
	public LoginError() {
		setTitle("Login Error");
		setBackground(Color.BLACK);
		setBounds(100, 100, 424, 242);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblError.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\Error.png"));
			lblError.setBounds(159, 49, 90, 64);
			contentPanel.add(lblError);
		}
		{
			lblEnterIdAnd.setForeground(Color.RED);
			lblEnterIdAnd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			lblEnterIdAnd.setBounds(95, 124, 414, 52);
			contentPanel.add(lblEnterIdAnd);
		}
	}

}