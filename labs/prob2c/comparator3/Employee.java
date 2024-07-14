package lesson8.labs.prob2c.comparator3;

import java.util.Objects;

public class Employee {
	String name;
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public boolean equals(Object ob){
		if(this == ob) return true;
		if(ob == null || getClass()!= ob.getClass()) return false;
		Employee employee = (Employee)ob;
		return Objects.equals(name, employee.name) && salary == employee.salary;
	}

	@Override
	public int hashCode(){
		return Objects.hash(name, salary);
	}
}

