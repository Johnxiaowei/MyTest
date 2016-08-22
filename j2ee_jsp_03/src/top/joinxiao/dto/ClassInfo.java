package top.joinxiao.dto;

import java.io.Serializable;

public class ClassInfo implements Serializable{
	
	private String classId;
	private String className;
	private int classSum;
	private String facultyId;
	private String teacher;
	
	public ClassInfo() {}

	public ClassInfo(String classId, String className, int classSum,
			String facultyId, String teacher) {
		this.classId = classId;
		this.className = className;
		this.classSum = classSum;
		this.facultyId = facultyId;
		this.teacher = teacher;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassSum() {
		return classSum;
	}

	public void setClassSum(int classSum) {
		this.classSum = classSum;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
}
