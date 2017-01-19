package qiye.accountbook.service;

import java.util.List;

import qiye.accountbook.domain.Item;

public interface ItemService {
	public Integer getCount();

	public List<Item> getItemList();
	
	public Integer insertItem(Item i);
}
