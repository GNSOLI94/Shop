package it.dg.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * MODEL foto
 * deve rispettare gli stessi campi che sono salvati nel db
 */

@Entity
@Table(name="foto")
public class FotoBean {

	@Id
	public int idFoto;
	public String descrizione;
	public String password;
	
	
	public int getIdFoto() {
		return idFoto;
	}
	public void setIdFoto(int idFoto) {
		this.idFoto = idFoto;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
