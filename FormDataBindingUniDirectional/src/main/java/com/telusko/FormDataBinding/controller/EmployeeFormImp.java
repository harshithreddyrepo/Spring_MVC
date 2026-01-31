package com.telusko.FormDataBinding.controller;

public class EmployeeFormImp {

	private Integer id;
	private String name;
	private String city;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public EmployeeFormImp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Implementer [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
}
