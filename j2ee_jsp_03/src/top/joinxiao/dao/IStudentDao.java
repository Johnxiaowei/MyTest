package top.joinxiao.dao;

import top.joinxiao.dto.StudentInfo;


public interface IStudentDao extends IBaseDao<StudentInfo> {
//	自定义自己的方法
	public boolean checkLogin(String name,String pwd);
	
	
}
