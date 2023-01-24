package com.fkrt.entity;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
	private List<Course> lst1=new ArrayList<>();
	public void registercourse(Course c) {
		for(Course crs:lst1) {
			if(crs.getPeriod()==c.getPeriod()) {
				throw new IllegalArgumentException();
			}
		}
		lst1.add(c);
	}

}
