package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String args[]) {
		List<Customer> custList = new ArrayList<Customer>();
		custList.add(new Customer(10, true, "1"));
		custList.add(new Customer(10, true, "4"));
		custList.add(new Customer(20, true, "2"));
		custList.add(new Customer(10, true, "3"));
		custList.add(new Customer(20, false, "4"));
		custList.add(new Customer(23, true, "5"));
		custList.stream().filter(cust -> cust.getAge() < 20)
				.filter(cust -> cust.isMale()).map(cust -> cust.getName())
				.forEach(System.out::println);
		custList.stream().filter(cust -> cust.getAge() < 20).distinct()
				.sorted(Comparator.comparing(Customer::getName))
				.map(cust -> cust.getName()).forEach(System.out::println);
		List<Customer> custListNew = custList.stream()
				.filter(cust -> cust.getAge() < 20).distinct()
				.sorted(Comparator.comparing(Customer::getName))
				.collect(Collectors.toList());

		List<String> prefixList = new ArrayList<String>();
		prefixList.add("el");
		prefixList.add("dl");
		prefixList.add("cl");
		prefixList.add("bl");
		prefixList.add("al");
		String testString = "flastic";
		if (prefixList.stream().anyMatch(testString::startsWith)) {
			System.out.println("Found");
		} else {
			System.out.println("not found");
		}
	}
}

class Customer {
	private int age;
	private boolean isMale;
	private String name;

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	public Customer(int age, boolean isMale, String name) {
		super();
		this.age = age;
		this.isMale = isMale;
		this.name = name;
	}

	public String getName() {
		return name;
	}

}