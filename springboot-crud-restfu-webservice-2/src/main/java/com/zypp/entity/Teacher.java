package com.zypp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Teacher")
public class Teacher {
	@Id
	@Column(name = "User_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@NotNull(message = "Name  is compulsory")
	@Column(name = "name")
	String name;
	
	
	@NotNull(message = "Email is compulsory")
	@Column(name = "emailid")
	String emailid;

	@NotNull(message = "Password is compulsory")
	@Column(name = "password")
	String password;
	
	@NotNull(message = "Please Provide Value For Gender")
	@Column(name = "gender")
	String gender;
	
	@NotNull(message = "Course is compulsory")
	@Column(name = "course")
	String course;
	
	
	
	
	public Teacher() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

	

}
