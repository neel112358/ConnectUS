package com.connectUS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.GUI.FrameProfile;




public class StudentListner implements ActionListener 
{
	
	private FrameProfile frame;
	ModelConnect saveDetails;
	
	public StudentListner(FrameProfile frame)
	{
		this.frame = frame;
	}
	
	
	
	public void actionPerformed(ActionEvent e) 
	{
		
		System.out.println("Clicked: " + e.toString());
		//System.out.println("it was here");
		if(e.getActionCommand() == "Save")
		{
			System.out.println("Saving Recording");	
		 //saveDetails = new ModelConnect(2015, "adb", frame.getNameframe(), frame.getCityframe(), frame.geteduframe(), frame.gethomeframe(), frame.getsexframe(), frame.getdobframe(), frame.getskillsframe(), frame.getphframe(), frame.getexpframe());
		
		
		}
	}
	}
