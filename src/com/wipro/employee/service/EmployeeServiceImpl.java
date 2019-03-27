package com.wipro.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.employee.model.Employee;
import com.wipro.employee.dao.EmployeeDAO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public String doRegister(Employee employee) {
		return employeeDAO.doRegister(employee);
	}

	
	@Transactional
	@Override
	public String doModify(Employee employee) {
		return employeeDAO.doModify(employee);
	}

	

	@Transactional
	@Override
	public Employee getEmployee(int employeeId) {
		
		return employeeDAO.getEmployee(employeeId);
	}

	@Transactional
	@Override
	public void doDelete(int employeeId) {
		employeeDAO.doDelete(employeeId);
		
	}

	@Override
	public List<Integer> getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
