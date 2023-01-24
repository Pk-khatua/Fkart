package com.fkrt.entity;

import java.util.ArrayList;
import java.util.List;

public class Instroctor extends User{
	private List<Course> lst2=new ArrayList<>();
	public void instructorforcourse(Course c) {
		try {
			for (Course crs : lst2) {
				if (crs.getPeriod() == c.getPeriod()) {
					throw new IllegalArgumentException();
				}
			}
			lst2.add(c);
		} catch (Exception e) {
			System.out.println("you have already obtained that period");
		}
	}

}
