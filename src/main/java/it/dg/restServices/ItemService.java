package it.dg.restServices;

import org.springframework.stereotype.Service;

import it.dg.pojo.Item;

@Service("itemService")
public class ItemService {

	public Item createNewItem() {
		return new Item("J", "Son", "25/05/1945");
	}
}
