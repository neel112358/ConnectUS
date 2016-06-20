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

public class PasswordError extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
        JLabel lblError = new JLabel("");
	JLabel lblRollNoOr = new JLabel("Roll No or Password Incorrect!");
		
	

	/**
	 * Create the dialog.
	 */
	public PasswordError() {
		setTitle("Error");
		setBounds(100, 100, 398, 255);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblError.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\ConnectUS\\img\\Error.png"));
			lblError.setBounds(137, 47, 90, 71);
			contentPanel.add(lblError);
		}
		{
			lblRollNoOr.setFont(new Font("Champagne & Limousines", Font.BOLD, 30));
			lblRollNoOr.setForeground(Color.RED);
			lblRollNoOr.setBounds(10, 132, 362, 46);
			contentPanel.add(lblRollNoOr);
		}
	}
}