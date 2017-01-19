package qiye.accountbook.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import qiye.accountbook.dao.impl.ItemDaoImpl;
import qiye.accountbook.domain.Item;
import qiye.accountbook.test.util.SpringUtil;

public class ItemDaoTest {
	private ItemDaoImpl itemDao;
	private SqlSessionFactory factory;
	private BaseDao<Item> baseDao;
	
	@Before
	public void setUp(){
		factory = (SqlSessionFactory)SpringUtil.getBean("sqlSessionFactory");
		baseDao = new BaseDao<Item>();
		baseDao.setSqlSessionFactory(factory);
		itemDao = new ItemDaoImpl();
		itemDao.setBaseDao(baseDao);
	}
	@Test
	public void insertItemTest(){
		itemDao.selectCount("");
	}
}
