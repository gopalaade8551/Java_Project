package day_12;

public class accountmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1=new Account();
		acc1.setaccno(100);
		int acno=acc1.getaccno();
		System.out.println(acno);
		
		acc1.setaccno(400);
		
		System.out.println(acc1.getaccno());
	}

}
