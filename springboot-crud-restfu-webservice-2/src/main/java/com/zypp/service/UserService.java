package com.zypp.service;

import java.util.List;

import com.zypp.entity.Student;
import com.zypp.entity.Teacher;

public interface UserService {
	public void saveStudent(Student student);
	public boolean isStudentExists(Student student);
	public void saveTeacher(Teacher teacher);
	public boolean isTeacherExists(Teacher teacher);
	public List<Student> getStudentByCourse(String course);
}
