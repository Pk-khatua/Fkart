package com.fkart.test;

import com.fkart.service.College;
import com.fkrt.entity.Course;
import com.fkrt.entity.Instroctor;
import com.fkrt.entity.Student;

public class Main {
	public static void main(String[] args) {
		College clg=new College();
		Student s1=new Student();
		s1.setId(1);s1.setName("Pankaj");
		clg.addstudent(s1);
		Student s2=new Student();
		s2.setId(2);s2.setName("Prakash");
		clg.addstudent(s2);
		Student s3=new Student();
		s3.setId(3);s3.setName("Sameer");
		clg.addstudent(s3);
		Instroctor i1=new Instroctor();
		i1.setId(11);i1.setName("Rabindra");
		clg.addinstructor(i1);
		Instroctor i2=new Instroctor();
		i2.setId(12);i2.setName("Raman");
		clg.addinstructor(i2);
		Course c1=new Course(1,10);
		Course c2=new Course(2,2);
		Course c3=new Course(1,5);
		clg.addcourse(c3);
		clg.addcourse(c2);
		clg.addcourse(c1);
		i1.instructorforcourse(c3);
		i1.instructorforcourse(c1);
		i2.instructorforcourse(c2);
		i2.instructorforcourse(c1);
		c2.addstudent(s2);
		c2.addstudent(s3);
		c2.addstudent(s1);
		c3.addstudent(s1);
		c1.addstudent(s1);
	}

}
