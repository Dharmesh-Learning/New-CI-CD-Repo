package com.GraphQl.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SchoolInformation")
public class SchoolInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int schoolInfoId;
	

	private String schoolName;
	private String schoolAddress;
	private String schoolType;
	
	public int getSchoolInfoId() {
		return schoolInfoId;
	}
	public void setSchoolInfoId(int schoolInfoId) {
		this.schoolInfoId = schoolInfoId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	public SchoolInfo(int schoolInfoId, String schoolName, String schoolAddress, String schoolType) {
		super();
		this.schoolInfoId = schoolInfoId;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolType = schoolType;
	}
	public SchoolInfo() {
		super();
	}
}
