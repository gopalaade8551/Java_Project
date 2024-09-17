package day_12;

public class Account {
	
	
	//Wrapping the variables and methods together
	//all the variable should be private
	//for every variable there should be 2 methods
	//variables can be operated only through methods.
	
	
	
	private int accno;
	private String name;
	private double amount;
	
	void setaccno(int accnum)
	{
		accno=accnum;
	}
	int getaccno()
	{
		return accno;
	}
}
