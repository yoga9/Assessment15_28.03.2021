package typeCasting.com;

public class TypeConversionEg {
	
   public static void main(String[] args) {
	    
	    System.out.println("Convert String to Integer");
	    String s = "1234";
	    Integer s1=Integer.parseInt(s);  //String to int used
		System.out.println(s1);  
		
		Integer s2=Integer.valueOf(s);   //String to int object used
		System.out.println(s2);    
		
		 System.out.println("Convert Integer to String");
		    int i = 500;
		    String i1=Integer.toString(i);  // int to String used
			System.out.println(i1);  
			
			String i2=String.valueOf(i);   //int to String object used
			System.out.println(i2);    
}
}
