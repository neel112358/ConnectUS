package com.connectUS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FrameSearch extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSearch frame = new FrameSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrameSearch() {
		getContentPane().setLayout(null);
		this.setVisible(true);
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(443, 200, 89, 23);
		getContentPane().add(btnSearch);
		
		
		
		
		textField = new JTextField();
		textField.setBounds(272, 201, 171, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel labeldisplaysearch = new JLabel("");
		labeldisplaysearch.setBounds(272, 244, 260, 74);
		getContentPane().add(labeldisplaysearch);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(textField);
		add(btnSearch);
		add(labeldisplaysearch);
		btnSearch.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	labeldisplaysearch.setText("You searched for: "+textField.getText());
            }
        });
        
		textField.addKeyListener(new KeyAdapter()
        {       
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                	labeldisplaysearch.setText("You searched for: "+textField.getText());
            }
        });
	}
}
