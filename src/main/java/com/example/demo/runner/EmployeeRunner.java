package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> empList=Arrays.asList(
				new Employee(1,"Ganesh",25376.12,"mech",27),
				new Employee(2,"Nishanth",27895.36,"electrical",26),
				new Employee(3,"Shyam",24369.25,"civil",25),
				new Employee(4,"Vamsi",29365.15,"coumputer",27),
				new Employee(5,"Sai",30153.96,"mech",28),
				new Employee(6,"Anil",123.56,"electrical",26)
				);
		List<Employee> list=empList.stream().filter(x->x.getEDept().startsWith("c")).collect(Collectors.toList());
		System.out.println(list.toString());
		
	}

}
