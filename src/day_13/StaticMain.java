package day_13;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo s=new StaticDemo();
		//System.out.println(a);

       System.out.println(StaticDemo.a);
      StaticDemo.m1();
    System.out.println(s.b);
    
    
    //Public static void main(String[] args)---valid
    //static public void main(String[] args)---valid
    //public void static main(string[] args)--invalid
    //void main (String[] args) public static--invalid
    //Public static void main(int a[])//valid
	

	}
}

