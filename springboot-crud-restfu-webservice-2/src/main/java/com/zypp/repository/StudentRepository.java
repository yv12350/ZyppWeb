package com.zypp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.zypp.entity.Role;
import com.zypp.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findByEmailid(String emailid);
	public List<Student> findByCourse(String course);
	

}
