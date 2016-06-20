package com.connectUS;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.GUI.FrameMyquestions;
import com.GUI.FrameNewsfeed;
import com.GUI.FrameProfileDisplay;
//import com.GUI.TittleFrame;
import com.GUI.FrameQuestions;
import com.GUI.Frameviewandgiveanswer;
import com.GUI.MyCellRenderer;

//import connection.StudentConnection;
import net.proteanit.sql.DbUtils;
//import student_gui.gui.StudentDisplayGUI;




public class ConnectusList
{
	//Edited
			TittleFrame tit = new TittleFrame();
			public FrameProfileDisplay FPD = new FrameProfileDisplay();
	        ModelConnect M;
	        ArrayList<ModelConnect> list = new ArrayList<ModelConnect>();
		static	int t=0;		
	public ArrayList<ModelConnect> fetchRecords(String RollNo,FrameProfileDisplay FPD) throws SQLException, Exception
	{
		//Fetch Records from Database
		
		//STEP 4: Execute a query
	   System.out.println("Creating statement...and Jumping to Connection Package");
	   Connection conn = connection.getConnection();
	   // Connection conn = connection.getConnection("jdbc:mysql://localhost:3306/auconnect?autoReconnect=true&useSSL=false", "root", "root");
	   Statement stmt = conn.createStatement();
	   String sql;
	   
	   sql = "SELECT * FROM tbl_studprofile WHERE RollNo = "+RollNo;
	   ResultSet rs = stmt.executeQuery(sql);

	   //STEP 5: Extract data from result set
	   while(rs.next())
	   {
	      //Retrieve by each query by column name
		   
	      //the Parameter in get() is the name of the Column in the SQL DATABASE
	      String listrollno = rs.getString("RollNo");
	      String listpassword = rs.getString("Password");
	      String listname = rs.getString("Name");
	      String listcity = rs.getString("CurrentCity");
	      String listclg = rs.getString("College");
	      String listhome = rs.getString("HomeTown");
	      String listdob = rs.getString("DOB");
	      String listsex = rs.getString("Sex");			//possibility of error
	      String listinterests = rs.getString("Interests");
	      String listcnct = rs.getString("ContactNo");
	      String listexp = rs.getString("Experiences");
	      //String listpost = rs.getString("post");
	      System.out.println(listrollno + " " + listpassword + " " +  listname + " " + listcity + " " + listclg + " " + listhome + " " + listsex + " " + listdob + " " + listinterests + " " + listcnct + " " + listexp);

	      
	      //Adding the Retrieved info into the ArrayList of TYPE-ModelConnect
	      FPD.labelnamedisplay.setText(listname);
      	FPD.lblDisplaycc.setText(listcity);
      	FPD.labeldisplayskills.setText(listinterests);
      	FPD.labeleducationdetails.setText(listclg);
      	FPD.lblDisplathometown.setText(listhome);
      	FPD.lblDisplaysex.setText(listsex);
      	FPD.lblDisplayDOB.setText(listdob);
      	FPD.lblDisplayea.setText(listexp);
      	FPD.lblContactdissplay.setText(listcnct);
	      list.add(new ModelConnect(listrollno, listpassword, listname, listcity, listclg, listhome, listsex, listdob, listinterests, listcnct, listexp));
	      
	      System.out.println(listrollno + " " + listpassword + " " +  listname + " " + listcity + " " + listclg + " " + listhome + " " + listsex + " " + listdob + " " + listinterests + " " + listcnct + " " + listexp);
	   }
	   return list;
		
	
	}
	public void AllQuestionfetchRecords(FrameQuestions S) throws SQLException, Exception
	{	
		
		//newFormentDisplayGUI S = new newFormentDisplayGUI(listener);
			Connection conn = null;
			try {
				System.out.println("fetch");
				conn = connection.getConnection();
				Statement stmt = null;
				stmt = conn.createStatement();
				String sql1, sql2;
				
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='1';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_1.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='2';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_2.setModel(DbUtils.resultSetToTableModel(rs));
				
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='3';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='4';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
			//	ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_6.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='5';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_7.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='6';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_8.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='7';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_9.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='8';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_5.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='9';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_4.setModel(DbUtils.resultSetToTableModel(rs));
				sql1 = "select tbl_questions.Questions from tbl_qtype,tbl_questions,tbl_studprofile where  tbl_questions.RollNo=tbl_studprofile.RollNo and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='10';";
				//sql2 = "alter table tbl_questions modify Questions char(100);";
				//ResultSet rs;
				rs = stmt.executeQuery(sql1);
				//rs = stmt.executeQuery(sql2);
				S.table_3.setModel(DbUtils.resultSetToTableModel(rs));
				S.table.setRowHeight(25);
				S.table_1.setRowHeight(25);
				S.table_2.setRowHeight(25);
				S.table_3.setRowHeight(25);
				S.table_4.setRowHeight(25);
				S.table_5.setRowHeight(25);
				S.table_6.setRowHeight(25);
				S.table_7.setRowHeight(25);
				S.table_8.setRowHeight(25);
				S.table_9.setRowHeight(25);
				//
				//S.table_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
				//rs = stmt.executeQuery(sql2);
				//S.table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (ClassNotFoundException | SQLException err) {
				// TODO Auto-generated catch block
				err.printStackTrace();
			}
		 
	}
	public void AllMyQuestionfetchRecords(FrameMyquestions FMQ,String roll) throws SQLException, Exception
	{	
		
		//newFormentDisplayGUI S = new newFormentDisplayGUI(listener);
			Connection conn = null;
			try {
				System.out.println("fetching my questions");
				conn = connection.getConnection();
				Statement stmt = null;
				stmt = conn.createStatement();
				String sql1;
				System.out.println("roll: "+tit.txtroll.getText()+" Int: ");//roll);
				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='1';";
				ResultSet rs;
				rs = stmt.executeQuery(sql1);
				FMQ.table_1.setModel(DbUtils.resultSetToTableModel(rs));
				
				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='2';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_2.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='3';";
				rs = stmt.executeQuery(sql1);
				FMQ.table.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='4';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_6.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='5';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_7.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='6';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_8.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='7';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_9.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='8';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_5.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='9';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_4.setModel(DbUtils.resultSetToTableModel(rs));

				sql1 = "select tbl_questions.Questions from tbl_questions,tbl_qtype where  tbl_questions.RollNo='" + roll + "' and tbl_qtype.QtypeNo=tbl_questions.QtypeNo and tbl_qtype.QtypeNo='10';";
				rs = stmt.executeQuery(sql1);
				FMQ.table_3.setModel(DbUtils.resultSetToTableModel(rs));
				
				FMQ.table.setRowHeight(25);
				FMQ.table_1.setRowHeight(25);
				FMQ.table_2.setRowHeight(25);
				FMQ.table_3.setRowHeight(25);
				FMQ.table_4.setRowHeight(25);
				FMQ.table_5.setRowHeight(25);
				FMQ.table_6.setRowHeight(25);
				FMQ.table_7.setRowHeight(25);
				FMQ.table_8.setRowHeight(25);
				FMQ.table_9.setRowHeight(25);
				//
				//S.table_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
				//rs = stmt.executeQuery(sql2);
				//S.table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (ClassNotFoundException | SQLException err) {
				// TODO Auto-generated catch block
				err.printStackTrace();
			}
	}
	public void answersfetchrecords(TittleFrame tit)
	{	
		Connection conn = null;
		try 
		{	int j=0;
			System.out.println("fetch");
			conn = connection.getConnection();
			Statement stmt = null;
			stmt = conn.createStatement();
			String sql1, sql2,output = null;
			String q = tit.FVA.getvalue();
			q=tit.FVA.getvalue();
			for(int i=0;i<q.length();i++)
			{
				if(q.charAt(i) == '\'' && q.charAt(i+1)!='\'')
				{
					output = q.substring(0, i) + "\'" + q.substring(i);	
					j++;
				}
				else if(q.charAt(i) == '\\' && q.charAt(i+1)!='\\')
				{
					output = q.substring(0, i) + "\\" + q.substring(i);	
					j++;
				}
			}
			if(j==0)
				output=q;
			
			sql2 = "select tbl_questions.QNo from tbl_questions where tbl_questions.Questions = "+"'"+output+"'";
			System.out.println("question: "+tit.FVA.getvalue());
			ResultSet rs1 = null;
			
			rs1 = stmt.executeQuery(sql2);
			rs1.next();
			String Qno = rs1.getString("QNo");
			System.out.println(Qno);
			sql1 = "select tbl_studprofile.RollNo,tbl_studprofile.Name,tbl_answers.Answer from tbl_answers,tbl_qtype,tbl_questions,tbl_studprofile where tbl_answers.QNo = tbl_questions.QNo and tbl_answers.QNo = '"+Qno+"' and tbl_answers.ID=tbl_studprofile.RollNo and tbl_qtype.Qtype='"+tit.FVA.gettab()+"'";
			//sql2 = "alter table tbl_questions modify Questions char(100);";
			ResultSet rs2;
			rs2 = stmt.executeQuery(sql1);
			
			//rs = stmt.executeQuery(sql2);
			tit.FVA.table.setModel(DbUtils.resultSetToTableModel(rs2));
			tit.FVA.table.getColumnModel().getColumn(2).setCellRenderer(new MyCellRenderer());
		}
		catch (ClassNotFoundException | SQLException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}
		
	}
	public void question(FrameNewsfeed NF,String Roll)
	{	
		Connection conn = null;
		try 
		{
			conn = connection.getConnection();
			Statement stmt = null;
			stmt = conn.createStatement();
			String que = NF.PostDoubtTextarea.getText();
			String roll = Roll;
			String sql,q,output=null;
			int type = (NF.comboBoxField.getSelectedIndex()+1),j=0;
			q=que;
			for(int i=0;i<q.length();i++)
			{
				if(q.charAt(i) == '\'' && q.charAt(i+1)!='\'')
				{
					output = q.substring(0, i) + "\'" + q.substring(i);	
					j++;
				}
				else if(q.charAt(i) == '\\' && q.charAt(i+1)!='\\')
				{
					output = q.substring(0, i) + "\\" + q.substring(i);	
					j++;
				}
			}
			if(j==0)
				output=q;
			System.out.println("Output: "+output);
			
			sql = "INSERT INTO auconnect.tbl_questions (`RollNo`, `QtypeNo`, `Questions`, `TimeStamp`) VALUES('"+Integer.parseInt(roll)+"','"+Integer.toString(type)+"','"+ output+"','1') ;";
			int rs;
			rs = stmt.executeUpdate(sql);
			System.out.println("Question Posted: "+sql);
		}
		catch (ClassNotFoundException | SQLException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}
	
	}
	public void answers(TittleFrame tit)
	{
		Connection conn = null;
		try 
		{	conn = connection.getConnection();
			Statement stmt = null;
			stmt = conn.createStatement();
			
			int type = (tit.NF.comboBoxField.getSelectedIndex()+1);
			String roll = tit.txtroll.getText();
			String sql,sql2,q,output=null;
			int j=0;
			q=tit.FVA.getvalue();
			for(int i=0;i<q.length();i++)
			{
				if(q.charAt(i) == '\'' && q.charAt(i+1)!='\'')
				{
					output = q.substring(0, i) + "\'" + q.substring(i);	
					j++;
				}
				else if(q.charAt(i) == '\\' && q.charAt(i+1)!='\\')
				{
					output = q.substring(0, i) + "\\" + q.substring(i);	
					j++;
				}
			}
			if(j==0)
				output=q;
			
			sql2 = "select tbl_questions.QNo from tbl_questions where tbl_questions.Questions = "+"'"+output+"'";
			output=null;
			q=null;
			j=0;
			ResultSet rs1 = null;
			rs1 = stmt.executeQuery(sql2);
			
			System.out.println("question: "+tit.FVA.getvalue());
			String ans = tit.FVA.textArea.getText();
			q=ans;
			for(int i=0;i<q.length();i++)
			{
				if(q.charAt(i) == '\'' && q.charAt(i+1)!='\'')
				{
					output = q.substring(0, i) + "\'" + q.substring(i);	
					j++;
				}
				else if(q.charAt(i) == '\\' && q.charAt(i+1)!='\\')
				{
					output = q.substring(0, i) + "\\" + q.substring(i);	
					j++;
				}
			}
			if(j==0)
				output=q;
			System.out.println("Output: "+output);
			rs1.next();
			String Qno = rs1.getString("QNo");
			System.out.println(Qno);
			sql = "INSERT INTO auconnect.tbl_answers (`ID`, `QNo`, `Answer`, `TimeStamp`) VALUES('"+Integer.parseInt(roll)+"','"+Qno+"','"+ output+"','1') ;";
			int rs;
			rs = stmt.executeUpdate(sql);
			System.out.println("Question Posted: "+sql);
		}
		catch (ClassNotFoundException | SQLException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}
	}
	//Method to add new Records which Throws Exceptions 
	
	public void login(ModelConnect newLog)throws SQLException, Exception
	{
		System.out.println("\n Inside Login Function");
		
		//STEP 4: Execute a query
		   System.out.println("Creating statement...");
		   Connection conn = connection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   
		   sql = " 			 ";
		
		
		
	}
	public void addRecord(ModelConnect newStudent) throws SQLException, Exception
	{
		System.out.println("\n Inside addRecord() ");
		
		//STEP 4: Execute a query
		   System.out.println("Creating statement...");
		   Connection conn = connection.getConnection();
		   Statement stmt = conn.createStatement();
		   //System.out.println(" names "+newStudent.getName()+" sex: "+ newStudent.getSex()+" DOB :"+ newStudent.getDob());
		   String sql,sql1;
		   System.out.println("('"+  newStudent.getRollno()   +"', '"+     newStudent.getPassword()      +"', '"+   newStudent.getName()    +"', '"+		newStudent.getCity()	+"', '"+	newStudent.getEdu()	+"', '"+	newStudent.getHome()	+"', '"+	newStudent.getDob()	+"', '"+	newStudent.getSex() 	+"', '"+	newStudent.getSkils()	+"', '"+	newStudent.getPh()	+"', '"+	newStudent.getExp()	+"',");
		   
	   		//list=fetchRecords(newStudent.getRollno());
	   		
	   		
		   try
		   {	
			   	if(t==0)
			   	{
			   		sql1 = "SELECT Counter FROM tbl_studprofile WHERE RollNo = " +newStudent.getRollno();
			   		try
			   		{	
			   			ResultSet rs1 = stmt.executeQuery(sql1);
			   			String counter = rs1.getString("Counter");
			   		}
			   		catch(SQLException e1)
			   		{
			   			if(e1.getMessage().equals("Before start of result set"))
			   			{
			   				
			   			}
			   			else
			   				throw e1;
			   		}
			   	
			   	//;
			   //	if(rs1.next())
			   	
			   		
			   		
			   	}
			   	
			   //if(counter.equals("0"))
			   {
				   sql = "		UPDATE `auconnect`.`tbl_studprofile` SET `Name`='"+	newStudent.getName()	+"', `CurrentCity`='"+		newStudent.getCity()	+"', `College`='"+newStudent.getEdu()	+"', `HomeTown`='"+	newStudent.getHome()	+"', `DOB`='"+	newStudent.getDob()	+"', `Sex`='"+	newStudent.getSex()	+"', `Interests`='"+	newStudent.getSkils()	+"', `ContactNo`='"+	newStudent.getPh()	+"', `Experiences`='"+ newStudent.getExp() +"' WHERE `RollNo`='"+	newStudent.getRollno()	+"'  ";

			   }
			  /* else
			   {
				   sql = "		UPDATE `auconnect`.`tbl_studprofile` SET `name`='"+	newStudent.getName()	+"', `city`='"+		newStudent.getCity()	+"', `edu`='"+newStudent.getEdu()	+"', `home`='"+	newStudent.getHome()	+"', `sex`='"+	newStudent.getDob()	+"', `dob`='"+	newStudent.getSex()	+"', `skills`='"+	newStudent.getSkils()	+"', `ph`='"+	newStudent.getPh()	+"', `exp`='"+ newStudent.getExp() +"' WHERE `rollno`='"+	newStudent.getRollno()	+"'  ";
			   }
				  */ 
			   System.out.println("\nsql: " + sql);
			   stmt.execute(sql);
		   }
		   catch(SQLException e)
		   {	t++;
			   System.out.println(e);
	   		   System.out.println("msg: "+e.getMessage());
			   sql = "	INSERT INTO `auconnect`.`tbl_studprofile` VALUES ('"+  newStudent.getRollno()   +"', '"+     newStudent.getPassword()      +"', '"+   newStudent.getName()    +"', '"+		newStudent.getCity()	+"', '"+	newStudent.getEdu()	+"', '"+	newStudent.getHome()	+"', '"+	newStudent.getDob()	+"', '"+	newStudent.getSex() 	+"', '"+	newStudent.getSkils()	+"', '"+	newStudent.getPh()	+"', '"+	newStudent.getExp()	+"', '1' )	";
			   System.out.println("\nsql: " + sql);
			   stmt.execute(sql);
			   System.out.println("\n Adding Record Query executed Successfully");
		   }
		   
		    
	
	}
	
	public void updateRecord(ModelConnect modStudent) throws SQLException, Exception
	{
		System.out.println("\n Inside addRecord() ");
		
		//STEP 4: Execute a query
		   System.out.println("Creating statement...");
		   
		   Connection conn = connection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   
		   
		   sql = "		UPDATE `auconnect`.`tbl_studprofile` SET `name`='"+	modStudent.getName()	+"', `city`='"+		modStudent.getCity()	+"', `edu`='"+modStudent.getEdu()	+"', `home`='"+	modStudent.getHome()	+"', `sex`='"+	modStudent.getDob()	+"', `dob`='"+	modStudent.getSex()	+"', `skills`='"+	modStudent.getSkils()	+"', `ph`='"+	modStudent.getPh()	+"', `exp`='"+ modStudent.getExp() +"' WHERE `rollno`='"+	modStudent.getRollno()	+"'  ";
		   
		   

		   System.out.println("\n sql: " + sql);
		   stmt.execute(sql);
		   
		   System.out.println("\n Modified Query executed Successfully");
		   
	}
	
	public void searchRecord(ModelConnect srcStudent)throws SQLException, Exception
	{
		System.out.println("\n Inside searchRecord() ");
		
		//STEP 4: Execute a query
		   System.out.println("Creating statement...");
		   
		   Connection conn = connection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   //srcStudent.getRollnosrc()
		   System.out.println("roll no. : "+srcStudent.getRollnosrc());
		   sql = "	SELECT *FROM `auconnect`.`tbl_studprofile` WHERE `rollno` = '"+srcStudent.getRollnosrc()+"'";
		
		   System.out.println("\nsql: " + sql);
		   ResultSet rs=stmt.executeQuery(sql);
		   while(rs.next())
		   {
			   String s1 = rs.getString("name");
			   System.out.println(s1);
			   String s2 = rs.getString("rollno");
			   String s3 = rs.getString("city");
			   String s4 = rs.getString("edu");
			   String s5 = rs.getString("home");
			   String s6 = rs.getString("sex");
			   String s7 = rs.getString("dob");
			   String s8 = rs.getString("skills");
			   String s9 = rs.getString("ph");
			   String s10 = rs.getString("exp");
			   
			   System.out.println(s1);
			   System.out.println(s2);
			   System.out.println(s3);
			   System.out.println(s4);
			   System.out.println(s5);
			   System.out.println(s6);
			   System.out.println(s7);
			   System.out.println(s8);
			   System.out.println(s9);
			   System.out.println(s10);
			   
			   
			   //s1,s2,s3,s4,...... all have the value fetched from the SQL table --->  Print all of in GUI LABEL wise (then contact PRASANN)
		   }
		   System.out.println("\n Searching Record Query executed Successfully");
		
	}
	
	
}