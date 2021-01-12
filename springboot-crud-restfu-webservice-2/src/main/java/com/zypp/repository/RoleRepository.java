package com.zypp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.zypp.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByRole(String role );	

}
