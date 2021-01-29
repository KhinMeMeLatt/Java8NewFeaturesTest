package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTimeTest {

	public static void main(String[] args) {
		ZonedDateTime date=ZonedDateTime.now();
		System.out.println(date);

		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T08:30:30+01:00[Europe/Paris]");
		System.out.println("date1: " + date1);

		ZoneId id = ZoneId.of("Asia/Tokyo");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);
	}
}
