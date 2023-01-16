package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] rooms = new Rent[10];
				
		System.out.print("How many rooms will be rented? ");
		int roomsRented = sc.nextInt();
		
		for(int i = 1; i <= roomsRented; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			Rent rent = new Rent(name, email);
			rooms[roomNumber] = rent;
		}
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			} 
		}
		System.out.println();
		System.out.println("Vacant rooms:");
			
		for(int j = 0; j < rooms.length; j++) {
			if(rooms[j] == null) {
				System.out.println(j + ": ");
			} 
		}
		sc.close();
	}

}
