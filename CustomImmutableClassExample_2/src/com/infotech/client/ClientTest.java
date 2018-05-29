package com.infotech.client;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.infotech.model.Address;
import com.infotech.model.Employee;

public class ClientTest {
	
	public static void main(String[] args) {

		Address address1= new Address();
		address1.setAddressLine1("address Line1");
		address1.setAddressLine2("address Line2");
		address1.setCity("Mumbai");
		
		Address address2= new Address();
		address2.setAddressLine1("address Line1");
		address2.setAddressLine2("address Line2");
		address2.setCity("Delhi");
		
		List<String> skills = new ArrayList<>();
		skills.add("Core Java");
		skills.add("String");
		skills.add("Hibernate");
		
		Employee e1 =  new Employee(1001, "KK", new BigDecimal("90000.00"),getDob("04/02/1986"),address1,skills);
		Employee e2 =  new Employee(1002, "Sean", new BigDecimal("40000.00"),getDob("25/02/1985"),address2,skills);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("----------------------------------------------------------");
		e1.getAddress().setCity("Chennai");
		System.out.println(e1);
	}
	
	private static Date getDob(String dob){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return dateFormat.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}