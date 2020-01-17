package com.bridgelabz.prototypedesignpattern;

import java.util.List;

public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employee = new Employees();
		employee.loadData();
		Employees emp = employee.clone();
		Employees emps = employee.clone();
		List<String> list = emp.getEmpList();
		list.add("sahil");
		List<String> list1 = emps.getEmpList();
		list1.remove("Omkar");
		System.out.println("employee List " + employee.getEmpList());
		System.out.println("emp " + list);
		System.out.println("emps " + list1);
	}

}
