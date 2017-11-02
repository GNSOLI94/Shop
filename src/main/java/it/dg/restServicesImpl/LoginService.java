package it.dg.restServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.dg.pojo.User;
import it.dg.repository.UserRepo;
import restServicesInterfaces.LoginServiceInterface;


/*
 * In questa classe si va a sviluppare la logica del controller
 */

@Service
public class LoginService implements LoginServiceInterface {

	@Autowired
	private UserRepo ur;


	public List<User> tutti() {
		return ur.findAll();
	}


	public List<User> test() {
		return ur.findAll();
	}

	/* 		WEB APP		*/
	
	// restituisce un record da id
	public User trovaneUnoDaID(int id) {
		return ur.trovaneUnoDaID(id);
	}

	public User findUserForLoginService(String email, String password){
		return ur.findUserForLogin(email, password);
	}

	public User insertNewUserService(User u) {
		return ur.save(u);
	}



	
}
