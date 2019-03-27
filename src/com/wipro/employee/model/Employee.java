package com.wipro.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "employee")
	@SequenceGenerator(name = "employee", sequenceName = "employee_id_seq")
	private int Id;

	@Column(columnDefinition = "VARCHAR(25)")
	private String name;
	@Column(columnDefinition = "VARCHAR(20)")
	private String password;
	@Column(columnDefinition = "VARCHAR(20)")
	private String candy;
	public String getCandy() {
		return candy;
	}
	public void setCandy(String candy) {
		this.candy = candy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	
}
