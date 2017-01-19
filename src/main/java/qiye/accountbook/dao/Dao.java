package qiye.accountbook.dao;

import java.util.List;

public interface Dao<T> {

	public T selectById(Integer id);

	public T selectOne(T t);

	public List<T> selectList(String mapperId);
	
	public Integer selectCount(String mapperId);

	public Integer insert(T t);

	public Integer update(T t);

	public Integer delete(T t);

	public Integer deleteById(T t);

}
