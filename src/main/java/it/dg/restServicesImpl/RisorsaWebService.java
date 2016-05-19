package it.dg.restServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dg.pojo.RisorsaWeb;
import it.dg.repository.RisorsaWebRepository;
import restServicesInterfaces.RisorsaWebServiceInterface;

@Service
public class RisorsaWebService implements RisorsaWebServiceInterface{

	
	@Autowired
	private RisorsaWebRepository rws;

	public List<RisorsaWeb> getRisorse() {
		System.out.println("chiamato getRisorse");
		return rws.findAll();
		
	}
	
	
	
}
