package qiye.accountbook.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import qiye.accountbook.dao.Dao;
import qiye.accountbook.domain.User;
import qiye.accountbook.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private Dao<User> userDao;

	public User getUser(User u) {
		// TODO Auto-generated method stub
		User o = userDao.selectOne(u);
		System.out.println("username1:"+u.toString());
		return o;
	}

}
