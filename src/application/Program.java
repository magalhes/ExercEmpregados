package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		String name;
		int hours;
		double valuePerHour;
		for(int i =1; i<=n; i++) {
			System.out.println("Employee #"+ i +" data: ");
			System.out.println("Outsourced (y/n)? ");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("y")) {
				System.out.println("Name: ");
				sc.nextLine();
				 name = sc.nextLine();
				System.out.println("Hours: ");
				 hours = sc.nextInt();
				System.out.println("Value per hour: ");
				 valuePerHour = sc.nextDouble();
				 System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour,
						additionalCharge));
			}else {
				System.out.println("Name: ");
				sc.nextLine();
				 name = sc.nextLine();
				System.out.println("Hours: ");
				 hours = sc.nextInt();
				System.out.println("Value per hour: ");
				 valuePerHour = sc.nextDouble();
				 list.add(new Employee(name, hours, valuePerHour));
			}			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f",
					emp.payment()));
		}
		sc.close();
	}

}
