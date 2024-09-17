package Oops;

public class student {

	int sid;
	String sname;
	String sgrade;
	
	void printstudentdata()
	{
		System.out.println(sid+" "+sname+" "+sgrade);
	}
	void setstudentdata(int id,String name,String grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}
	student(int id,String name,String grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}
	

}


