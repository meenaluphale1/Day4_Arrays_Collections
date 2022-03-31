package com.lti.coll;

public class Employee implements Comparable<Employee> {
	
	int empId;
	String empName;
	double empSal;
	
	@Override
	public int compareTo(Employee e) {		
		
		if (this.empId > e.empId) {
			return 1;
		}
		else if (this.empId < e.empId) {
			return -1;
			
		} else {
			return 0;
		}
	}
	
	
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empSal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(empSal) != Double.doubleToLongBits(other.empSal))
			return false;
		return true;
	}

	
	




	@Override
	public String toString() {
		return "\n Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	


	

}
