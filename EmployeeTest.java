import java.util.Scanner;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		Employee x=new Employee(); //creating objects x,y
		Employee y=new Employee();
		
		String name1;
		String name2;
		double salary;
		
		System.out.println("Employee Details");
		
		System.out.println("Enter the first name of Employee 1");
		name1=input.next();
		x.setFirstname(name1);
		System.out.println("Enter the last name of Employee 1");
		name2=input.next();
		x.setLastname(name2);
		System.out.println("Enter the salary of Employee 1:");
		salary=input.nextDouble();
		
		if(salary>0)
		{
			x.setSalary(salary);
		}
		else
		{
			System.out.println("Enter another value for salary");
			salary=input.nextDouble();
			x.setSalary(salary);
		}
		
		
		System.out.println("Enter the first name of Employee 2");
		name1=input.next();
		y.setFirstname(name1);
		System.out.println("Enter the last name of Employee 2");
		name2=input.next();
		y.setLastname(name2);
		System.out.println("Enter the salary of Employee 2");
		salary=input.nextDouble();
		
		if(salary>0)
		{
			y.setSalary(salary);
		}
		else
		{
			System.out.println("Enter another value for salary");
			salary=input.nextDouble();
			y.setSalary(salary);
		}
		
		
		System.out.println("Employee 1 Details");
		System.out.println("First Name:"+ x.getFirstname());
		System.out.println("Last Name:"+ x.getLastname());
		System.out.println("Salary:"+ x.getSalary());
		System.out.println("Yearly Salary:"+ x.getSalary()*12);  //Yearly salary
		
		System.out.println("Employee 2 Details");
		System.out.println("First Name:"+ y.getFirstname());
		System.out.println("Last Name:"+ y.getLastname());
		System.out.println("Salary:"+ y.getSalary());
		System.out.println("Yearly Salary:"+ y.getSalary()*12);  //Yearly salary
		
		x.setSalary(x.getSalary()*0.1+x.getSalary());
		y.setSalary(y.getSalary()*0.1+y.getSalary());
		
		System.out.println("After getting increment of 10%");
		System.out.println("Yearly salary of Employee 1:"+ x.getSalary()*12);
		System.out.println("Yearly salary of Employee 2:"+ y.getSalary()*12);
		
		System.out.println("Program done by R.M.Chandrakanth(2015103054)");
	}
		
	}

