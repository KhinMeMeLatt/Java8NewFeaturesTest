package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CronoUnitTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plus(1,ChronoUnit.DAYS);
		LocalDate lastWeek = today.minus(1, ChronoUnit.MONTHS);
		System.out.println("getMonthValue(): "+today.getMonthValue());
		System.out.println("lengthOfMonth(): "+today.lengthOfMonth());
		System.out.println("lengthOfYear():"+today.lengthOfYear());
		System.out.println("toEpochDay():"+today.toEpochDay());
		System.out.println("toString():"+today.toString());
		System.out.println("atStartOfDay():"+today.atStartOfDay());
		System.out.println("Tomorrow is after today: "+tomorrow.isAfter(today));
		System.out.println("Last week is before today: "+lastWeek.isBefore(today));
		
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
	    System.out.println("Date after ten year: " + nextDecade);
	      
	    LocalDate nextCenturies = today.plus(1, ChronoUnit.CENTURIES);
	    System.out.println("Date after ten year: " + nextCenturies);
		
		LocalTime localTime = LocalTime.now();
		LocalTime jpLocalTime = localTime.plus(150, ChronoUnit.MINUTES);
		System.out.println("toNanoOfDay(): "+localTime.toNanoOfDay());
		System.out.println("toSecondOfDay(): "+localTime.toSecondOfDay());
		System.out.println("toString(): "+localTime.toString());
		System.out.println("Japan Local Time is after Myanmar Local Time: "+jpLocalTime.isAfter(localTime));
	}
}
