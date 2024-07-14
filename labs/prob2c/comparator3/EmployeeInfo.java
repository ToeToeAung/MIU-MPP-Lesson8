package lesson8.labs.prob2c.comparator3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	public void sort(List<Employee> emps, final SortMethod method) {
	   Comparator<Employee> comparator;
				if(method == SortMethod.BYNAME) {
					comparator = (e1, e2) -> {
						int nameComparison = e1.name.compareTo(e2.name);
						if (nameComparison != 0) {
							return nameComparison;
						}
					return Integer.compare(e1.salary, e2.salary);
				};

				} else {
					comparator = Comparator.comparingInt(Employee::getSalary);
				}

		Collections.sort(emps, comparator);
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		System.out.println("Sorting by name:");
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);

		System.out.println("Sorting by salary:");
		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
