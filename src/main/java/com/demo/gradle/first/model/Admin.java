package com.demo.gradle.first.model;

public class Admin {
	
	private int admin_Id;
	private String admin_Name;
	
	public Admin() {
		super();
	}

	public Admin(int admin_Id, String admin_Name) {
		super();
		this.admin_Id = admin_Id;
		this.admin_Name = admin_Name;
	}

	public int getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(int admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getAdmin_Name() {
		return admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}

	@Override
	public String toString() {
		return "Admin [admin_Id=" + admin_Id + ", admin_Name=" + admin_Name + "]";
	}
	

}
