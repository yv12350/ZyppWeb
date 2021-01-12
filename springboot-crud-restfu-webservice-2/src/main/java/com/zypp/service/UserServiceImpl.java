package com.zypp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.zypp.entity.Student;
import com.zypp.entity.Teacher;
import com.zypp.repository.RoleRepository;
import com.zypp.repository.TeacherRepository;
import com.zypp.repository.StudentRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	BCryptPasswordEncoder bcryptencoder;
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	RoleRepository roleRepo;
	@Autowired
	TeacherRepository teacherRepo;
	
	@Override
	public void saveStudent(Student student) {
		student.setPassword(bcryptencoder.encode(student.getPassword()));
		
		studentRepo.save(student);
	

	}

	@Override
	public boolean isStudentExists(Student student) {
				return false;
	}
	
	@Override
	public void saveTeacher(Teacher teacher) {
		teacher.setPassword(bcryptencoder.encode(teacher.getPassword()));
		
		teacherRepo.save(teacher);
	

	}

	@Override
	public boolean isTeacherExists(Teacher teacher) {
				return false;
	}
	
	public List<Student> getStudentByCourse(String course){
		
		List<Student> studentList= studentRepo.findByCourse(course);
		return studentList;
	}
	
	

}
