package Day_11_methods_constructor;



public class Contsructor {
	
	
	int x,y;
	 Contsructor(){
		 
		 
	 }
	 Contsructor(int a,int b)
	 {
		 int x=a;
		 int y=b;
	 }
	 void Sum()
	 {
		 System.out.println(x+y);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contsructor cd=new Contsructor(); default constructor
		
		Contsructor cd=new Contsructor(1,20);
		cd.Sum();
		

	}

}
