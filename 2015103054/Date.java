
public class Date {

	private int date;
	private int month;
	private int year;
	
	public Date(){
		date=0;
		month=0;
		year=0;
	}
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate()
	{
		System.out.println("Given Date is: "+date+"/"+month+"/"+year);
		
	}

}


