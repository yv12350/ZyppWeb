package com.zypp.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zypp.entity.Attendance;
import com.zypp.entity.Student;
import com.zypp.entity.Teacher;
import com.zypp.repository.StudentRepository;
import com.zypp.repository.TeacherRepository;
import com.zypp.service.UserService;

@Controller
public class Dashboard {
	
	
	@Autowired
	UserService userService;
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	TeacherRepository teacherRepo;
	
	
	
	@RequestMapping("/teacher/dashboard")
	public ModelAndView teacherDashboard(@RequestParam("emailid") String emailid) {
		Teacher teacher = teacherRepo.findByEmailid(emailid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("teachercourse", teacher.getCourse());
		mv.setViewName("teacherDashboard");
		return mv;
		
	}
	@RequestMapping(value = "/teacher/dashboard/viewStudentList" , method = RequestMethod.GET)
	public ModelAndView viewStudentList(@RequestParam("teachercourse") String course) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("students", userService.getStudentByCourse(course));
		mv.setViewName("studentlist");
		return mv;
	}
	@RequestMapping("/student/dashboard")
	public ModelAndView studentDashboard(@RequestParam("emailid") String emailid) {
		
		Student student = studentRepo.findByEmailid(emailid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentid", student.getId());
		mv.setViewName("studentDashboard");
		
		return mv;
		
	}
	@RequestMapping(value="/student/dashboard/viewAttendance",method = RequestMethod.GET)
	public ModelAndView viewStudentAttendance(@RequestParam("searchDate") String date, @RequestParam("studentid") int id) {
		ModelAndView mv = new ModelAndView();
		
		Student student;
		Optional<Student> returnStudent = studentRepo.findById(id);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Path1"+ date);
		
		if(returnStudent.isPresent()) {
			student = returnStudent.get();
			for(Attendance attendance : student.getAttendance()) {
				
				
				if(df.format(attendance.getDate()).equals(date)) {
					
				
					mv.addObject("attendance",attendance);
					
				}
			}
			mv.addObject("studentName",student.getname());
			mv.setViewName("viewstudentattendance");
		}
		
		
	

		System.out.println(date);
		System.out.println(id);
		return mv;
	}
	
	@RequestMapping(value = "/teacher/dashboard/showAttendance", method = RequestMethod.GET)
	public ModelAndView showAttendanceToTeacher(@RequestParam("searchDate") String date, @RequestParam("teachercourse") String course) {
		System.out.println("Inside showAttendance");
		ModelAndView mv = new ModelAndView();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		List<Student> returnStudent = studentRepo.findByCourse(course);
		//List<Attendance> finalAttendance = new ArrayList<>();
		List<Student> finalStudent = new ArrayList<>();
		for(Student student : returnStudent) {
			for(Attendance attendance : student.getAttendance()) {
				
				
				if(df.format(attendance.getDate()).equals(date)) {
					System.out.println("Matched");
					
					finalStudent.add(student);
					System.out.println("Value" + student.getEmailid());
				
					
				}
			}
			
		}
		
		mv.addObject("studentDetails",finalStudent);
		
		mv.setViewName("showattendancetoteacher");
		
		return mv;
		
	} 
	
	

}
