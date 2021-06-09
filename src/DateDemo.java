import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		//Month numbered from 0 to 11
		GregorianCalendar cal = new GregorianCalendar(2021,04,29);
		cal.add(GregorianCalendar.DATE, 1);
		Date d2 = cal.getTime();
		System.out.println(d2);
		
		DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(format.format(d2));
		
		LocalDate date3 = LocalDate.of(2021, 04, 29);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/d/yyyy");
		System.out.println(formatter.format(date3));
		
		String s1 = "d";
		s1 = "mn";
		
		
		try {
			if(s1.length() == 1) {
				throw(new CustomException("Error noted"));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		switch(s1) {
			case "m":
				System.out.println("Helloooo found");
				break;
			case "n":
				System.out.println("Helloooo again found");
				break;
			default:
				System.out.println("Helloooo again found");
				break;
		}
	}

}
