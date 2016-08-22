package top.joinxiao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import top.joinxiao.dao.IStudentDao;
import top.joinxiao.dto.StudentInfo;

public class StudentDao implements IStudentDao{

	@Override
	public boolean add(StudentInfo model) {
		Connection conn=null;
		PreparedStatement ps=null;
		String sql ="insert into 学生信息(学号,姓名,性别,出生日期,)";
		return false;
	}

	@Override
	public boolean update(StudentInfo model) {
		return false;
	}

	@Override
	public boolean delete(StudentInfo model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentInfo> selectByCondition(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentInfo selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentInfo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
