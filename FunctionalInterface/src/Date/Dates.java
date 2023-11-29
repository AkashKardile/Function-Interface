package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	String str="23/07/2023";
	SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
	Date d=s.parse(str);
	System.out.println(s.format(d));

	}

}
