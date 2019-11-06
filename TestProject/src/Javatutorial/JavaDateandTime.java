package Javatutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;




public class JavaDateandTime {

	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
		
	        String dateString = String.format("%d-%d-%d", Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
	        Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        // Then get the day of week from the Date based on specific locale.
	        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

	        System.out.println(dayOfWeek.toUpperCase()); // Friday
	
		
	        in.close();
		
	}
	
	
}


