package Programs;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//program is to find a number is even or odd
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col%2==0)
				{
					System.out.print("0 ");
					
				}
				else
				{
					System.out.print("1 ");
				}
					
			}
			System.out.println("\n");
		}
		

	}

	
}

