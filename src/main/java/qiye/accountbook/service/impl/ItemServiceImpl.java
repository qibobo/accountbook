package qiye.accountbook.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import qiye.accountbook.dao.ItemDao;
import qiye.accountbook.domain.Item;
import qiye.accountbook.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService{
	@Resource
	private ItemDao itemDao;
	public Integer getCount() {
		// TODO Auto-generated method stub
		return this.itemDao.selectCount("");
	}

	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		return this.itemDao.selectList("");
	}

	public Integer insertItem(Item i) {
		// TODO Auto-generated method stub
		return itemDao.insert(i);
	}

}
