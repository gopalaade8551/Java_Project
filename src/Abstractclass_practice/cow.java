package Abstractclass_practice;

public abstract class cow implements Animal {
	
	//partial implementation of methods
	public void sound()
	{
		System.out.println("the animal makes sound");
	}
	public void run()
	{
		System.out.println("the animals run");
	}
	
	public abstract void  eat();
	public abstract void sleep();
	

}
