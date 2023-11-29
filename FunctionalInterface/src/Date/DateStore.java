package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String myDate="23/07/2023";
		
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		
		Date d=s.parse(myDate);
		
		System.out.println(s.format(d));
		
		
		String myBirthday="29/03/1999";
		
		Date d1=s.parse(myBirthday);
		System.out.println(s.format(d1));

	}

}
