package com.GraphQl.Model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	

	@OneToOne(targetEntity=Password.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "PasswordId")
	@Fetch(FetchMode.JOIN)
	private Password password;


	@OneToOne(targetEntity=SchoolInfo.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "SchoolInfoId")
	@Fetch(FetchMode.JOIN)
	
	private SchoolInfo schoolInfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Password getPassword() {
		return password;
	}
	public void setPassword(Password password) {
		this.password = password;
	}
	public SchoolInfo getSchoolInfo() {
		return schoolInfo;
	}
	public void setSchoolInfo(SchoolInfo schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	public Users(int id, String firstName, String lastName, Password password, SchoolInfo schoolInfo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.schoolInfo = schoolInfo;
	}
	public Users() {
		super();
	}
	
	public static Users createUserObject(int id,String firstName,String lastName,int passwordId,String passwords,int schoolId, String schoolName,String schoolAddress,String schoolType) {
		Users user = new Users();
		user.id = id;
		user.firstName = firstName;
		user.lastName = lastName;
		user.setPassword(new Password(passwordId, passwords));
		user.setSchoolInfo(new SchoolInfo(schoolId, schoolName, schoolAddress, schoolType));
		return user;
	}
	
}
