package it.dg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.dg.pojo.User;


/*
 * L’annotazione @Repository definisce le classi dello strato di persistenza, ossia i cosiddetti DAO (Data Access Object).
 * Qui si possono definire query custom per interrogare il db.
 * 
 */

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	
	@Query("SELECT x FROM User x WHERE x.iduser=:id")
	public User trovaneUnoDaID(@Param("id") int id);

	@Query("SELECT u FROM User u WHERE u.email=:email and u.password=:pwd")
	public User findUserForLogin(@Param("email") String email, @Param("pwd") String password);
	
	
}
