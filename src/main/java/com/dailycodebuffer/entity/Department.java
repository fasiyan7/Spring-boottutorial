package com.dailycodebuffer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long departmentid;
	private String departmentname;
	private String departmentaddress;
    private String departmentcode;
	public long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(long departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public String getDepartmentcode() {
		return departmentcode;
	}
	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}
	public Department(long departmentid, String departmentname, String departmentaddress, String departmentcode) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.departmentaddress = departmentaddress;
		this.departmentcode = departmentcode;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", departmentaddress=" + departmentaddress + ", departmentcode=" + departmentcode + "]";
	}
    
	

}
