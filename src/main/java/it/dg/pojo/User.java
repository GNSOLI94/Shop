package it.dg.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * MODEL dello user 
 * deve rispettare gli stessi campi che sono salvati nel db
 */

@Entity
@Table(name="user")
public class User {

	@Id
	public int iduser;
	public String email;
	public String password;
	public String nome;
	public String cognome;
	public String dataUserCreato;

	
	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataUserCreato() {
		return dataUserCreato;
	}

	public void setDataUserCreato(String dataUserCreato) {
		this.dataUserCreato = dataUserCreato;
	}

	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", email=" + email + ", password=" + password + ", nome=" + nome
				+ ", cognome=" + cognome + ", dataUserCreato=" + dataUserCreato + "]";
	}

	
}
