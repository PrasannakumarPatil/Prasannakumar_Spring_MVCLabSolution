package com.gl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "department")
	private String dept;
	
	@Column(name = "country")
	private String country;
	
	public Student() {}

	public Student(int id, String name, String dept, String country) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.country = country;
	}

	public Student(String name, String dept, String country) {
		super();
		this.name = name;
		this.dept = dept;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", country=" + country + "]";
	}
	
	
	
}