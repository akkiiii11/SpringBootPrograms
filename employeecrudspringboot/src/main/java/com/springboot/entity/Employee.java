package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
create table Employee(
id int,
empName varchar(30),
empSal BigInt,
empEmail varchar(50),
empDesig varchar(20),
doj varchar(20)
);
*/

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 30)
	private String empName;
	
	@Column(length = 20)
	private double empSal;
	
	@Column(length = 50)
	private String empEmail;
	
	@Column(length = 20)
	private String empDesig;
	
	@Column
	private String doj;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String empName, double empSal, String empEmail, String empDesig, String doj) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
		this.empDesig = empDesig;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSal=" + empSal + ", empEmail=" + empEmail
				+ ", empDesig=" + empDesig + ", doj=" + doj + "]";
	}
	
}
