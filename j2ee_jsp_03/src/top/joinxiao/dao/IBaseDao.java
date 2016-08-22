package top.joinxiao.dao;

import java.util.List;

public interface IBaseDao<E> {
	
	public boolean add(E model);
	
	public boolean update(E model);
	
	public boolean delete(E model);
	
	public List<E> selectAll();
	
	public List<E> selectByCondition(String str);
	
	public E selectById(String id);

}
