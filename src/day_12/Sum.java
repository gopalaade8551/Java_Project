package day_12;

public class  Sum {
	
	
	int a;
	int b;
	int c;
	int d;
	Sum()
	{
		a=b=c=0;
	}
	Sum(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Sum(int a,int b,int c,int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	int marks()
	{
		return (a+b+c)/3;
	}
	int marks(int x)
	{
		return (a+b+c+d)/4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s1=new Sum(10,20,30);
		double d=s1.marks();
		System.out.println(d);
		Sum s2=new Sum(52,86,836,8);
		double d2=s2.marks(0);
		System.out.println(d2);

	}

}
