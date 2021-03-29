package typeCasting.com;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateEg {
 
		public static void main(String[] args) {
			SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date1 = new Date();  
		    System.out.println(s1.format(date1));  
		    
		    java.util.Date date2=new java.util.Date();  
		    System.out.println(date2); 
		    
		    Date date3 = new Date();
		    // Display the Date & Time using toString()
		    System.out.println(date3.toString());
		    
System.out.println();	    
		    Date date4 = new Date();
		    System.out.println(date4.toString());
		    String dateFormat = "hh:mm:ss a dd-MMM-yyyy"; 
		    SimpleDateFormat s2 = new SimpleDateFormat(dateFormat); 
		    System.out.println(s2.format(date4)); 
		    
 System.out.println();
  			String dateFormat1 = "30/03/2021 08:22:15";
  			Date date5 = null;
  			try {
  				date5 = new  SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(dateFormat1);
  			}
  			catch (ParseException e) {
  				e.printStackTrace();
  			}
  			System.out.println(date5);
}
}
