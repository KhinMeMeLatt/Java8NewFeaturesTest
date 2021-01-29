package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackwarpCompatability {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today: "+today);
		
		Instant now = today.toInstant();
	    System.out.println(now);
	    ZoneId tokyo = ZoneId.of("Asia/Tokyo");
	    
	    LocalDateTime localDateTime = LocalDateTime.ofInstant(now, tokyo);
	    System.out.println("Local date(Tokyo): " + localDateTime);
	    
	    ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, tokyo);
	    System.out.println("Zoned date(Tokyo): " + zonedDateTime);
	}

}
