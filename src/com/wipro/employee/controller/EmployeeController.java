package com.wipro.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.employee.model.Employee;
import com.wipro.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Details");
		return "employee";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(Model model, @ModelAttribute("employeeBean") Employee employeeBean) {
		if (employeeBean != null && employeeBean.getName() != null) {
			model.addAttribute("msg", "Registered Successfully");
			return employeeService.doRegister(employeeBean);
		} else {
			model.addAttribute("error","Error Occured");
			return "error";
		}
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String doModify(Model model, @ModelAttribute("employeeBean") Employee employeeBean) {
		if (employeeBean != null
				&& employeeBean.getName() != null && employeeBean.getCandy() != null
				&& employeeBean.getId() != 0) {
			model.addAttribute("msg", "Details Altered Successfully for employee:" + employeeBean.getId());
			model.addAttribute("EmployeeIds", employeeService.getId());
			return employeeService.doModify(employeeBean);
		} else {
			model.addAttribute("error","Error Occured");
			return "error";
		}
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String doDelete(Model model, @ModelAttribute("employeeBean") Employee employeeBean) {
		employeeService.doDelete(employeeBean.getId());
		model.addAttribute("msg", "Details deleted Successfully for employee:" + employeeBean.getId());
		model.addAttribute("EmployeeIds", employeeService.getId());
		model.addAttribute("Employee", employeeService.getEmployee(employeeBean.getId()));
		return "modify";
	}

	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public String listAllEmployees(Model model) {
		model.addAttribute("Employee", employeeService.getAllCustomer());
		return "show";
	}

	@RequestMapping(value = "/fetch", method = RequestMethod.POST)
	public String getEmployeeIds(Model model) {
		model.addAttribute("CustomerIds", employeeService.getId());
		return "modify";
	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.POST)
	public String getEmployee(Model model, @ModelAttribute("employeeBean") Employee employeeBean) {
		System.out.println("ID:" + employeeBean.getId());
		model.addAttribute("EmployeeIds", employeeService.getId());
		model.addAttribute("Employee", employeeService.getEmployee(employeeBean.getId()));
		return "modify";
	}
}
