import java.text.NumberFormat;

public class HelloDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+args[0]);
		
		//Assignments
		int a= 10; int b = 10;
		System.out.println(a==b);
		
		Integer a1= Integer.valueOf(10);//seperate objects 
		// b1= new Integer(10);
		Integer b1 = a1;
		System.out.println(a1==b1);//checks if both references to the same Integer obj
		
		String s1 = "Hello";
		char[] array = s1.toCharArray();
		System.out.println(array);
		s1 = array.toString(); //Doesnt work
		System.out.println(s1);
		s1 = new String(array); //works
		System.out.println(s1);
		
		
		double longnum = 1000000d;
		NumberFormat nformat = NumberFormat.getIntegerInstance();
		System.out.println(nformat.format(longnum));
		
		
		StringBuilder builder = new StringBuilder("Hello").append(" I love ");
		System.out.println(builder);
		
		builder.delete(0, builder.length());
		System.out.println("Now ::"+builder);
	}

}
