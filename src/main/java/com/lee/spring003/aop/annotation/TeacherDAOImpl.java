package com.lee.spring003.aop.annotation;

import org.springframework.stereotype.Repository;

@Repository("teacherDAO")
public class TeacherDAOImpl implements ITeacherDAO {

	@Override
	public String saveTeacher() {
		System.out.println("TeacherDAOImpl - saveTeacher()");
		return "save successfully";
	}

}
