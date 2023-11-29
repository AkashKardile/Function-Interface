package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparison {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String date1="23/07/2023";
		String date2="23/07/2023";
		
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1=s.parse(date1);
		Date d2=s.parse(date2);
		
		System.out.println(s.format(d1));
		System.out.println(s.format(d2));
		
		if(d1.compareTo(d2)==0)
		{
			System.out.println("Dates are same");
		}
		else if(d1.compareTo(d2)>0)
		{
			System.out.println("Date 1 > Date 2 ");
		}
		else
		{
			System.out.println("Date 2 > Date 1");
		}

	}

}
