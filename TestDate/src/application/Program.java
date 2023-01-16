package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate date01 = LocalDate.now();
		LocalDateTime date02 = LocalDateTime.now();
		Instant date03 = Instant.now();
		Instant date04 = Instant.parse("2023-01-10T05:46:26Z");
		
		System.out.println("date01 = " + date01);
		System.out.println("date02 = " + date02);
		System.out.println("date03 = " + date03);
		System.out.println("date04 = " + date04);
		
		

	}
	
}
