package qiye.accountbook.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import qiye.accountbook.dao.BaseDao;
import qiye.accountbook.dao.UserDao;
import qiye.accountbook.domain.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Resource
	private BaseDao<User> baseDao;
	public User selectById(Integer id) {
		// TODO Auto-generated method stub
		return baseDao.selectOne("qiye.accountbook.userMapper.selectUser");
	}

	public User selectOne(User t) {
		// TODO Auto-generated method stub
		return baseDao.selectOne("qiye.accountbook.userMapper.selectUser",t);
	}

	public List<User> selectList(String mapperId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insert(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer delete(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteById(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer selectCount(String mapperId) {
		// TODO Auto-generated method stub
		return null;
	}

}
