package com.training.Assignment1;

//import org.omg.CORBA.portable.ApplicationException;rac
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
       Employee e1 =(Employee) ac.getBean("clerk");
       Employee e2 =(Employee) ac.getBean("programmer");
       Employee e3 =(Employee) ac.getBean("manager");
       
       e1.raiseSalary();
       e2.raiseSalary();
       e3.raiseSalary();
       
       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);
       
       
       
    }
}
