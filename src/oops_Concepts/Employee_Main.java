package oops_Concepts;

public class Employee_Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		
		emp1.empName = "Pooja";
		emp1.empId = 123;
		emp1.empSalary = 12345;
		
		emp2.empName = "Sneha";
		emp2.empId = 456;
		emp2.empSalary = 54321;
		
		emp1.displayEmpBonus();
		emp2.displayEmpBonus();
	}

}
