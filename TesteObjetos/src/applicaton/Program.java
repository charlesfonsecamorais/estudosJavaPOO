package applicaton;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serao registrados? ");
		int newEmployees = sc.nextInt();
		
		for(int i=0; i<newEmployees; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			employeeList.add(employee);
		}
		System.out.println();
		System.out.print("Digite o Id do funcionario elegivel para aumento de salario: ");
		int idForIncreaseSalary = sc.nextInt();
		Employee idTest = employeeList.stream().filter(x -> x.getId() == idForIncreaseSalary).findFirst().orElse(null);
		if(idTest == null) {
			System.out.println("Id nao cadastrado!");
		} else {
			System.out.print("Digite a porcentagem para o aumento: ");
			Double percentage = sc.nextDouble();
			idTest.increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("Listagem de Funcionarios");
		for(Employee obj : employeeList) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
