package day_12;

public class Box {
	
	//Constructor overloading
	
	double width,height,depth;
	Box()
	{
		width=height=depth=0;
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(double l){
		width=height=depth=l;
	}
	double volume() {
		return width*height*depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		Box b1=new Box(10,20.5,30.4);
//		double d=b1.volume();
		Box b2=new Box(56);
		//System.out.println(d);
		System.out.println(b2.volume());
	}

}
