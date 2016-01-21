package com.lee.spring002.aop.xml.exception;


public class StuDAOImpl implements IStuDAO {

	@Override
	public String saveStu() {
		int a = 1 / 0;
		return "saveStu successfully";
	}

	@Override
	public String updateStu() {
		int a = 1 / 0;
		return "updateStu successfully";
	}

	@Override
	public String deleteStu() {
		int a = 1 / 0;
		return "deleteStu successfully";
	}

	@Override
	public String getStu() {
		int a = 1 / 0;
		return "getStu successfully";
	}

	@Override
	public String login(String username) {
		return  username + "login success";
	}

}
