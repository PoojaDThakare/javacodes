package date_Time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_Add_Subtract {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now().plus(5,ChronoUnit.DECADES);
		System.out.println(d1);		
				
	}

}
