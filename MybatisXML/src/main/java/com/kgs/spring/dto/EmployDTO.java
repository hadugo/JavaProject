package com.kgs.spring.dto;

public class EmployDTO {

	private String employCode;
	private String employName;
	
	public EmployDTO() {
	}

	public EmployDTO(String employCode, String employName) {
		super();
		this.employCode = employCode;
		this.employName = employName;
	}

	public String getEmployCode() {
		return employCode;
	}

	public String getEmployName() {
		return employName;
	}

	public void setEmployCode(String employCode) {
		this.employCode = employCode;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	@Override
	public String toString() {
		return "EmployDTO [employCode=" + employCode + ", employName=" + employName + "]";
	}
			
}
