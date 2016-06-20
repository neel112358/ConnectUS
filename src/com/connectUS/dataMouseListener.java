package com.connectUS;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class dataMouseListener implements MouseListener ,MouseMotionListener
{
	TittleFrame tit1, tit2, tit;
	

	public dataMouseListener(TittleFrame tittleFrame) 
	{
		tit1 = tittleFrame;
	}
	
	ConnectusList list;
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource().equals(tit1.FQ.table_2)||e.getSource().equals(tit1.FQ.table)||e.getSource().equals(tit1.FQ.table_2)||e.getSource().equals(tit1.FQ.table_3)||e.getSource().equals(tit1.FQ.table_4)||e.getSource().equals(tit1.FQ.table_5)||e.getSource().equals(tit1.FQ.table_6)||e.getSource().equals(tit1.FQ.table_7)||e.getSource().equals(tit1.FQ.table_8)||e.getSource().equals(tit1.FQ.table_9))
				{
			//System.out.println(tit1.FQ.table_5.getTableHeader());
					System.out.println("Yesfq");
					tit1.FVA.tab = tit1.FQ.tabbedPane.getTitleAt(tit1.FQ.tabbedPane.getSelectedIndex());
					System.out.println(tit1.FVA.tab);
					tit1.FVA.settab(tit1.FVA.tab);
				}
		if(e.getSource().equals(tit1.FMQ.table_2)||e.getSource().equals(tit1.FMQ.table)||e.getSource().equals(tit1.FMQ.table_2)||e.getSource().equals(tit1.FMQ.table_3)||e.getSource().equals(tit1.FMQ.table_4)||e.getSource().equals(tit1.FMQ.table_5)||e.getSource().equals(tit1.FMQ.table_6)||e.getSource().equals(tit1.FMQ.table_7)||e.getSource().equals(tit1.FMQ.table_8)||e.getSource().equals(tit1.FMQ.table_9))
		{
	//System.out.println(tit1.FMQ.table_5.getTableHeader());
			System.out.println("Yesfq");

			tit1.FVA.tab = tit1.FMQ.tabbedPane.getTitleAt(tit1.FMQ.tabbedPane.getSelectedIndex());
			System.out.println(tit1.FVA.tab);
			tit1.FVA.settab(tit1.FVA.tab);
		}
		if(e.getSource().equals(tit1.lblFeedback))
		{
			tit1.FFB.setVisible(true);
			tit1.NF.dispose();
			tit1.FP.dispose();
			tit1.FPD.dispose();
		}
		if(e.getSource().equals(tit1.lblContactUs))
		{
			tit1.FC.setVisible(true);
			tit1.NF.dispose();
			tit1.FP.dispose();
			tit1.FPD.dispose();
		}
		if(e.getSource().equals(tit1.lblDevelopers))
		{
			tit1.DF.setVisible(true);
			tit1.NF.dispose();
			tit1.FP.dispose();
			tit1.FPD.dispose();
		}
		if(e.getSource().equals(tit1.NF.lblProfile) || e.getSource().equals(tit1.FP.lblProfile) ||e.getSource().equals(tit1.FVA.label_5)  || e.getSource().equals(tit1.FQ.lblProfile)||e.getSource().equals(tit1.FMQ.lblProfile))
		{
			tit1.FMQ.dispose();	
			tit1.FPD.setVisible(true);
			tit1.NF.dispose();
			ArrayList<ModelConnect> list1 = new ArrayList<ModelConnect>();
 			list = new ConnectusList();
 		//tit.FPD.labeldisplayskills.setText("Hello");
 			try {
				list1=list.fetchRecords(tit1.getRollno(),tit1.FPD);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			//tit1.NF.setVisible(false);
			
		}
		if(e.getSource().equals(tit1.FP.lblHome) || e.getSource().equals(tit1.FPD.lblHome) || e.getSource().equals(tit1.FQ.lblHome) ||e.getSource().equals(tit1.FVA.label_1) || e.getSource().equals(tit1.FMQ.lblHome))
		{
			tit1.NF.setVisible(true);
			tit1.FVA.dispose();

			tit1.FMQ.dispose();
			tit1.FPD.dispose();
			tit1.FQ.dispose();
			tit1.FP.dispose();
		}
		if(e.getSource().equals(tit1.DF.lblBackToConnect) || e.getSource().equals(tit1.FA.label) || e.getSource().equals(tit1.FG.label))// || e.getSource().equals(tit1.FMQ.lblHome))
		{
			tit1.setVisible(true);

			tit1.FMQ.dispose();
			tit1.NF.dispose();
			tit1.FG.dispose();
			tit1.FP.dispose();
			tit1.FPD.dispose();
			tit1.FA.dispose();
		}
		if(e.getSource().equals(tit1.FP.lblViewDetails))
		{
			
			tit1.FPD.setVisible(true);
			tit1.FQ.dispose();
			tit1.FVA.dispose();
			tit1.NF.dispose();
			tit1.FP.dispose();
		}
		if(e.getSource().equals(tit1.NF.lblLogout) || e.getSource().equals(tit1.FP.lblLogout) || e.getSource().equals(tit1.FPD.lblLogout) ||e.getSource().equals(tit1.FQ.lblLogout) ||e.getSource().equals(tit1.FVA.label_11) || e.getSource().equals(tit1.FMQ.lblLogout))
		{
			tit1.FVA.dispose();
			tit2 = new  TittleFrame();
			tit1.FQ.dispose();
			tit2.setVisible(true);
			tit1.NF.dispose();
			tit1.FP.dispose();
			tit1.FPD.dispose();
			tit1.FMQ.dispose();
		}
		if(e.getSource().equals(tit1.lblAbout))
		{
			tit1.FA.setVisible(true);
			tit1.dispose();
		}
		if(e.getSource().equals(tit1.lblGuidelines))
		{
			tit1.FG.setVisible(true);
			tit1.dispose();
		}
		if(e.getSource().equals(tit1.NF.lblViewQuestions) )
		{
			list = new ConnectusList();
			try {System.out.println("lblveiw");
				list.AllQuestionfetchRecords(tit1.FQ);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			tit1.FQ.setVisible(true);
			tit1.NF.dispose();
			//copied
			//if(e.getSource().equals(tit1.NF.lblViewQuestions))
			//{
				tit1.NF.lblViewQuestions.setForeground(new Color(30, 144, 255));
			//}
		
		}
		if(e.getSource().equals(tit1.FQ.table_2) || e.getSource().equals(tit1.FMQ.table_2))
		{	
			
			int row ;
			TableModel model;
			if(e.getSource().equals(tit1.FQ.table_2))
				{
				System.out.println("tree123");
					row= tit1.FQ.table_2.getSelectedRow();
					model= tit1.FQ.table_2.getModel();
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FQ.dispose();
				}
			else
				{	
					row=tit1.FMQ.table_2.getSelectedRow();
					System.out.println("tree");
					model = tit1.FMQ.table_2.getModel();
					System.out.println("Yes!!");
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FMQ.dispose();
				}
		}
		if(e.getSource().equals(tit1.FQ.table) || e.getSource().equals(tit1.FMQ.table))
		{	int row ;
		TableModel model;
		if(e.getSource().equals(tit1.FQ.table))
			{
			System.out.println("tree123");
				row= tit1.FQ.table.getSelectedRow();
				model= tit1.FQ.table.getModel();
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FQ.dispose();
			}
		else
			{	
				row=tit1.FMQ.table.getSelectedRow();
				System.out.println("tree");
				model = tit1.FMQ.table.getModel();
				System.out.println("Yes!!");
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FMQ.dispose();
			}
		}
		if(e.getSource().equals(tit1.FQ.table_2) || e.getSource().equals(tit1.FMQ.table_2))
		{	int row ;
		TableModel model;
		if(e.getSource().equals(tit1.FQ.table_2))
			{
			System.out.println("tree123");
				row= tit1.FQ.table_2.getSelectedRow();
				model= tit1.FQ.table_2.getModel();
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FQ.dispose();
			}
		else
			{	
				row=tit1.FMQ.table_2.getSelectedRow();
				System.out.println("tree");
				model = tit1.FMQ.table_2.getModel();
				System.out.println("Yes!!");
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FMQ.dispose();
			}
		}
		if(e.getSource().equals(tit1.FQ.table_3) || e.getSource().equals(tit1.FMQ.table_3))
		{	int row ;
		TableModel model;
		if(e.getSource().equals(tit1.FQ.table_3))
			{
			System.out.println("tree123");
				row= tit1.FQ.table_3.getSelectedRow();
				model= tit1.FQ.table_3.getModel();
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FQ.dispose();
			}
		else
			{	
				row=tit1.FMQ.table_3.getSelectedRow();
				System.out.println("tree");
				model = tit1.FMQ.table_3.getModel();
				System.out.println("Yes!!");
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FMQ.dispose();
			}
		}
		if(e.getSource().equals(tit1.FQ.table_4) || e.getSource().equals(tit1.FMQ.table_4))
		{	
			int row ;
			TableModel model;
			if(e.getSource().equals(tit1.FQ.table_4))
				{
				System.out.println("tree123");
					row= tit1.FQ.table_4.getSelectedRow();
					model= tit1.FQ.table_4.getModel();
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FQ.dispose();
				}
			else
				{	
					row=tit1.FMQ.table_4.getSelectedRow();
					System.out.println("tree");
					model = tit1.FMQ.table_4.getModel();
					System.out.println("Yes!!");
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FMQ.dispose();
				}
		}
		if(e.getSource().equals(tit1.FQ.table_5) || e.getSource().equals(tit1.FMQ.table_5))
		{	int row ;
		TableModel model;
		if(e.getSource().equals(tit1.FQ.table_5))
			{
			System.out.println("tree123");
				row= tit1.FQ.table_5.getSelectedRow();
				model= tit1.FQ.table_5.getModel();
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FQ.dispose();
			}
		else
			{	
				row=tit1.FMQ.table_5.getSelectedRow();
				System.out.println("tree");
				model = tit1.FMQ.table_5.getModel();
				System.out.println("Yes!!");
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FMQ.dispose();
			}
		}
		if(e.getSource().equals(tit1.FQ.table_6) || e.getSource().equals(tit1.FMQ.table_6))
		{	int row ;
		TableModel model;
		if(e.getSource().equals(tit1.FQ.table_6))
			{
			System.out.println("tree123");
				row= tit1.FQ.table_6.getSelectedRow();
				model= tit1.FQ.table_6.getModel();
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FQ.dispose();
			}
		else
			{	
				row=tit1.FMQ.table_6.getSelectedRow();
				System.out.println("tree");
				model = tit1.FMQ.table_6.getModel();
				System.out.println("Yes!!");
				tit1.FVA.value = model.getValueAt(row, 0).toString();
			    tit1.FVA.setvalue(tit1.FVA.value);
			    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
			    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
				list.answersfetchrecords(tit1);
				tit1.FVA.setVisible(true);
				tit1.FMQ.dispose();
			}
		}
		if(e.getSource().equals(tit1.FQ.table_7) || e.getSource().equals(tit1.FMQ.table_7))
		{	
			int row ;
			TableModel model;
			if(e.getSource().equals(tit1.FQ.table_7))
				{
				System.out.println("tree123");
					row= tit1.FQ.table_7.getSelectedRow();
					model= tit1.FQ.table_7.getModel();
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FQ.dispose();
				}
			else
				{	
					row=tit1.FMQ.table_7.getSelectedRow();
					System.out.println("tree");
					model = tit1.FMQ.table_7.getModel();
					System.out.println("Yes!!");
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FMQ.dispose();
				}
		}
		if(e.getSource().equals(tit1.FQ.table_8) || e.getSource().equals(tit1.FMQ.table_8))
		{	
			int row ;
			TableModel model;
			if(e.getSource().equals(tit1.FQ.table_8))
				{
				System.out.println("tree123");
					row= tit1.FQ.table_8.getSelectedRow();
					model= tit1.FQ.table_8.getModel();
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FQ.dispose();
				}
			else
				{	
					row=tit1.FMQ.table_8.getSelectedRow();
					System.out.println("tree");
					model = tit1.FMQ.table_8.getModel();
					System.out.println("Yes!!");
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FMQ.dispose();
				}
		}
		if(e.getSource().equals(tit1.FQ.table_9) || e.getSource().equals(tit1.FMQ.table_9))
		{	
			int row ;
			TableModel model;
			if(e.getSource().equals(tit1.FQ.table_9))
				{
				System.out.println("tree123");
					row= tit1.FQ.table_9.getSelectedRow();
					model= tit1.FQ.table_9.getModel();
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FQ.dispose();
				}
			else
				{	
					row=tit1.FMQ.table_9.getSelectedRow();
					System.out.println("tree");
					model = tit1.FMQ.table_9.getModel();
					System.out.println("Yes!!");
					tit1.FVA.value = model.getValueAt(row, 0).toString();
				    tit1.FVA.setvalue(tit1.FVA.value);
				    tit1.FVA.lblQuestiontype.setText(tit1.FVA.tab);
				    tit1.FVA.lblQuestiondisplay.setText("<html>"+ tit1.FVA.value +"</html>");
					list.answersfetchrecords(tit1);
					tit1.FVA.setVisible(true);
					tit1.FMQ.dispose();
				}
		}	
		if(e.getSource().equals(tit1.NF.lblMyQuestions) )
		{
			list = new ConnectusList();
			try {System.out.println("lblmyques");
				list.AllMyQuestionfetchRecords(tit1.FMQ,tit1.txtroll.getText());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			tit1.FMQ.setVisible(true);
			tit1.NF.dispose();
			//copied
			//if(e.getSource().equals(tit1.NF.lblViewQuestions))
			//{
				tit1.NF.lblMyQuestions.setForeground(new Color(30, 144, 255));
			//}
		
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource().equals(tit1.lblAbout)) {
			tit1.lblAbout.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblMobile)) {
			tit1.lblMobile.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblFeedback)) {
			tit1.lblFeedback.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblDevelopers)) {
			tit1.lblDevelopers.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblGuidelines)) {
			tit1.lblGuidelines.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblReportAbuse)) {
			tit1.lblReportAbuse.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblHelpCentre)) {
			tit1.lblHelpCentre.setForeground(Color.cyan);
		}
		if (e.getSource().equals(tit1.lblContactUs)) {
			tit1.lblContactUs.setForeground(Color.cyan);
		}
		if(e.getSource().equals(tit1.lblAbout))
		{
			tit1.lblAbout.setForeground(Color.cyan);
		}
		if(e.getSource().equals(tit1.lblGuidelines))
		{
			tit1.lblGuidelines.setForeground(Color.cyan);
		}
		if(e.getSource().equals(tit1.FQ.lblHome))
		{
			tit1.FQ.lblHome.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FQ.lblLogout))
		{
			tit1.FQ.lblLogout.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FQ.lblProfile))
		{
			tit1.FQ.lblProfile.setForeground(Color.white);
		}
		if (e.getSource().equals(tit1.NF.lblProfile) || e.getSource().equals(tit1.FP.lblProfile)
				|| e.getSource().equals(tit1.FPD.lblProfile)) {
			tit1.NF.lblProfile.setForeground(Color.white);
			tit1.FP.lblProfile.setForeground(Color.white);
			tit1.FPD.lblProfile.setForeground(Color.white);

		}
		if (e.getSource().equals(tit1.FP.lblHome) || e.getSource().equals(tit1.NF.lblHome)
				|| e.getSource().equals(tit1.FPD.lblHome)) {
			tit1.FP.lblHome.setForeground(Color.white);
			tit1.NF.lblHome.setForeground(Color.white);
			tit1.FPD.lblHome.setForeground(Color.white);
		}
		if (e.getSource().equals(tit1.FP.lblLogout) || e.getSource().equals(tit1.NF.lblLogout)
				|| e.getSource().equals(tit1.FPD.lblLogout)) {
			tit1.FP.lblLogout.setForeground(Color.white);
			tit1.NF.lblLogout.setForeground(Color.white);
			tit1.FPD.lblLogout.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.NF.lblViewQuestions))
		{
			tit1.NF.lblViewQuestions.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FVA.label_1))
		{
			tit1.FVA.label_1.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FVA.label_11))
		{
			tit1.FVA.label_11.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FVA.label_5))
		{
			tit1.FVA.label_5.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.NF.lblMyQuestions))
		{
			tit1.NF.lblMyQuestions.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FMQ.lblHome))
		{
			tit1.FMQ.lblHome.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FMQ.lblProfile))
		{
			tit1.FMQ.lblProfile.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FMQ.lblLogout))
		{
			tit1.FMQ.lblLogout.setForeground(Color.white);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{

		if (e.getSource().equals(tit1.lblAbout)) {
			tit1.lblAbout.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblMobile)) {
			tit1.lblMobile.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblFeedback)) {
			tit1.lblFeedback.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblDevelopers)) {
			tit1.lblDevelopers.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblGuidelines)) {
			tit1.lblGuidelines.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblReportAbuse)) {
			tit1.lblReportAbuse.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblHelpCentre)) {
			tit1.lblHelpCentre.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblContactUs)) {
			tit1.lblContactUs.setForeground(Color.WHITE);
		}
		
		if (e.getSource().equals(tit1.NF.lblProfile) || e.getSource().equals(tit1.FP.lblProfile)
				|| e.getSource().equals(tit1.FPD.lblProfile)) {
			/*
			 * tit1.NF.lblProfile.setForeground(new Color(30,144,255));
			 * tit1.FP.lblProfile.setForeground(new Color(30,144,255));
			 * tit1.FPD.lblProfile.setForeground(new Color(30,144,255));
			 */
			tit1.NF.lblProfile.setForeground(new Color(30, 144, 255));
			tit1.FP.lblProfile.setForeground(new Color(30, 144, 255));
			tit1.FPD.lblProfile.setForeground(new Color(30, 144, 255));
		}
		if (e.getSource().equals(tit1.FP.lblHome) || e.getSource().equals(tit1.NF.lblHome)
				|| e.getSource().equals(tit1.FPD.lblHome)) {
			tit1.FP.lblHome.setForeground(new Color(30, 144, 255));
			tit1.NF.lblHome.setForeground(new Color(30, 144, 255));
			tit1.FPD.lblHome.setForeground(new Color(30, 144, 255));
		}
		if (e.getSource().equals(tit1.FP.lblLogout) || e.getSource().equals(tit1.NF.lblLogout)
				|| e.getSource().equals(tit1.FPD.lblLogout)) {
			tit1.FP.lblLogout.setForeground(new Color(30, 144, 255));
			tit1.NF.lblLogout.setForeground(new Color(30, 144, 255));
			tit1.FPD.lblLogout.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.lblAbout))
		{
			tit1.lblAbout.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.lblGuidelines))
		{
			tit1.lblGuidelines.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FQ.lblHome))
		{
			tit1.FQ.lblHome.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FQ.lblLogout))
		{
			tit1.FQ.lblLogout.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FQ.lblProfile))
		{
			tit1.FQ.lblProfile.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.NF.lblViewQuestions))
		{
			tit1.NF.lblViewQuestions.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FVA.label_1))
		{
			tit1.FVA.label_1.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FVA.label_11))
		{
			tit1.FVA.label_11.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FVA.label_5))
		{
			tit1.FVA.label_5.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.NF.lblMyQuestions))
		{
			tit1.NF.lblMyQuestions.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FMQ.lblHome))
		{
			tit1.FMQ.lblHome.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FMQ.lblProfile))
		{
			tit1.FMQ.lblProfile.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FMQ.lblLogout))
		{
			tit1.FMQ.lblLogout.setForeground(new Color(30, 144, 255));
		}
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		if (e.getSource().equals(tit1.lblAbout)) {
			tit1.lblAbout.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblMobile)) {
			tit1.lblMobile.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblFeedback)) {
			tit1.lblFeedback.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblDevelopers)) {
			tit1.lblDevelopers.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblGuidelines)) {
			tit1.lblGuidelines.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblReportAbuse)) {
			tit1.lblReportAbuse.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblHelpCentre)) {
			tit1.lblHelpCentre.setForeground(Color.WHITE);
		}
		if (e.getSource().equals(tit1.lblContactUs)) {
			tit1.lblContactUs.setForeground(Color.WHITE);
		}
		
		if (e.getSource().equals(tit1.NF.lblProfile) || e.getSource().equals(tit1.FP.lblProfile)
				|| e.getSource().equals(tit1.FPD.lblProfile)) {
			/*
			 * tit1.NF.lblProfile.setForeground(new Color(30,144,255));
			 * tit1.FP.lblProfile.setForeground(new Color(30,144,255));
			 * tit1.FPD.lblProfile.setForeground(new Color(30,144,255));
			 */
			tit1.NF.lblProfile.setForeground(new Color(30, 144, 255));
			tit1.FP.lblProfile.setForeground(new Color(30, 144, 255));
			tit1.FPD.lblProfile.setForeground(new Color(30, 144, 255));
		}
		if (e.getSource().equals(tit1.FP.lblHome) || e.getSource().equals(tit1.NF.lblHome)
				|| e.getSource().equals(tit1.FPD.lblHome)) {
			tit1.FP.lblHome.setForeground(new Color(30, 144, 255));
			tit1.NF.lblHome.setForeground(new Color(30, 144, 255));
			tit1.FPD.lblHome.setForeground(new Color(30, 144, 255));
		}
		if (e.getSource().equals(tit1.FP.lblLogout) || e.getSource().equals(tit1.NF.lblLogout)
				|| e.getSource().equals(tit1.FPD.lblLogout)) {
			tit1.FP.lblLogout.setForeground(new Color(30, 144, 255));
			tit1.NF.lblLogout.setForeground(new Color(30, 144, 255));
			tit1.FPD.lblLogout.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.lblAbout))
		{
			tit1.lblAbout.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.lblGuidelines))
		{
			tit1.lblGuidelines.setForeground(Color.white);
		}
		if(e.getSource().equals(tit1.FQ.lblHome))
		{
			tit1.FQ.lblHome.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FQ.lblLogout))
		{
			tit1.FQ.lblLogout.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FQ.lblProfile))
		{
			tit1.FQ.lblProfile.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.NF.lblViewQuestions))
		{
			tit1.NF.lblViewQuestions.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FVA.label_1))
		{
			tit1.FVA.label_1.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FVA.label_11))
		{
			tit1.FVA.label_11.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FVA.label_5))
		{
			tit1.FVA.label_5.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.NF.lblMyQuestions))
		{
			tit1.NF.lblMyQuestions.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FMQ.lblHome))
		{
			tit1.FMQ.lblHome.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FMQ.lblProfile))
		{
			tit1.FMQ.lblProfile.setForeground(new Color(30, 144, 255));
		}
		if(e.getSource().equals(tit1.FMQ.lblLogout))
		{
			tit1.FMQ.lblLogout.setForeground(new Color(30, 144, 255));
		}
	}
//MouseMotion Listener

	@Override
	public void mouseDragged(MouseEvent e) {
	}

@Override
public void mouseMoved(MouseEvent e) 
{
	
	}

	

	
}
