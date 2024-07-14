package lesson8.labs.prob2a.comparator2;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return Integer.compare(e1.getSalary(), e2.getSalary());
	}
}
