package it.dg.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.dg.pojo.RisorsaWeb;
import restServicesInterfaces.RisorsaWebServiceInterface;

@RestController
public class RController {


	@Autowired
	private RisorsaWebServiceInterface rws;

	@RequestMapping("/getRisorse")
	public List<RisorsaWeb> getRisorse() {
		return rws.getRisorse(); 
	}

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");

	}

}
