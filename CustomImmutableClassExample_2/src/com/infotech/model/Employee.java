package com.infotech.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee {

	private final Integer id;
	private final String name;
	private final BigDecimal salary;
	private final Date dob;
	private final Address address;
	private final List<String>  skills;
	
	public Employee(Integer id, String name, BigDecimal salary, Date dob,
			Address address, List<String> skills) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.address = address;
		this.skills = skills;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}
	
	public Address getAddress() {
		Address address = new Address();
		address.setAddressLine1(address.getAddressLine1());
		address.setAddressLine2(address.getAddressLine2());
		address.setCity(address.getCity());
		
		return address;
	}

	public List<String> getSkills() {
		return new ArrayList<>(skills);
		//return skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", dob=" + dob + ", address=" + address + ", skills="
				+ skills + "]";
	}
}
