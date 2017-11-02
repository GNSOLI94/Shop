package restServicesInterfaces;


import java.util.List;

import it.dg.pojo.User;

/*
 * In questa classe si instanzieranno tutti i metodi che andranno ad operare sul db.
 * Una volta istanziati andranno implementati nel service
 */


public interface LoginServiceInterface {
	

	public List<User> tutti();
	
	public List<User> test();
	
	public User trovaneUnoDaID(int id);

	public User findUserForLoginService(String email, String password);
	
	public User insertNewUserService(User u);
}
