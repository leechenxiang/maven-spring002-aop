package com.lee.spring002.aop.xml.exception;


public class StuServiceImpl implements IStuService {
	
	private IStuDAO stuDAO;

	@Override
	public void saveStu() {
		System.out.println(stuDAO.saveStu());
	}

	@Override
	public void updateStu() {
		System.out.println(stuDAO.updateStu());
	}

	@Override
	public void deleteStu() {
		System.out.println(stuDAO.deleteStu());
	}

	@Override
	public void getStu() {
		System.out.println(stuDAO.getStu());
	}

	public IStuDAO getStuDAO() {
		return stuDAO;
	}

	public void setStuDAO(IStuDAO stuDAO) {
		this.stuDAO = stuDAO;
	}

	@Override
	public void login(String username) {
		System.out.println(stuDAO.login("lee"));
	}
}
