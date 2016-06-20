package com.connectUS;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.GUI.Framenotificationsdisplay;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dialog.ModalityType;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Notification extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
		JButton btnNotify = new JButton("");
	
	public Notification() {
		setBackground(Color.BLACK);
		setTitle("1 New Notification");
		setBounds(216, 259, 382, 154);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBounds(0, 0, 373, 121);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		btnNotify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Framenotificationsdisplay ND = new Framenotificationsdisplay();
				ND.setVisible(true);
				
			}
		});
		btnNotify.setIcon(new ImageIcon("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\New notification.png"));
		btnNotify.setBounds(0, 0, 373, 121);
		contentPanel.add(btnNotify);
	}
}