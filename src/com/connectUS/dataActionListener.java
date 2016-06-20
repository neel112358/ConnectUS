package com.connectUS;
import com.GUI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

//import com.GUI.TittleFrame;

public class dataActionListener  implements ActionListener
{
	TittleFrame tit;
        ModelConnect M;
        ConnectusList list,list1;
        
        //Copied
        Nthread t2;
       // File_Doubt FD = new File_Doubt();
;
	public dataActionListener(TittleFrame tittleFrame) 
	{
		tit = tittleFrame;
	}
        
	public boolean check(int a)
	{
		int c=0;
		for(int b=1;b<201501120;b++)
		{
			if(a==b)
				c++;
		}
		if(c>0){
			return(true);
		}
		else
			return(false);
	}
	public void actionPerformed(ActionEvent e) 
	{
		try
                {
                    //Button Developers
                if(e.getSource().equals(tit.btnDevelopers))
                {
                    tit.DF.setVisible(true);
                    tit.dispose();
                }
                 //Button Contact US
                if(e.getSource().equals(tit.btnContactus))
                {
                    tit.FC.setVisible(true);
                    tit.dispose();
                }
                //Buttons of Contact us to tit & Developer to tit 
                /*if(e.getSource().equals(tit.DF.btnBh) || e.getSource().equals(tit.FC.button_1))
                {
                    tit.setVisible(true);
                    tit.DF.dispose();
                    tit.FC.dispose();
                }*/
                //Button FeedBack
                if(e.getSource().equals(tit.FC.btnFeedback))
                {
                    tit.FFB.setVisible(true);
                    tit.FC.dispose();
                }
                if(e.getSource().equals(tit.NF.btnPost))
                {	list = new ConnectusList();
                	list.question(tit.NF,tit.txtroll.getText());
                	tit.NF.PostDoubtTextarea.setText("");
                //	FD.doubts();
                }
                if(e.getSource().equals(tit.FVA.btnNewButton))
                {
                	list = new ConnectusList();
                	list.answers(tit);
                	tit.FVA.textArea.setText("");
                	list.answersfetchrecords(tit);
                	//tit.FVA.dispose();
                	//tit.FVA.setVisible(true);
                }
		

                
            if(check(Integer.parseInt((tit.txtroll.getText()))) && tit.logpass.getText().equalsIgnoreCase("US"))
            {
               
                if(e.getSource().equals(tit.FP.BtnSave))
                {
                	ModelConnect m = new ModelConnect(tit.getRollno(), tit.getPassword(), tit.GETname(), tit.GETcity(), tit.GETedu(), tit.GEThome(), tit.GETsex(), tit.GETdob(), tit.GETskils(), tit.GETph(), tit.GETexp());
                	try
                	{	
                		list = new ConnectusList();
                		list.addRecord(m);
                	}
                	catch(Exception err)
                	{
                		err.printStackTrace();
                		
                	}
                	 ArrayList<ModelConnect> list1 = new ArrayList<ModelConnect>();
              		list = new ConnectusList();
              		//tit.FPD.labeldisplayskills.setText("Hello");
                  	list1=list.fetchRecords(tit.getRollno(),tit.FPD);
                 	
                	tit.FPD.setVisible(true);
                        tit.FP.dispose();
                        tit.SF.dispose();
                        tit.NF.dispose();
                        
                }
                if(e.getSource().equals(tit.FPD.btnedit))
                {	
                	tit.FP.NameTxtbox.setText(tit.FPD.labelnamedisplay.getText());
                	tit.FP.Collegetxtbox.setText(tit.FPD.labeleducationdetails.getText());
                	((JTextComponent) tit.FP.dateChooser.getDateEditor().getUiComponent()).setText(tit.FPD.lblDisplayDOB.getText());
               // 	tit.FP.dateChooser.set(tit.FPD.lblDisplayDOB.getText());
                	tit.FP.CurrentCityTxtbox.setText(tit.FPD.lblDisplaycc.getText());
                	tit.FP.comboBoxSex.setToolTipText(tit.FPD.lblDisplaysex.getText());
                	tit.FP.HTTextbox.setText(tit.FPD.lblDisplathometown.getText());
                	tit.FP.CNumTextbox.setText(tit.FPD.lblContactdissplay.getText());
                	tit.FP.InterestTextarea.setText(tit.FPD.labeldisplayskills.getText());
                	tit.FP.ExpTxtbox.setText(tit.FPD.lblDisplayea.getText());
                	tit.FP.setVisible(true);
                        tit.FPD.dispose();
                }
                if(e.getSource().equals(tit.btnConnect))
                {
                	//t2 = new Nthread("Thread 1");
                	tit.NF.setVisible(true);
                	tit.dispose();
                }
               
                
                
               
               
                
                if(e.getSource().equals(tit.SF.btnSearch_1))
                {
                	System.out.println("it was here");
                	tit.SF.setVisible(true);
            	ModelConnect m1 = new ModelConnect(tit.getRollnoSrc());
            	
            	
            	
            	try
            	{
            		list1 = new ConnectusList();
            		
            		
            		list1.searchRecord(m1);
            		
            		
            		
            	}
            	catch(Exception err)
            	{
            		err.printStackTrace();
            		
            	}
            	
                
              
               
                
               
            }	
            }}
                catch(Exception err)
		{
            System.out.println("Error Occured!!!");
            err.printStackTrace();
            if(e.getSource().equals(tit.btnConnect))
            tit.PE.setVisible(true);
            //if(e.getSource().equals(tit.btnventure) || e.getSource().equals(tit.btnsocs) || e.getSource().equals(tit.btniet) ||e.getSource().equals(tit.btnDevelopers) || e.getSource().equals(tit.btnContactus)|| e.getSource().equals(tit.btnhlic) || e.getSource().equals(tit.btnheritagecentre) || e.getSource().equals(tit.btnbkmib) || e.getSource().equals(tit.btnamsom))
            //tit.LE.setVisible(true);
            tit.LE.setLocationRelativeTo(null);
            tit.PE.setLocationRelativeTo(null);
		}
		}   
            }
                 




/*package com.connectUS;
import com.GUI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import com.GUI.TittleFrame;

public class dataActionListener  implements ActionListener
{
	TittleFrame tit;
        ModelConnect M;
        ConnectusList list,list1;
        
        //Copied
        Nthread t2;
       // File_Doubt FD = new File_Doubt();
;
	public dataActionListener(TittleFrame tittleFrame) 
	{
		tit = tittleFrame;
	}
        
	public boolean check(int a)
	{
		int c=0;
		for(int b=1;b<201501120;b++)
		{
			if(a==b)
				c++;
		}
		if(c>0){
			return(true);
		}
		else
			return(false);
	}
	public void actionPerformed(ActionEvent e) 
	{
		try
                {
                    //Button Developers
                if(e.getSource().equals(tit.btnDevelopers))
                {
                    tit.DF.setVisible(true);
                    tit.dispose();
                }
                 //Button Contact US
                if(e.getSource().equals(tit.btnContactus))
                {
                    tit.FC.setVisible(true);
                    tit.dispose();
                }
                //Buttons of Contact us to tit & Developer to tit 
                
                //Button FeedBack
                if(e.getSource().equals(tit.FC.btnFeedback))
                {
                    tit.FFB.setVisible(true);
                    tit.FC.dispose();
                }
                if(e.getSource().equals(tit.FFB.btnPost))
                {
                    
                    tit.FC.setVisible(true);
                    tit.FFB.dispose();
                    //main();
                }
           
                
            if(check(Integer.parseInt((tit.txtroll.getText()))) && tit.logpass.getText().equalsIgnoreCase("US"))
            {
               
                if(e.getSource().equals(tit.FP.BtnSave))
                {
                	tit.FPD.setVisible(true);
                        tit.FP.dispose();
                        tit.SF.dispose();
                        tit.NF.dispose();
                        
                        /*
                    	tit.FPD.labelforusername.setText(tit.GETname());
                    	
                    	tit.FPD.labelnamedisplay.setText(tit.GETname());
                    	tit.FPD.lblDisplaycc.setText(tit.GETcity());
                    	tit.FPD.labeldisplayskills.setText(tit.GETskils());
                    	tit.FPD.labeleducationdetails.setText(tit.GETedu());
                    	tit.FPD.lblDisplathometown.setText(tit.GEThome());
                    	tit.FPD.lblDisplaysex.setText(tit.GETsex());
                    	//tit.FPD.labelnamedisplay.setText(tit.GETname());
                    	tit.FPD.lblDisplayDOB.setText(tit.GETdob());
                    	tit.FPD.lblDisplayea.setText(tit.GETexp());
                    	tit.FPD.lblContactdisplay.setText(tit.GETph());
                    	
                        

                    	//FrameProfile f = new FrameProfile();
                    	ModelConnect m = new ModelConnect(tit.getRollno(), tit.getPassword(), tit.GETname(), tit.GETcity(), tit.GETedu(), tit.GEThome(), tit.GETsex(), tit.GETdob(), tit.GETskils(), tit.GETph(), tit.GETexp());
                    	try
                    	{	
                    		list = new ConnectusList();
                    		list.addRecord(m);
                    	}
                    	catch(Exception err)
                    	{
                    		err.printStackTrace();
                    		
                    	}
                }
                //Edited
                if(e.getSource().equals(tit.NF.btnProfile) || e.getSource().equals(tit.SF.btnProfile))
                {
                	 ArrayList<ModelConnect> list1 = new ArrayList<ModelConnect>();
             		list = new ConnectusList();
             		//tit.FPD.labeldisplayskills.setText("Hello");
                 	list1=list.fetchRecords(tit.getRollno(),tit.FPD);
                	tit.FPD.setVisible(true);
                    tit.FP.dispose();
                    tit.SF.dispose();
                    tit.NF.dispose();
                }
                
                
                
                
                if(e.getSource().equals(tit.FPD.btnedit))
                {
                	tit.FP.setVisible(true);
                        tit.FPD.dispose();
                }
                if(e.getSource().equals(tit.FC.button_1))
                {
                	System.out.println("If ");
                	tit.setVisible(true);
                }
                if(e.getSource().equals(tit.btnConnect))
                {
                //	t2 = new Nthread("Thread 1");
                	tit.NF.setVisible(true);
                	tit.dispose();
                	tit.PE.setVisible(false);
                	tit.PE.dispose();
                }
               
                //Code After saving program
               
                if(e.getSource().equals(tit.FA.btnSaveFile))
                {
                    tit.NF.setVisible(true);
                    //FD.main1(tit.NF.saytextArea.getText());
                    
                  //  tit.FA.dispose();
                }
                //Till here
                if(e.getSource().equals(tit.SF.btnSearch_1))
                {
                	System.out.println("it was here");
                	tit.SF.setVisible(true);
            	//FrameProfile f = new FrameProfile();
            	ModelConnect m1 = new ModelConnect(tit.getRollnoSrc());
            	
            	
            	
            	try
            	{
            		list1 = new ConnectusList();
            		
            		
            		list1.searchRecord(m1);
            		
            		
            		
            	}
            	catch(Exception err)
            	{
            		err.printStackTrace();
            		
            	}
            	
                }
                //change this in prasann's laptop
                if(e.getSource().equals(tit.FM.btnClickHereTo))
                {
                    String url = "http://www.way2smsinfo.com/way2sms-login/";                 	
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                }
               
                if(e.getSource().equals(tit.FA.btnSaveFile))
                {
                    tit.NF.setVisible(true);
                    tit.FA.dispose();
                }
              
            }	
                }
                catch(Exception err)
		{
            System.out.println("Error Occured!!!");
            if(e.getSource().equals(tit.btnConnect))
            tit.PE.setVisible(true);
            //if(e.getSource().equals(tit.btnventure) || e.getSource().equals(tit.btnsocs) || e.getSource().equals(tit.btniet) ||e.getSource().equals(tit.btnDevelopers) || e.getSource().equals(tit.btnContactus)|| e.getSource().equals(tit.btnhlic) || e.getSource().equals(tit.btnheritagecentre) || e.getSource().equals(tit.btnbkmib) || e.getSource().equals(tit.btnamsom))
            //tit.LE.setVisible(true);
            tit.LE.setLocationRelativeTo(null);
            tit.PE.setLocationRelativeTo(null);
		}
		}   
            }*/