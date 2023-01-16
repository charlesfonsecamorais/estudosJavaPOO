package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeRegistration = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int newEmployees = sc.nextInt();
		
		for(int i=1; i<=newEmployees; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: US$ ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			employeeRegistration.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee Id that will have salary increase: ");
		int employeeId = sc.nextInt();
//		Integer position = positionId(employeeRegistration, employeeId);
		Employee emp = employeeRegistration.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee employee : employeeRegistration) {
			System.out.println(employee);
		}

		sc.close();
	}
	
	public static Integer positionId(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
