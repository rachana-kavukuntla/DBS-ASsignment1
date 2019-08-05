package com.training.Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidAge extends RuntimeException  {
	
	public InvalidAge()
	{
		super();
	}
	public InvalidAge(String msg)
	{
		super(msg);
	}
	  
	public static int readEmpAge()
	{
		int age = 0;
		while(true)
		{
			try
			{
				System.out.println("Enter Age : ");
				age = new Scanner(System.in).nextInt();
				if(age<21 || age>60)
					throw new InvalidAge("Please enter between 21 and 60 : ");
				else
					return age;
			}
			catch(InputMismatchException i)
			{
				System.out.println("Please enter numbers only");
			}
			catch(InvalidAge i)
			{
				System.out.println(i.getMessage());
			}
		
		}
		
	}

}
