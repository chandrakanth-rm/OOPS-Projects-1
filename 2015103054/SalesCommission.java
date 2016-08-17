import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Employee Commission");
		int i,n;
		System.out.println("Enter total Number of Employees :");
		n=input.nextInt();
		
		int sales[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the amount of sales of Employee "+(i+1)+":");
			sales[i]=input.nextInt();
			sales[i]=200+(sales[i]*9)/100;
		}
		
		int count[]=new int[9]; //creating an array of counters
		
		for(i=0;i<n;i++)
		{
			if(sales[i]<300)
			{
				count[0]++;
			}
			
			else if(sales[i]<400)
			{	
				count[1]++;
			}
			
			else if(sales[i]<500)
			{	
				count[2]++;
			}
			
			else if(sales[i]<600)
			{	
				count[3]++;
			}
			
			else if(sales[i]<700)
			{	
				count[4]++;
			}
			
			else if(sales[i]<800)
			{	
				count[5]++;
			}
			
			else if(sales[i]<900)
			{	
				count[6]++;
			}
			
			else if(sales[i]<1000)
			{	
				count[7]++;
			}
			
			else
			{	
				count[8]++;
			}
		}
		
		System.out.println("Commission||Number of Salesman");
		System.out.println(" $200-299  "+count[0] );
		System.out.println(" $300-399  "+count[1] );
		System.out.println(" $400-499  "+count[2] );
		System.out.println(" $500-599  "+count[3] );
		System.out.println(" $600-699  "+count[4] );
		System.out.println(" $700-799  "+count[5] );
		System.out.println(" $800-899  "+count[6] );
		System.out.println(" $900-999  "+count[7] );
		System.out.println(" >$1000    "+count[8] );
		System.out.println("Program by R.M.Chandrakanth(2015103054)");
	}


}


