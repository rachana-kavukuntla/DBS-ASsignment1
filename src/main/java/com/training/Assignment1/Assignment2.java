package com.training.Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment2 {

	public static void main(String args[])
	{
		int ch1=0,ch2=1;
		//ArrayList<Employee> e = new ArrayList<Employee>();
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		do
		{
			String menu = "...........Main.............\n"
					+ "1.Create\n" 
					+ "2.Display\n"
					+ "3.Raise Salary\n"
					+ "4.Exit\n..........................\n";
			System.out.println(menu);
			System.out.println("Enter choice : ");
			Scanner sc = new Scanner(System.in);
			ch1 = sc.nextInt();
			if(ch1==1)
			{
				do {
					String submenu = "...........Sub.............\n"
							+ "1.Clerk\n" 
							+ "2.Programmer\n"
							+ "3.Manager\n"
							+ "4.Exit\n.........................\n";
					System.out.println(submenu);
					System.out.println("Enter choice : "); 
					ch2 = new Scanner(System.in).nextInt();
					switch(ch2)
					{
					case 1:
						ac.getBean("clerk",Clerk.class);
						break;
					case 2:
						ac.getBean("programmer",Programmer.class);
						break;
					case 3:
						ac.getBean("manager",Manager.class);
						break;
					case 4:
						break;
					default:
						System.out.println("Wrong option");
					}
				}while(ch2!=4);
			}
			if(ch1==2)
			{
				java.util.Iterator<Employee> i = Helper.e.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
			}
			if(ch1==3)
			{
				java.util.Iterator<Employee> i = Helper.e.iterator();
				while(i.hasNext())
				{
					i.next().raiseSalary();
				}
			}
			if(ch1<1 || ch1>4)
				System.out.println("Invalid input");
		}while(ch1!=4);
		System.out.println("\n Total number of Employees : "+ Helper.count);
	}
}
