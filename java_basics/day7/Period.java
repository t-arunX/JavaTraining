package java_basics.day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Period {
	public static void main(String[] args) {
		String start = "23-12-2000";
		String end = "23-12-2020";
		String format = "dd-MM-uuuu";

		LocalDate StartDate = LocalDate.parse(start, DateTimeFormatter.ofPattern(format));
		LocalDate EndDate = LocalDate.parse(end, DateTimeFormatter.ofPattern(format));
		long p2 = ChronoUnit.DAYS.between(StartDate, EndDate);
		System.out.println("Days between " + StartDate + " and " + EndDate + " is: " + p2);
	}
}
