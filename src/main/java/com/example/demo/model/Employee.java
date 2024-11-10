package com.example.demo.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
 private Integer eid;
 private String eName;
 private Double eSal;
 private String eDept;
 private Integer eAge;
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(eDept, other.eDept);
}
@Override
public int hashCode() {
	return Objects.hash(eDept);
}
}
