package day_35_Encapsulation;

public class Student {
  private	int Rollno;
  private String name;
  private Boolean isattandance;
	
	public Student(int Rollno)
	{
		this.Rollno=Rollno;
	}
	
	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Setisattandance(Boolean flag)
	{
		isattandance=flag;
	}
	public Boolean Getisattandance()
	{
		System.out.println("the attandance of the student is ");
		System.out.println(Rollno);
		return isattandance;
	}
	

}
