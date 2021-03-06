package com.lan.tong.weaudit.domain;
// Generated 2017-7-29 17:34:30 by Hibernate Tools 3.4.0.CR1

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee generated by hbm2java
 */
public class Employee extends DataSupport {



	private Integer id;
	private String employeeName;
	private String employeePhone;
	private String employeePicture;
	private List<Make> make = new ArrayList<>();//一个员工对应多条生产记录


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public List<Make> getMake() {
		return make;
	}

	public void setMake(List<Make> make) {
		this.make = make;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePhone() {
		return this.employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeePicture() {
		return this.employeePicture;
	}

	public void setEmployeePicture(String employeePicture) {
		this.employeePicture = employeePicture;
	}
}
