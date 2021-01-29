package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Next Decade");
		LocalDate nextDecadeFirstDay = nextDecade.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of next decade: "+nextDecadeFirstDay);
		
		LocalDate firstDayOfNextMonth = nextDecade.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First Day of next decade's February: "+firstDayOfNextMonth);
		
		System.out.println("Today");
		LocalDate dayOfWeekInMonth = today.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
		System.out.println("2nd week's Friday: "+dayOfWeekInMonth);
		
		LocalDate lastInMonth = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
		System.out.println("Last monday of current month: "+lastInMonth);
		
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("last day of current year: "+lastDayOfYear);
		
		LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("next friday: "+nextFriday);
		
		LocalDate nextOrSameFriday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("next or same friday: "+nextOrSameFriday);
		
		LocalDate previousWednesday = today.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
		System.out.println("previous Wednesday: "+previousWednesday);
		
	}
}
