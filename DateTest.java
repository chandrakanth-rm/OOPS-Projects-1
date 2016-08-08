import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Date x=new Date();
		Scanner input=new Scanner(System.in);
		int d,m,y;
		
		System.out.println("Enter the date:");
		d=input.nextInt();
		x.setDate(d);
		
		System.out.println("Enter the month");
		m=input.nextInt();
		x.setMonth(m);
		
		System.out.println("Enter the year:");
		y=input.nextInt();
		x.setYear(y);
		
		x.displayDate();
		
		System.out.println("Program done by R.M.Chandrakanth(2015103054)");
		}

}
