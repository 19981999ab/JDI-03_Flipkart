package com.flipkart.service;

import java.util.List;

import com.flipkart.exception.CourseNotFoundException;

public interface RegistrationInterface {
<<<<<<< HEAD
	public boolean  registerCourses(int studentId,List<String>clist) ;
=======

	public boolean  registerCourses(int studentId,List<String>clist);
>>>>>>> dc7416f58841cd8517fa0a7b9866c54dbae6e78a
	public boolean addCourse(String courseCode, int studentId);
	public boolean dropCourse(String courseCode, int studentId) throws CourseNotFoundException;
	public double calculateFees(int studentId);
	public float generateReportCard(int semester,int studentId);
	public void viewCourses(int studentId);
	public void viewRegisteredCourses(int studentId);
}
