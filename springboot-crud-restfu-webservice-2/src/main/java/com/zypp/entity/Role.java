package com.zypp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Auth_Role")

public class Role {
	
	@Id
	@Column(name="Role_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name="rolename")
	String role;
	@Column(name="roledescription")
	String roleDescription;
	
	public Role() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	

}
