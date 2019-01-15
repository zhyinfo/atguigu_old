package com.zhy.java8;

public class FilterEmployeeForAge implements MyPredicate<Employee>{

	@Override
	public boolean compare(Employee t) {
		return t.getAge() <= 35;
	}

}
