package it.dg.restController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import it.dg.pojo.User;
import restServicesInterfaces.LoginServiceInterface;


/*
 * Il controller è una interfaccia che riceve una richiesta HTTP
 */


@RestController
public class LoginController {

	@Autowired
	private LoginServiceInterface rws;
	
	@Autowired
	private HomeController homeController;
	
	
	/* 		Web Application JSP		*/

	// pagina login in GET
	@RequestMapping("/login")
	public ModelAndView login(HttpSession session) {
		return new ModelAndView("login");
	}
	
	// form invio dati login POST
	@RequestMapping("/loginForm")
	public ModelAndView loginForm(String email, String pwd, HttpSession session) {
		try{
			if((email==null || email.equals("")) && (pwd==null || pwd.equals("")))
				return new ModelAndView("login");
			
			// chiama il metodo "findUserForLoginService" per effettuare la login
			User logUser = rws.findUserForLoginService(email, pwd); 
				// setto la session dell'utente che si logga
				session.setAttribute("idUtente", logUser.getIduser());
				
			if(session.getAttribute("idUtente") != null){
				return homeController.homeGet(logUser, session);
			} else {
				return new ModelAndView("login");
			}	
		} catch(Exception e){
			return new ModelAndView("login");
		}
	}


	
	/*		Json ex		*/
	
	@RequestMapping("/getUsers")
	public List<User> getusersJson() {
		return rws.tutti();
	}
	
	@RequestMapping("/getUserById")
	public User getuserJson() {
		return rws.trovaneUnoDaID(1);
	}

	@RequestMapping("/getUser")
	public User getUserJson(User u) {
		return rws.findUserForLoginService(u.getEmail(), u.getPassword());
	}
	
	
	// form invio dati login POST
	@RequestMapping("/loginAndroid")
	public void loginAndroid(@RequestBody(required=false) User u) {
		System.out.println("loginAndroid ok");
		if(u!=null)
			System.out.println("login");
		else
			System.out.println("error");
	}

}
