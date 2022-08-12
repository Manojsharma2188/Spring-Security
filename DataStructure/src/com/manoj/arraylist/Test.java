package com.manoj.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>()
				{
			
			{
		add(new Employee(1, "Manoj", "23"));
		add(new Employee(2, "Mohit", "22"));
		add(new Employee(3, "Rajat", "27"));
		add(new Employee(4, "Shubham", "29"));
		add(new Employee(5, "Meenu", "53"));

	}
				};
				
		Employee [] emp = (Employee[]) list.toArray(new Employee[list.size()]);
		
		for(Employee e : emp)
		{
			//System.out.println(e);
		}
		
		System.out.println(list.contains(new Employee(2, "Mohit", "22")));
		
		System.out.println(list.indexOf(new Employee(4, "Shubham", "29")));
			
			
		
				
	}
}
