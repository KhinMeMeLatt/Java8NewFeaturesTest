package datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {

	public static void main(String[] args) {
		testPeriod();
		testDuration();
	}

	static void testPeriod() {
		Period period = Period.of(2021, 1, 29);
		System.out.println("Period: " + period);
	}

	static void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration thirtyMinus = Duration.ofMinutes(30);

		LocalTime time2 = time1.plus(thirtyMinus);
		Duration duration = Duration.between(time1, time2);

		System.out.println("Duration: " + duration);
	}
}
