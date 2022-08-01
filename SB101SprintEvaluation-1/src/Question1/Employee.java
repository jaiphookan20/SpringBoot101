package Question1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String name;
	private String address;
	
	
	
public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

//	create a Map as
//	● key: Employee
//	● Value: Integer (Salary of Employee)
//	Sort Map in Alphabetical order of Employee Name by using TreeMap and implementing Comparable interface,
//	where key is customObject/Employee type in java.
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public static void main(String[] args) {
		
		TreeMap<Employee, Integer> employeeList = new TreeMap<>();
		employeeList.put(new Employee(1, "Jai", "Ghy"), 10000);
		employeeList.put(new Employee(2, "Ashok", "Delhi"), 5000);
		employeeList.put(new Employee(3, "Denim", "Mumbai"), 8000);
		
		Set<Map.Entry<Employee, Integer>> emp = employeeList.entrySet();
		
		 for(Map.Entry<Employee,Integer> employees: emp) {
			 
			 System.out.println(employees);
		 } 
		
	}

	@Override
	public int compareTo(Employee e1) {
		return (this.getName().compareTo(e1.getName()));
	}

}
