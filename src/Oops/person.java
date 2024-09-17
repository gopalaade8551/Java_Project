package Oops;

public class person {
	
	private int age;
	private String name;

	public person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}
	public void getname()
	{
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person p1=new person(12,"rajesh");
		person p2=new person(15,"suresh");
		
		p1.getname();

	}
	
	

}
