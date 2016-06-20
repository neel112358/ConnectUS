package com.connectUS;

public class ModelConnect 
{
	private String rollno;
	private String password;	//Includes AlphaNumeric Character
	private String name;
	private String city;
	private String edu;
	private String home;
	private String sex;
	private String dob;  //only of the type YYYY-MM-DD 
	private String skils; 
	private String ph;     //Corresponding datatype in MYSQUL is BIGINT()
	private String exp;	//Experience 
	private String post;	//Doubt Asked
	
	public int Count=0;
	
	private String rollnosrc;
	
	//ModelConnect()
	//{}
	
	
	public ModelConnect(String Roll)
	{
	
		this.setRollnosrc(Roll);
	}
	
	public ModelConnect(String Rollno, String Password, String Name,String City,String Edu,String Home,String Sex,String Dob,String Skills,String Ph,String Exp)
	{
		this.setRollno(Rollno);
		this.setPassword(Password);
		this.setName(Name);
		this.setCity(City);
		this.setEdu(Edu);
		this.setHome(Home);
		this.setSex(Sex);
		this.setDob(Dob);
		this.setSkils(Skills);
		this.setPh(Ph);
		this.setExp(Exp);
		//this.setPost(Post);
		
		Count++;
		
	}

	//getter setter for constructor with 1 pera meter 
	
	
	public String getRollnosrc() {
		return rollnosrc;
	}

	public void setRollnosrc(String rollnosrc) {
		this.rollnosrc = rollnosrc;
	}

	
	
	//Creating Getters and Setters
	
	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno2) {
		this.rollno = rollno2;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex2) {
		this.sex = sex2;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSkils() {
		return skils;
	}

	public void setSkils(String skils) {
		this.skils = skils;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph2) {
		this.ph = ph2;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
}