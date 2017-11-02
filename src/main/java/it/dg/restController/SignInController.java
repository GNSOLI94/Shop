package it.dg.restController;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import it.dg.pojo.User;
import restServicesInterfaces.LoginServiceInterface;


@RestController()
public class SignInController {

	
	@Autowired
	private LoginServiceInterface rws;
	
	
	// register page
	@RequestMapping("/register")
	public ModelAndView signIn() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView registerUser(String email, String pwd, String nome, String cognome) {
		try{
			
			// prendo i parametri che mi vengono passati dalla form di registrazione
			User user = new User();
			
			if(ifIsEmpty(email))
				user.setEmail(email);
			
			if(ifIsEmpty(pwd))
				user.setPassword(pwd);
			
			if(ifIsEmpty(nome))
			user.setNome(nome);
			
			if(ifIsEmpty(cognome))
			user.setCognome(cognome);
			
			SimpleDateFormat sdf = new SimpleDateFormat();
			String sdformat = sdf.format(new Date());
			user.setDataUserCreato(sdformat);
			
			// chiama il metodo "insertNewUserService" per inserire un nuovo utente nel db
			rws.insertNewUserService(user); 
			
			return new ModelAndView("registerOk");
		} catch(Exception e){
			return new ModelAndView("register");
		}
	}
	
	// se la registrazione è avvenuta con successo:
	@RequestMapping("/registerOk")
	public ModelAndView signInOk() {
		return new ModelAndView("registerOk");
	}
	
	
	public boolean ifIsEmpty(String campo) throws Exception{
		if(StringUtils.isEmpty(campo))
			throw new Exception();
		else 
			return true;
	}
}
