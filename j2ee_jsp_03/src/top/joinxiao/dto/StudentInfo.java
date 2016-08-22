package top.joinxiao.dto;

import java.io.Serializable;
import java.sql.Date;

public class StudentInfo implements Serializable{
	
	private String stuId;
	private String stuName;
	private String stuSex;
	private Date stuBirthday;
	private String stuNation;
	private String classId;
	private String stuAddress;
	
	public StudentInfo() {}

	public StudentInfo(String stuId, String stuName, String stuSex,
			Date stuBirthday, String stuNation, String classId,
			String stuAddress) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuBirthday = stuBirthday;
		this.stuNation = stuNation;
		this.classId = classId;
		this.stuAddress = stuAddress;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public Date getStuBirthday() {
		return stuBirthday;
	}

	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}

	public String getStuNation() {
		return stuNation;
	}

	public void setStuNation(String stuNation) {
		this.stuNation = stuNation;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	
}
