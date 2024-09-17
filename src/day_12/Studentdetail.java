package day_12;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Studentdetail {
	
	int id,passoutyear;
	String name,contactno,collegename;
	
	Studentdetail(String contactno,String collegename,int passoutyear)
	{
		this.contactno=contactno;
		this.collegename=collegename;
		this.passoutyear=passoutyear;
	}
	Studentdetail(int id,String name)
	{
		
	
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentdetail s=new Studentdetail(10,"dinesh");
		System.out.println("the student details are ");
		System.out.println("name "+s.name+" id"+s.id+"");
		System.out.println("passoutyear "+s.passoutyear+" colleganame "+s.collegename);
		

	}

}
