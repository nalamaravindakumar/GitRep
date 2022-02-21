package com.cg.eis.service;

import com.cg.eis.been.Employee;

public interface EmployeeService {
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);

}
