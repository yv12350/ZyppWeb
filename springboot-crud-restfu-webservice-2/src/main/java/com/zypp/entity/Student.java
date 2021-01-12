package com.zypp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@Column(name = "User_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@NotNull(message = "Name  is compulsory")
	@Column(name = "name")

	String name;
	
	public List<Attendance> getAttendance() {
		return attendance;
	}
	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

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
	
	@NotNull(message = "Section is compulsory")
	@Column(name = "section")
	String section;
	
	@OneToMany
	List<Attendance> attendance;
	
	public Student() {
		
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	/*
	 * @NotNull(message="Email id is compulsory")
	 * 
	 * @Email
	 * 
	 * @Column(name="User_Email") String emailId;
	 * 
	 * @NotNull(message="Name  is compulsory")
	 * 
	 * @Column(name = "User_Name") String name;
	 * 
	 * @NotNull(message="Password is compulsory")
	 * 
	 * @Column(name = "User_Password") String password;
	 * 
	 * @NotNull(message="Sex is compulsory")
	 * 
	 * @Column(name = "User_Sex") String sex;
	 * 
	 * @NotNull(message="College id is compulsory")
	 * 
	 * @Column(name = "User_CollegeId") String collegeId;
	 * 
	 * @NotNull(message="Course is compulsory")
	 * 
	 * @Column(name = "User_Course") String course;
	 * 
	 * 
	 * 
	 * 
	 * @NotNull(message="Section is compulsory")
	 * 
	 * @Column(name = "User_Section") String section;
	 * 
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name="auth_user_role", joinColumns = @JoinColumn
	 * (name="auth_user_id"), inverseJoinColumns = @JoinColumn(name="auth_role_id"))
	 * public Set<Role> roles;
	 */

	/*
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getemailId() { return emailId; } public void setemailId(String
	 * emailId) { this.emailId = emailId; } public String getName() { return name; }
	 * public void setName(String name) { this.name = name; } public String
	 * getPassword() { return password; } public void setPassword(String password) {
	 * this.password = password; } public String getSex() { return sex; } public
	 * void setSex(String sex) { this.sex = sex; } public String getcollegeId() {
	 * return collegeId; } public void setcollegeId(String collegeId) {
	 * this.collegeId = collegeId; } public String getCourse() { return course; }
	 * public void setCourse(String course) { this.course = course; } public String
	 * getSection() { return section; } public void setSection(String section) {
	 * this.section = section; } public Set<Role> getRoles() { return roles; }
	 * 
	 * 
	 * public void setRoles(Set<Role> roles) { this.roles = roles; }
	 */

}
