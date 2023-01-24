package com.fkrt.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int period;
	private int max_period;
	private List<Student> lst=new ArrayList<>();
	public Course(int period,int max_period) {
		this.period=period;
		this.max_period=max_period;
	}
	public void addstudent(Student stu) {
		try {
			if (lst.size() >= max_period) {
				throw new IllegalArgumentException();
			} else {
				lst.add(stu);
			} 
		} catch (Exception e) {
			System.out.println("max size obtained");
		}
	}
	public int getPeriod() {
		return period;
	}
	

}
