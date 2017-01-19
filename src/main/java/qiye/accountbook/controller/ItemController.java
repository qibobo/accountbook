package qiye.accountbook.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import qiye.accountbook.domain.Item;
import qiye.accountbook.service.ItemService;

@Controller
@RequestMapping("/operation")
public class ItemController {
	@Resource
	private ItemService itemService;
	@RequestMapping(value="/listItems",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getItems(){
		Map<String,Object> map = new HashMap<String,Object>();
		
		List<Item> list = this.itemService.getItemList();
		Integer recordsTotal = this.itemService.getCount();
		
		map.put("draw", 1);
		map.put("recordsTotal", recordsTotal);
		map.put("recordsFiltered", recordsTotal);
		map.put("data", list);
		return map;
	}
	@RequestMapping(value="/addItem",method=RequestMethod.POST)
	@ResponseBody
	public Integer addItem(@RequestParam("name") String name, @RequestParam("categoryId") int categoryId, @RequestParam("amount") BigDecimal amount,@RequestParam("remark") String remark){
		Item item = new Item(amount,categoryId,name,remark);
		return this.itemService.insertItem(item);
	}

}
