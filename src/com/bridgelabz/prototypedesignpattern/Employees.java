package com.bridgelabz.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Hanumant");
		empList.add("akash");
		empList.add("Omkar");
		empList.add("rupesh");

	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	protected Employees clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String string : this.getEmpList()) {
			temp.add(string);
		}
		return new Employees(temp);
	}

}
