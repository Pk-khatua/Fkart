package com.fkart.service;

import java.util.ArrayList;
import java.util.List;

import com.fkrt.entity.Course;
import com.fkrt.entity.Instroctor;
import com.fkrt.entity.Student;

public class College {
	private List<Course> c=new ArrayList<>();
	private List<Student> s=new ArrayList<>();
	private List<Instroctor> i=new ArrayList<>();
	public void addcourse(Course crs) {
		c.add(crs);
	}
	public void addstudent(Student stu) {
		s.add(stu);
	}
	public void addinstructor(Instroctor ins) {
		i.add(ins);
	}
	public List<Course> getC() {
		return c;
	}
	public List<Student> getS() {
		return s;
	}
	public List<Instroctor> getI() {
		return i;
	}
	
	

}
