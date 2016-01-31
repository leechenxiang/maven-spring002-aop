package com.lee.spring002.aop.xml.excutingtime;


public class DepartmentServiceImpl implements IDepartmentService {
	
	private IDepartmentDAO departmentDAO;

	@Override
	public void saveDepartment() throws InterruptedException {
		System.out.println(departmentDAO.saveDepartment());
	}

	@Override
	public void updateDepartment() throws InterruptedException {
		System.out.println(departmentDAO.updateDepartment());
	}

	@Override
	public void deleteDepartment() throws InterruptedException {
		System.out.println(departmentDAO.deleteDepartment());
	}

	@Override
	public void getDepartment() throws InterruptedException {
		System.out.println(departmentDAO.getDepartment());
	}

	public IDepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}

	public void setDepartmentDAO(IDepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

}
