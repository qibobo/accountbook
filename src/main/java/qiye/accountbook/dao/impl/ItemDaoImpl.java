package qiye.accountbook.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import qiye.accountbook.dao.BaseDao;
import qiye.accountbook.dao.ItemDao;
import qiye.accountbook.domain.Item;
@Repository("itemDao")
public class ItemDaoImpl implements ItemDao{
	@Resource
	private BaseDao<Item> baseDao;
	
	public void setBaseDao(BaseDao<Item> baseDao) {
		this.baseDao = baseDao;
	}

	public Item selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Item selectOne(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> selectList(String mapperId) {
		// TODO Auto-generated method stub
		return baseDao.selectList("qiye.accountbook.itemMapper.selectItemList");
	}

	public Integer insert(Item t) {
		// TODO Auto-generated method stub
		return baseDao.insert("qiye.accountbook.itemMapper.insertItem", t);
	}

	public Integer update(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer delete(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteById(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer selectCount(String mapperId) {
		// TODO Auto-generated method stub
		return this.baseDao.selectCount("qiye.accountbook.itemMapper.selectItemCount");
	}

}
