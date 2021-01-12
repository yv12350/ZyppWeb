package com.zypp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zypp.entity.Student;
import com.zypp.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
	public Teacher findByEmailid(String emailid);

}
