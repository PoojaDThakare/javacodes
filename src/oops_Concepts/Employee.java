package oops_Concepts;

public class Employee {
	
	String empName = "ABC";
	int empId = 100;
	int empSalary = 1000;
	
	public void displayEmpBonus() {
		System.out.println("Employee " + empName + " gets the bonus of "+ (empSalary*0.20));
	}

}
