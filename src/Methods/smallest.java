package Methods;

import java.util.Scanner;

class smallest
{
  int a,b,c;
  
  public void small(int a,int b,int c)
  {
    if(a<b && a<c)
    {
      System.out.println("the smallest among "+a +" and"+b+", "+c+" is "+a);
      
    }
    else if (b<c && b<c)
        {
          System.out.println("the smallest among "+a +" and"+b+","+c+" is "+b);
        }
   
    else { 
    System.out.println("the smallest among "+a +" and"+b+","+c+" is "+c); 
    } 
  
  }
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("the the value of a");
	 int a=sc.nextInt();
	 System.out.println("the the value of b");
	 int b=sc.nextInt();
	 System.out.println("the the value of c");
	 int c=sc.nextInt();
	  
	  
    smallest s1=new smallest();
    s1.small(a,b,c);
  }
}