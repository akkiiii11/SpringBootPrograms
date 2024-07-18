package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeId;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Employee First name can not be blank..")
	private String employeeFirstName;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Employee Last name can not be blank..")
	private String employeeLastName;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Employee Email Id can not be blank..")
	private String employeeEmailId;

}
