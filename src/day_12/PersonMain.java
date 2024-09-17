package day_12;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		p1.setage(22);
	
		int age=p1.getage();
		
		System.out.println(age);
		p1.setname("gopal");
		String name=p1.getname();
		System.out.println(name);
		
		p2.setage(24);
		
		int age2=p2.getage();
		
		System.out.println(age2);
		p1.setname("ajay");
		String name2=p2.getname();
		System.out.println(name2);
		

	}

}
