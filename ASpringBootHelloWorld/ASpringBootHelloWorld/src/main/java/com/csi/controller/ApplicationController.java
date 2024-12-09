package com.csi.controller;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee{
	
	private int empId;
	
	private String empName;
	
	
}

	
@RestController
@RequestMapping ("/api")
public class ApplicationController {
	
	@GetMapping
	public ResponseEntity<String>sayHello(){
		return ResponseEntity.ok("GOOD MORNING MATES") ;
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String>sayWelcome(){ //writing response Entity instead of String directly is a Std Approach.
		return ResponseEntity.ok("WELCOME TO FULL STACK JAVA DEVELOPER, PUNE");
		
	}
	@GetMapping("/address")
	public ResponseEntity<String>sayAddress(){
		return ResponseEntity.ok("INSPIRIA MALL, NIGDI, PUNE MH");
		
		
	}

	List<Employee> employees = Stream.of(new Employee(121, "SWARA")).toList();
	
	@GetMapping("/fetch")
	public Employee get() {
		Employee employee1 = null;
		for(Employee employee: employees) {
			if(employee.getEmpName().equals("SWARA")) {
				employee1=employee;
				
			}
		}
		
		return employee1;
	}
	
	
	}
	
	

