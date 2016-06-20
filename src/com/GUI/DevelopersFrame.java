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
import javax.swing.JButton;
import java.awt.Toolkit;

public class DevelopersFrame extends JFrame {

	private JPanel Developerspanel;
        JLabel lblDeveloperstittle = new JLabel("Developers");
	JLabel lblPrasannPatel = new JLabel("Prasann Patel");
	JLabel labelpujan = new JLabel("Pujan Prajapati");
        JLabel lblutsavoz = new JLabel("Utsav Oza");
	JLabel lblPrasann = new JLabel("");
	JLabel lblUtsav = new JLabel("");
	JLabel lblPujan = new JLabel("");
	public JLabel lblBackToConnect = new JLabel("Back to Connect Us");
	private final JLabel lblSurajPatel = new JLabel("Suraj Patel");
	private final JLabel lblNeelShukla = new JLabel("Neel Shukla");
					
	public DevelopersFrame() 
        {
		setIconImage(Toolkit.getDefaultToolkit().getImage("S:\\Sem 2\\O.O.P\\OOP LAB\\ConnectUS\\img\\connectus.png"));
		setTitle("Developers-Connect Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1399, 777);
		Developerspanel = new JPanel();
		Developerspanel.setBackground(Color.BLACK);
		Developerspanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Developerspanel);
		Developerspanel.setLayout(null);
		
		//Developers Tittle		
		lblDeveloperstittle.setFont(new Font("moonhouse", Font.PLAIN, 31));
		lblDeveloperstittle.setForeground(new Color(30, 144, 255));
		lblDeveloperstittle.setBounds(629, 21, 212, 48);
		Developerspanel.add(lblDeveloperstittle);
		
		//Prasann Patel label
		lblPrasannPatel.setFont(new Font("Champagne & Limousines", Font.PLAIN, 28));
		lblPrasannPatel.setForeground(new Color(30, 144, 255));
		lblPrasannPatel.setBounds(197, 272, 152, 70);
		Developerspanel.add(lblPrasannPatel);
		
		
		//Pujan patel label
			labelpujan.setForeground(new Color(30, 144, 255));
		labelpujan.setFont(new Font("Champagne & Limousines", Font.PLAIN, 28));
		labelpujan.setBounds(1070, 272, 197, 70);
		Developerspanel.add(labelpujan);
		
		
		//Label Utsav Oza
		lblutsavoz.setForeground(new Color(30, 144, 255));
		lblutsavoz.setFont(new Font("Champagne & Limousines", Font.PLAIN, 28));
		lblutsavoz.setBounds(672, 272, 152, 70);
		Developerspanel.add(lblutsavoz);
		
		/*final ImageIcon Prasannlbl;
		Prasannlbl = new ImageIcon(this.getClass().getResource("/Prasannpatel.jpg"));
		lblPrasann = new JLabel(Prasannlbl);*/
		lblPrasann.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\ConnectUS\\img\\Prasannpatel.jpg"));
		lblPrasann.setBounds(88, 58, 322, 264);
		Developerspanel.add(lblPrasann);
		
		
		//Images
		/*final ImageIcon utsavlbl;
		utsavlbl = new ImageIcon(this.getClass().getResource("/TheOz.jpg"));
		lblUtsav = new JLabel(utsavlbl);*/
		lblUtsav.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\ConnectUS\\img\\TheOz.jpg"));
		lblUtsav.setBounds(551, 102, 273, 191);
		Developerspanel.add(lblUtsav);
		
		/*final ImageIcon pujanlbl;
		pujanlbl = new ImageIcon(this.getClass().getResource("/pujanbhaiprajapati.png"));
		lblPujan = new JLabel(pujanlbl);*/
		lblPujan.setIcon(new ImageIcon("C:\\Users\\Utsav Oza\\Desktop\\ConnectUS\\img\\pujanbhaiprajapati.png"));
		lblPujan.setBounds(962, 58, 267, 288);
		Developerspanel.add(lblPujan);
		lblBackToConnect.setFont(new Font("Champagne & Limousines", Font.BOLD, 22));
		lblBackToConnect.setForeground(Color.WHITE);
		lblBackToConnect.setBounds(653, 682, 197, 26);
		
		Developerspanel.add(lblBackToConnect);
		lblSurajPatel.setForeground(new Color(30, 144, 255));
		lblSurajPatel.setFont(new Font("Champagne & Limousines", Font.PLAIN, 28));
		lblSurajPatel.setBounds(427, 553, 152, 70);
		
		Developerspanel.add(lblSurajPatel);
		lblNeelShukla.setForeground(new Color(30, 144, 255));
		lblNeelShukla.setFont(new Font("Champagne & Limousines", Font.PLAIN, 28));
		lblNeelShukla.setBounds(897, 553, 152, 70);
		
		Developerspanel.add(lblNeelShukla);
	}
}