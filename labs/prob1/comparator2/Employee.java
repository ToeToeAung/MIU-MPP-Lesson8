package lesson8.labs.prob1.comparator2;
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
	@Override
	public boolean equals(Object ob) {
		if(ob == this) return true;
		if(ob == null || ob.getClass() != getClass()) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.salary==salary;
	}

	public int hashCode(){
		return Objects.hash(name,salary);
	}
}

