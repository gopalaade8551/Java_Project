package Part_33;

class Gaust {
	
int a=10;
public void read()
{
	 System.out.println("Read my code");
}

}

class developer extends Gaust
{
	 int b=30;
	
	 public void write()
	 {
		 System.out.println("write my code");
	 }
	 
}
class admin extends developer{
	
	 int c=40;
	
	 public void manage()
	 {
		 System.out.println("manage my code");
		 
	 }
}

public class Gaust1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaust g=new Gaust();
		System.out.println(g.a);
		g.read();
	developer d=new developer();
     System.out.println(d.b);
     d.write();
     d.read();
     admin a=new admin();
     System.out.println(a.c);
     a.manage();
     a.read();
     a.write();
     

	}

}
