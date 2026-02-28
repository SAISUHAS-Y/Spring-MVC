package com.jsp.spring_mvc_studentdb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.spring_mvc_studentdb.entity.Student;
import com.jsp.spring_mvc_studentdb.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public ModelAndView addStudent(Student student) {
		//Resolving the Request - Saving the Student Object
		studentRepository.addStudent(student);

		ModelAndView mov=new ModelAndView();
		mov.setViewName("index.jsp");
		return mov;
	}

	public ModelAndView displayAllStudent() {
		//fetching all the student details from the db table
		List<Student> students=studentRepository.findAllStudents();

		//ModelAndView mov =new ModelAndView();
		//mov.setViewName("DisplayStudent.jsp");
		//mov.addObject("studentList",students);

		return new ModelAndView("DisplayStudent.jsp").addObject("studentList",students);
	}

	public ModelAndView findStudentById(int studentId) {
		//fetching the student object based on id
		Student student=studentRepository.findStudentById(studentId);

		//ModelAndView mov=new ModelAndView();
		//mov.setViewName("UpdateStudent.jsp");
		//mov.addObject("studentObject", student);

		return new ModelAndView("UpdateStudent.jsp").addObject("studentObject", student);
	}

	public ModelAndView updateStudent(Student student) {
		//update student object in the database
		studentRepository.updateStudent(student);

		//ModelAndView mov=new ModelAndView();
		//mov.setViewName("redirect:display-student");

		return new ModelAndView("redirect:display-student");
	}

	public ModelAndView deleteStudent(int studentId) {
		//delete student object in the database
		studentRepository.deleteStudentById(studentId);
		
		return new ModelAndView("redirect:display-student");
	}
}

