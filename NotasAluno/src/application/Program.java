package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Name: ");
		student.name = scanner.nextLine();
		System.out.print("Note 1: ");
		student.note1 = scanner.nextDouble();
		System.out.print("Note 2: ");
		student.note2 = scanner.nextDouble();
		System.out.print("Note 3: ");
		student.note3 = scanner.nextDouble();
		
		if(student.finalGrade() >= 60.0) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
			System.out.println("FAILED");
			Double missing = 60 - student.finalGrade();
			System.out.println("MISSING: " + String.format("%.2f", missing) + " POINTS");
			
		}
		scanner.close();
	}

}
