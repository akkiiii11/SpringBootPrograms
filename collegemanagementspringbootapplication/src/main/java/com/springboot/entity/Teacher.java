package com.springboot.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor		//default constructor
@AllArgsConstructor		//parameterized constructor
@ToString				//to string method
@Entity
@Table(name = "teach_details")
public class Teacher
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	@Column(length=25, nullable = false)		//nullable - do not null field
	@NotBlank(message="Teacher name can not be blank..") // validation
	private String tname;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Trainer surname name can not be blank..") // validation
	private String tsurname;
	
	@Column(length=25,nullable = false, unique=true)
	@NotBlank(message="Trainer email can not be blank..") // validation
	@Email(message="Email id is not proper")
	private String temail;
	
	@Column(length=25,nullable = false, unique=true)
	@NotBlank(message="Phone Number can not be blank..") // validation
	private String tphone;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Designation can not be blank..") // validation
	private String designation;

	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="deptID", referencedColumnName = "did")
	@JsonBackReference
	private Department department;
	
	@OneToMany(mappedBy = "teacher",  
	fetch = FetchType.EAGER, cascade = CascadeType.ALL)		//CascadeType = changing the value
	@JsonManagedReference
	List<Batches> batchesList;
	
//	@ManyToOne(fetch =FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name="deptID", referencedColumnName = "did")
//	@JsonBackReference
//	private Department tdept;
	
//	public int getTid() {
//		return tid;
//	}
//
//	public void setTid(int tid) {
//		this.tid = tid;
//	}
//
//	public String getTname() {
//		return tname;
//	}
//
//	public void setTname(String tname) {
//		this.tname = tname;
//	}
//
//	public String getTsurname() {
//		return tsurname;
//	}
//
//	public void setTsurname(String tsurname) {
//		this.tsurname = tsurname;
//	}
//
//	public String getTemail() {
//		return temail;
//	}
//
//	public void setTemail(String temail) {
//		this.temail = temail;
//	}
//
//	public String getTphone() {
//		return tphone;
//	}
//
//	public void setTphone(String tphone) {
//		this.tphone = tphone;
//	}
//
//	public String getDesignation() {
//		return designation;
//	}
//
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//
//	
//	public Teacher() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Teacher(int tid, @NotBlank(message = "Teacher name can not be blank..") String tname,
//			@NotBlank(message = "Trainer surname name can not be blank..") String tsurname,
//			@NotBlank(message = "Trainer email can not be blank..") @Email(message = "Email id is not proper") String temail,
//			@NotBlank(message = "Phone Number can not be blank..") String tphone,
//			@NotBlank(message = "Designation can not be blank..") String designation) {
//		super();
//		this.tid = tid;
//		this.tname = tname;
//		this.tsurname = tsurname;
//		this.temail = temail;
//		this.tphone = tphone;
//		this.designation = designation;
//	}
//
//	@Override
//	public String toString() {
//		return "Teacher [tid=" + tid + ", tname=" + tname + ", tsurname=" + tsurname + ", temail=" + temail
//				+ ", tphone=" + tphone + ", designation=" + designation + "]";
//	}
//	
	
}