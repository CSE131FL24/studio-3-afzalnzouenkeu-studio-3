package studio3;

import java.util.Scanner;

public class Sieve 
{

	public static void main(String[] args) 
	{
	  Scanner reader = new Scanner(System.in);
	  System.out.println("What is your max Number?");
	  int n = reader.nextInt();
	  int [] array = new int [n];
	  boolean [] values = new boolean[n];
	  for (int a = 0; a < values.length; a ++)
	  {
		  values[a] = true;
	  }
	  array[0] = 1;
	  for (int i = 2; i < n; i++)
	  {
		for (int j = i; j < n; j = j+i)
		{
			values [j] = false; 
			if (values [j] == true )
			 {
				System.out.println();
			 }
		 }
		  
	  }
	  //for ((array[i-1] +1) / array[0] == int)
		  
		  
	 
	  
	}

}

