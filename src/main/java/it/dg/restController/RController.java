package it.dg.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.dg.pojo.Item;
import it.dg.restServices.ItemService;

@RestController
public class RController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");

	}

	@RequestMapping(value = "/jsonGet", method = RequestMethod.GET)
	public Item jsonGet() {
		return itemService.createNewItem();
	}
}
