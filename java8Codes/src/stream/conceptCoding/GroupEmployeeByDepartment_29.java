package stream.conceptCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	
	private String name;
	private String department;
	
	
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
public class GroupEmployeeByDepartment_29 {

	public static void main(String[] args) {

     List<Employee> employeeList = new ArrayList<>();
     employeeList.add(new Employee("Kunal", "Backend"));
     employeeList.add(new Employee("Jatin", "UI"));
     employeeList.add(new Employee("Neha",  "Backend"));
     employeeList.add(new Employee("Rahul", "UI"));
     employeeList.add(new Employee("Malay", "UI"));
    
     Map<String, List<Employee>> map= employeeList.stream().collect(Collectors.groupingBy((e)->e.getDepartment()));
     map.forEach((k,v)->{
    	 System.out.println(k +":");
    	 v.forEach(e-> System.out.println(e.getName()));
     });
	}

}
