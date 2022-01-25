package beans;

import java.io.Serializable;

public class Utilisateur implements Serializable{
	private String nom;
	private String prenom;
	private String email;
	
	
	public Utilisateur() {

	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String afficher() {
		return String.format("%s %s (%s)", prenom, nom, email);
	}
	
	
	
	
	

}
